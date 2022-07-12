-- �Լ�
/*
    <�Լ�>
    Į������ �о ��� ����� ��ȯ
    - ������ �Լ� : N���� ���� �а� N���� ��� ����(�� �ึ��, �Լ� ���� -> ��� ��ȯ)
    - �׷� �Լ� : N���� ���� �а� 1���� ��� ����(�ϳ��� �׷� ���� �Լ� ���� -> ��� ��ȯ)
    
    SELECT���� ������ �Լ��� �׷� �Լ��� �Բ� ����� �� ����(��� ���� ������ �ٸ��Ƿ�)
    �Լ��� ����� �� �ִ� ��ġ�� SELECT, WHERE, ORDER BY, HAVING ���� ����� �� �ִ�.
*/

----------------------- ������ �Լ�----------------------------

/*
    <���� ���� �Լ�>
    1) LENGTH / LEGNTHB
    - LENGTH(Į�� | '���ڿ�') : ���� �� ��ȯ
    - LENGTHB(Į�� | '���ڿ�') : ������ ����Ʈ �� ��ȯ
        �ѱ� : 3BYTE
        ������, ����, Ư������ : 1BYTE
    * DUAL ���̺�
    - SYS ����ڰ� �����ϴ� ���̺�
    - SYS ����ڰ� ����������, ��� ����ڰ� ������ �����Ѵ�.
    - �� ��, �� Į���� ������ �ִ� DUMMY ���̺��̴�.
    - ����ڰ� �Լ��� ����� �� �ӽ÷� ����ϴ� ���̺�.
    
    
*/
SELECT * FROM DUAL;

SELECT LENGTH('�ȳ�'),LENGTHB('�ȳ�')
FROM DUAL
;

SELECT LENGTHB('�ȳ�')
FROM DUAL
;

SELECT 
LENGTH (EMPNO), LENGTHB(ENAME)
FROM EMP;

/*
    2) INSTR
    - INSTR (Į�� | '���ڿ�', ã����[, POSITION(==� ��ġ���� �������� ���� ����)],[OCCURENCE==���° Ÿ������]])
    Į��|���ڿ� �� ã�� ���� ������ �����ϸ� ������ ���� ������ ���û���
    
    - ������ ��ġ���� ������ ���� ��°�� ��Ÿ���� ������ ���� ��ġ�� ��ȯ
*/

SELECT INSTR('AABAACAABBAA', 'B') FROM DUAL; --3 : B�� ��ġ
SELECT INSTR('AABAACAABBAA', 'B', 1) FROM DUAL; --3 : B�� ��ġ
SELECT INSTR('AABAACAABBAA', 'B', 1,2) FROM DUAL; --9 : B�� ��ġ(2��° B)
SELECT INSTR('AABAACAABBAA', 'B',-1) FROM DUAL; --10 : B�� ��ġ(�ڿ������� ù��°)
SELECT INSTR('AABAACAABBAA', 'B',-1,3) FROM DUAL; --3 : B�� ��ġ(�ڿ������� ����°)
SELECT INSTR('AABAACAABBAA', 'B',5) FROM DUAL;-- 5�� �ټ���°���� Ž���� �ϰڴٴ� ��
SELECT INSTR('AABAACAABBAA', 'B',5,2) FROM DUAL;
SELECT INSTR('AABAACAABBAA', 'B',-4) FROM DUAL;--B�� ã���ǵ� �ڿ������� 4��°�� ������ ã�ڴٴ� ��

/*
    3) LPAD / RPAD
    - LPAD|RPAD (Į��|���ڿ� , ����(����Ʈ) [, ����]) 
    - ���õ� Į��|���ڰ��� ������ ���ڸ� ���� �Ǵ� �����ʿ� ���ٿ� ���� N ���� ��ŭ�� ���ڿ� ��ȯ
    - ���ڿ� ���� ���ϰ� �ְ� ǥ���ϰ��� �� �� ����Ѵ�.
*/

-- 20��ŭ�� ���� �� ENAME ���� ������ ����, ������ �������� ä���
SELECT LPAD(ENAME, 20)
FROM EMP;

-- 20��ŭ�� ���� �� ENAME ���� ������ ����, ������ '#'���� ä���
SELECT LPAD(ENAME, 10,'#')
FROM EMP;

-- 10��ŭ�� ���� �� ENAME ���� ���� ����, �������� �������� ä���
SELECT RPAD(ENAME, 10)
FROM EMP;

-- 10��ŭ�� ���� �� ENAME ���� ���� ����, �������� '@'���� ä���
SELECT RPAD(ENAME, 10,'@')
FROM EMP;

/*
    4) LTRIM / RTRIM
    - LTRIM / RTRIM(Į��|���ڰ�[, ���Ź���1])
    - ���ڿ��� ���� Ȥ�� �����ʿ��� �����ϰ��� �ϴ� ���ڵ��� ã�Ƽ� ������ ��� ��ȯ
    - �����ϰ��� �ϴ� ���ڰ��� ���� �� �⺻������ ���� ����
*/

SELECT LTRIM ('       HELLO          ') FROM DUAL; -- ���ʿ� �ִ� ���鹮�� ��������
SELECT RTRIM ('       HELLO          ') FROM DUAL; -- ���ʿ� �ִ� ���鹮�� ��������

SELECT LTRIM ('00000001230000000',0) FROM DUAL; --���� ���� 0 ���ֱ�
SELECT RTRIM ('00000001230000000',0) FROM DUAL; --������ ���� 0 ���ֱ�

SELECT LTRIM('12345',3) FROM DUAL; --���� �Ǵ� ������ �� ���� �ƴϹǷ� ���ϴ� �� �ȳ���
SELECT LTRIM('12345',5) FROM DUAL;

/*
    5) TRIM
    - TRIM ([LEADING | TRAILING | BOTH] ���Ź��� FROM Į�� | ����)
    - ���� ��/��/���� ������ ���ڸ� �����ϰ� ������ ��ȯ
    - �����ϰ��� �ϴ� ���� ���� ��, ������ ����
    - �����ϸ� LTRIM / RTRIM �̿��ϴ°� �� ����.
*/

SELECT '     �ȳ�      ' FROM DUAL;
SELECT TRIM ('     �ȳ�      ') FROM DUAL;-- �յ� ���� ����
SELECT TRIM ('Z' FROM 'ZZZHELLOZZZ') FROM DUAL;
SELECT TRIM (LEADING 'Z' FROM 'ZZZHELLOZZZ') FROM DUAL; -- ���� �ڸ���
SELECT TRIM (TRAILING 'Z' FROM 'ZZZHELLOZZZ') FROM DUAL; -- ������ �ڸ���

/*
        6) SUBSTR
        - SUBSTR(Į�� | ���ڰ�, POSITION [,LENGTH])
        - ���� �����Ϳ��� ������ ��ġ���� ������ ������ŭ�� ���ڿ� �����ؼ� ��ȯ
*/

SELECT 'HELLO WORLD' FROM DUAL;
SELECT SUBSTR('HELLO WORLD',3) FROM DUAL;
SELECT SUBSTR('HELLO WORLD',3, 5) FROM DUAL; -- 3��°���� 5�� ����
SELECT SUBSTR('HELLO WORLD',-5) FROM DUAL; --�ڿ������� 5��° ���� ����
SELECT SUBSTR('HELLO WORLD',-5,3) FROM DUAL;--( '�� ', �ڸ��� ������ ��ġ, �ڸ� ����) 

/*
    7) LOWER / UPPER / INITCAP
*/

SELECT 'Hello World ! ' FROM DUAL;
SELECT LOWER ('Hello World !') FROM DUAL; --��� �ҹ��ڷ�
SELECT UPPER ('Hello World ! ') FROM DUAL; --��� �빮�ڷ�
SELECT INITCAP('asdf ! ') FROM DUAL; -- �� �ո� �빮�ڷ�

/*
    8) CONCAT
    - CONCAT (Į�� | ���ڰ�, Į��|���ڰ�)
    - ���ڵ����� �� �� �޾Ƽ� ������
    - || <- ����ϴ°� �� ����!

*/
SELECT CONCAT ('AAA', 'DDD') 
FROM DUAL;

SELECT 'AAA'||'DDD'
FROM DUAL;

/*
    9) REPLACE
    - REPLACE(Į�� | ���ڰ�, TARGET, STR)
    - Į�� �Ǵ� ���ڰ����� TRARGET �� STR�� �����Ͽ� ��ȯ
    
*/

SELECT '����� ������ ���ﵿ' FROM DUAL;
SELECT REPLACE ('����� ������ ���ﵿ', '�����', '����Ư����') FROM DUAL;

SELECT '�ȳ��ϼ��� �ȳ���������' FROM DUAL;

-- �߰��� �ִ� Ư�� ���� ����� ���� ��!
SELECT REPLACE  ('�ȳ��ϼ��� �ȳ���������', '�ȳ�','') FROM DUAL; -- �ȳ� ã�Ƽ� �� ���ڿ��� �ٲ����.

SELECT INITCAP('hello wirld,sdf/sdf-dfff,zxc������xxx!') from dual; -- �ܾ� ����()���� ó��.


-----------------------------------------���ڰ��� �Լ�

/*
    1) ABS(NUMBER)
    - ABS(NUMBER)
    - ���� ���ϴ� �Լ�
    
*/
SELECT ABS(-7) FROM DUAL;

/*
   2) MOD
    MOD(NUMBER, NUMBER)
    
*/
-- SELECT 10%3 FROM DUAL; -- �ڹٿ��� ó�� % �̿��ϸ� �����߻�
 SELECT MOD(10,3) FROM DUAL; -- ������ ���ϰ� ���� �� ��



/*
 3) ROUND
 - ROUND(NUMBER[, ��ġ])
 - �ݿø�
 - ��ġ : �⺻�� 0 ( 0 = ���� ����)
*/

SELECT ROUND(123.456) FROM DUAL; -- ROUND�� �ݿø�
SELECT ROUND(123.456, 1) FROM DUAL; -- ,1 �� ��� �ڸ����� �ݿø��� �� ����
SELECT ROUND(123.456, 4) FROM DUAL;
SELECT ROUND(123.456,-1) FROM DUAL;-- �Ҽ��� �������� ���ʺ��� �ݿø�
SELECT ROUND(123.456,-2) FROM DUAL;
SELECT ROUND(123.456,-3) FROM DUAL;
SELECT ROUND(345.345,-3) FROM DUAL;

/*
        4) CEIL
        - CEIL(NUMBER)
        - (�Ҽ��� ���� ������)������ �ø�
*/

SELECT CEIL(123.456) FROM DUAL;

/*
        4) FLOOR
        - FLOOR(NUMBER)
        - (�Ҽ��� ���� ������)������ ����
*/
SELECT FLOOR(123.987) FROM DUAL;

/*
        6) TRANC
        - TRANC
        - ��ġ �����Ͽ� (�׳�) ����.
        - ������ ������ ����
*/

SELECT TRUNC(123.456) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;-- �Ҽ��� �Ʒ� ��ġ�� ������ �� ����.
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, -2) FROM DUAL;

/*
        ��¥ ���� �Լ�
        
        1) SYSDATE
        - �ý����� ���� ��¥�� �ð� ��ȯ

*/
SELECT SYSDATE FROM DUAL;

/*
        2) MONTHS_BTWEEN
        - �� ��¥ ������ ���� ���� ����
        - ���ϰ��� NUMBER

*/
SELECT ENAME, FLOOR( MONTHS_BETWEEN (SYSDATE,HIREDATE)) �ٹ�������, HIREDATE �Ի���
FROM EMP;

/*
        3) ADD_MONTHS
        - Ư�� ���� ���� ������.
        - ���ϰ� : DATE
*/

SELECT ADD_MONTHS(SYSDATE, 6) FROM DUAL;
SELECT ADD_MONTHS('2002/12/31', 6) FROM DUAL;

/*
        4) NEXT_DAY
        [����]
            NEXT_DAY(DATE, ����(����|����))
        - DATE ���� ���� ����� ���� ���� ����
*/
SELECT SYSDATE, NEXT_DAY(SYSDATE, '�����') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '������') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 1) FROM DUAL;-- '1'�� �Ͽ��Ϸ� ���� �Ǿ�����
-- SELECT SYSDATE, NEXT_DAY(SYSDATE, 'SUNDAY') FROM DUAL;-- ����� �Ϸ��� ��� ���� �����ؾ� ��

ALTER SESSION SET NLS_LANGUAGE = AMERICAN;-- ����

SELECT SYSDATE, NEXT_DAY(SYSDATE, 'SUN') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'FRI') FROM DUAL;

ALTER SESSION SET NLS_LANGUAGE = KOREAN;-- ����
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��') FROM DUAL;

/*
        LAST_DAY
        - �ش� ���� ������ ��¥ ����
*/

SELECT LAST_DAY (SYSDATE) FROM DUAL; -- �̹� ���� ������ ��¥
SELECT LAST_DAY ('2002/03/01') FROM DUAL;
SELECT LAST_DAY ('2022/08/01') FROM DUAL;

/*
    EXTRACT
    - EXTRACT( YEAR | MONTH | DAY FROM DATE )
    - ����Ÿ���� NUMBER
*/

SELECT EXTRACT(YEAR FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(MONTH FROM SYSDATE) FROM DUAL;
SELECT EXTRACT(DAY FROM SYSDATE) FROM DUAL;

-- ��¥ ���� ����
SELECT SYSDATE FROM DUAL;

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD HH:MI:SS AM';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';


------------------------------------------------------------------
/*
    ����ȯ �Լ�
    
    1) TO_CHAR
    - ���� ���� ��¥��
*/
-- ���� -> ����
SELECT 1234 FROM DUAL; -- ���ڴ� ���������� ��
SELECT TO_CHAR(1234, '999999')FROM DUAL; -- 6ĭ�� ���� Ȯ��, ��ĭ�� �������� ä��
SELECT TO_CHAR(1234, '000000')FROM DUAL; -- 6ĭ�� ���� Ȯ��, ��ĭ�� 0���� ä��
SELECT TO_CHAR(1234, 'L999999')FROM DUAL; -- ���� ������ ������ ȭ�����
SELECT TO_CHAR(1234, '$999999')FROM DUAL; -- �޷��� ǥ��
SELECT TO_CHAR(1234, 'L999,999')FROM DUAL; -- 6¥�� ���� ������, �޸����

-- ��� ���̺� �޿� ��ȸ
SELECT EMPNO, ENAME, TO_CHAR(SAL, 'L99,999,999')
FROM EMP
;

-- ��¥ -> ����
SELECT SYSDATE FROM DUAL;
SELECT TO_CHAR(SYSDATE) FROM DUAL; -- ���� ���ϴ� ������ �������� ������� �� ���
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS AM') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS AM') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON DY , YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'MON DAY , YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD(DY)') FROM DUAL;



/*
    2) TO_DATE
    
*/
-- ���� > ��¥
SELECT TO_DATE(20220706) FROM DUAL;

-- ���� > ��¥
SELECT TO_DATE('20220706') FROM DUAL;
SELECT TO_DATE('2022/07/06') FROM DUAL;
SELECT TO_DATE('2022-07-06') FROM DUAL;
SELECT TO_DATE('2022.07.06') FROM DUAL;

/*
    3) TO_NUMBER
    - ���ڿ� �����͸� ���ڷ� �ٲ���.
*/
SELECT TO_NUMBER('123456789') FROM DUAL; --���������� �Ǹ� ����!
SELECT '123' + '456' FROM DUAL; -- �� �� ���ڿ������� �ڵ����� ����Ÿ������ ����ȯ �� ����ó��
--SELECT '123' + '456A' FROM DUAL;-- ���� : ���ڸ� ���� �� �ڵ�ó�� ������ ���� ������ ������
SELECT '10,000' + '20,000' FROM DUAL;
SELECT TO_NUMBER('10,000', '99,999,999') + TO_NUMBER('20,000','99,999') FROM DUAL;
--SELECT TO_NUMBER('10,000','99,999,999'+ TO_NUMBER('20,000', '99,999') FROM DUAL;

/*
  NULLó�� �Լ�
  [����]
  
    NVL(Į��, NULL ��ü��)
    
    - NULL�� �Ǿ� �ִ� Į���� ���� ���ڷ� ������ ������ �����Ͽ� ��ȯ
  
    NVL2(Į��, ��ü��1, ��ü��2)
    - Į�� ���� NULL�� �ƴϸ� ������ ��1, Į������ NULL�̸� ��ü��2�� ��ȯ�Ѵ�.
    
    NULL IF(�񱳴��1, �񱳴��2)
    - �� ���� ���� �����ϸ� NULL ��ȯ
    - �� ���� ���� �������� ������ �񱳴�� 1 ��ȯ
  
*/

--EMP���̺��� �����, COMM ��ȸ(COMM�� NULL�̸� 0�� ���)
SELECT ENAME, NVL( COMM , 1) -- ���� Ÿ���� ���� �����Ƿ� ���ڴ� �� ��.
FROM EMP;

--EMP ���̺��� �����, (�޿�+COMM)*12 (NULL���� 0���� ó���Ͽ� 4���)
SELECT ENAME,(SAL +NVL(COMM,0))*12 
FROM EMP;

--EMP���̺��� �����, ����, MGR��ȸ (MGR NULL ��� 0���� ��ȸ)
SELECT ENAME, JOB, NVL(MGR,0)
FROM EMP;

SELECT *
FROM EMP;

-- EMP���̺��� �����, (SAL+COMM) AS �޿� ��ȸ(COMM �� NULL�̸� 0����ó��, NULL �ƴϸ� 100 ���� ó��)
SELECT ENAME, COMM, NVL2(COMM, 100, 0) ,SAL+NVL2(COMM, 0, 100) �޿���ȸ
FROM EMP;

-- EMP���̺��� 
SELECT NULLIF(123, 123)
FROM DUAL;

-- EMP���̺��� �����,SAL, (SAL+COMM) AS �޿� ��ȸ(COMM �� NULL�̰ų� 0�̸� 0����ó��, NULL �ƴϸ� 100 ���� ó��)
--SELECT ENAME, SAL, COMM, NVL2(COMM, 100, 0) ,SAL+NVL2(NULLIF(COMM,0), 100, 0) �޿���ȸ -- COMM�� NULL�̸� ��� ���µ� 0�϶��� ���� >> NULL���� 0 ���� �����
-- NULLIF(COMM,0)== COMM���� 0 �� ������ COMM ���� ������, �ٸ��� NULL���� ����!!!!!!!!!!!!!!!!

-- EMP ���̺��� �����, (SAL+COMM) AS �޿� ��ȸ (COMM �� NULL �̰ų� 0�̸� 0���� ó��, �װԾƴ϶�� 100���� ó��)
SELECT ENAME, SAL, COMM, SAL+NVL2(NULLIF(COMM,0), 100, 0) �޿���ȸ
FROM EMP;


/*
    �����Լ�
        �������� ��쿡 ������ �� �� �ִ� ����� �����ϴ� �Լ�
        
    DECODE(Į��|����, ���ǰ�1, �����1, ���ǰ�2, �����2 .....)
        ���ϰ��� �ϴ� ���� ���ǰ��� ��ġ�ϴ� ���, �׿� �ش��ϴ� ������� ��ȯ
*/

-- EMP���̺��� ���, �����, ���� ��ȸ (��, ������ MANAGER�� ��� �Ŵ������ ���, ������ SALESMAN�� ��� ���� �̶�� ���)
SELECT EMPNO, ENAME,  JOB ,DECODE(JOB, 'MANAGER','�Ŵ���','SALESMAN','����','PRESIDENT', '��������Ʈ') -- ���� ���� ���� �� �ڵ尡 ������Ƿ� ������ ���� �������� ����
FROM EMP;

/*
    CASE : ���� �̿��ϹǷ� �� �����ϱ�!
        [����] // IF���� ���?
        CASE WHEN ���ǽ�1 THEN �����1
            WHEN ���ǽ�2 THEN �����2
            WHEN ���ǽ�3 THEN �����3
            ...
            ELSE �����
        END    
            
*/

-- �����, �޿�, ���� ��ȸ(����= SAL 1000�Ʒ��� �ʱ�, 1000~3000�̸� �߱�, �������� ���)
SELECT 
    ENAME
    , SAL
    , CASE 
        WHEN SAL<1000 THEN '�ʱ�'
        WHEN SAL<3000 AND SAL>1000 THEN '�߱�'
        ELSE '���'
    END AS ����
FROM EMP;

-------------------------- �׷��Լ�--------------------------------

/*
    �뷮�� �����͵�� ���質 ��� ���� �۾��� ó���ϴ� ��� ���
    ��� �׷� �Լ��� NULL ���� �ڵ����� �����ϰ� ���� �ִ� �͵鸸 ���
    ���� ������ ����, AVG�Լ� ��� �� �ݵ�� NVL() �Լ��� ����ϴ� ���� ����
*/

/*
    1)SUM
    [����]
         SUM(NUMBER)
         - �ش� Į�� ������ �� ��
*/
SELECT  SUM(COMM) -- ����̸��� ���� �� �ε� SUM�� ���� �ϳ��̱� ���� // ��������� ���簢������ ���;���.
FROM EMP;

-- �μ��ڵ尡 30�� ������� �޿� �հ� ��ȸ
SELECT SUM(SAL)
FROM EMP
WHERE DEPTNO = 30
;
-- COMM�� NULL�� �ƴ� ������� COMM �հ� ��ȸ
SELECT SUM(COMM)
FROM EMP
WHERE COMM IS NOT NULL;

-- ������� S�� �����ϴ� ����� SAL �հ� ��ȸ
SELECT SUM(SAL)
FROM EMP
WHERE ENAME LIKE 'S%';

/*
    2) AVG
        [����]
        AVG(NUMBER)
*/

-- �� ����� �޿� ��� ��ȸ
SELECT AVG(SAL)
FROM EMP
;

-- �� ����� �μ��ڵ尡 30�� ��� �޿� ��� ��ȸ
SELECT AVG(COMM) -- NULL���� �ƿ� ���� �ɷ� ó���� �Ǿ������ ���� ��Ȯ���� ����.
FROM EMP
WHERE DEPTNO = 30;

-- �Ի����ڰ� 81�⵵ ������ ����� �޿� ��� ��ȸ((����m��))
SELECT AVG(SAL)
FROM EMP
--WHERE EXTRACT(YEAR FROM HIREDATE) >= 1981; -- 81������ ÷���� �� �����ϱ� 1981 ����� ��
WHERE HIREDATE > '81/01/01';

/*
    3) MIN / MAX

*/

-- �޿��� ���� ���� �޿� ��ȸ
SELECT MAX (SAL)
FROM EMP
;
-- �޿��� ���� ���� �޿� ��ȸ
SELECT MIN(SAL)
FROM EMP
;

/*
    4) COUNT
        COUNT(..)
        
        - ���� ���� ��ȯ
        - COUNT(Į��) : Į���� NULL�� �ƴ� ���� ������ ��ȯ
        - COUNT(DISTINCT Į��)
*/

--
SELECT 
    COUNT(*)
FROM EMP
WHERE DEPTNO = 30
;

SELECT
    COUNT(COMM)
FROM EMP
;

SELECT
 COUNT (  DISTINCT(DEPTNO)) -- �μ������� �� �� ���� Ȯ�� ����
FROM EMP
;


SELECT TO_CHAR(TO_DATE('210505'), ' YYYY"��"MM"��"DD"��" ' )
FROM DUAL;




















