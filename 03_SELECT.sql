--SELECT 
/*
    SESLECT ��
    [����]
        SELECT Į��1, Į��2, Į��3 ... Į��
        FROM ���̺��;
    - �����͸� ��ȸ�ϰ��� �� �� ���.
    - SELECT�� ���ؼ� ��ȸ�� ����� RESULT SET(��� ����) �̶�� �Ѵ�.
    - ��ȸ�ϰ��� �ϴ� Į������ �ݵ�� FROM���� ����� ���̺� �����ϴ� Į���̾�� �Ѵ�.
*/


-- SELECT == �����͸� ��ȸ, EMP�κ��� ��ȸ�ϰڴ�. * ==��� Į���̶�� ��
SELECT * FROM EMP;

-- ��ȸ�ϰڴ� / �߰��� �ִ� ���ϴ� ������ 
SELECT EMPNO, ENAME, JOB, SAL FROM EMP;

SELECT  MGR, hiredate, COMM, DEPTNO FROM EMP;

--EMP ���̺���, �����ȣ, ����̸�, ���� ��ȸ�ϱ�
SELECT empno, ENAME, SAL FROM EMP;

--SELECT�� ����ġ�� FROM���� �ۼ��ϱ�!!
SELECT * 
FROM EMP;

-- �Ʒ��� ���� ��ҹ��� �������� ����.(���ʻ� �빮�ڷ� ��)
SELECT EMPNO, ename
FROM EMP;


/*
    �������
            SELECT ���� Į���� �Է� �κп��� ��� ������ �̿��ؼ� ��� ��ȸ ����.
*/

-- EMP ���̺��� �����̸�, �������� ��ȸ�ϱ�
SELECT ENAME, SAL *12
FROM EMP;

-- NULL�� �����ص�NULL
SELECT ENAME, COMM *12
FROM EMP;

-- ���� �� NULL ���� �ϳ��� �ִٸ� NULL
SELECT ENAME, (SAL + COMM) *12
FROM EMP;

-- DATE ����( SYSDATE == ���� ��¥) // FLOOR�Լ� ����ؼ� �Ҽ��� ���ֹ���!!!
SELECT ENAME, FLOOR(SYSDATE - HIREDATE)
FROM EMP;

-- Į���� ��Ī ���� : (AS) ���������Ī // AS �� �ᵵ ���� // ���� ������ "" ����
SELECT ENAME, FLOOR(SYSDATE - HIREDATE) "�ٹ� �Ⱓ"
FROM EMP;

-- ��ü������ �̸� (1��ġ �޿� + COMM ) ����Ͽ� ��ȸ 
SELECT ENAME, (SAL + COMM) * 12 AS ���ҵ�
FROM EMP;

-- ���ͷ�
/*
    SELECT ���� ���ͷ��� ����ϸ� ���̺� �����ϴ� ������ó�� ��ȸ ����.
    ���ͷ��� RESULT SET�� ��� �࿡ �ݺ� ��µȴ���.
    �� ��ü�� �ǹ�.
*/
-- EMP ���̺��� ���, �̸�, �޿�(��) ��ȸ. // ���ڿ� '��' �̴ٸ� ��ȸ
-- �Է��� ���� �״�� ����Ʈ ����(������ ����� �̷��� ������ ����.)
SELECT EMPNO, ENAME, SAL, '�� �Դϴ�.' AS "����(����)"
FROM EMP;


/*
    <DISTINCT> == �ߺ�����
    -Į���� ���Ե� �ߺ� ���� �� ������ ǥ���ϰ��� �� �� ���.
    -SELECT ���� �� ���� ��� ����.(���� �� �� ��.)
    -Į���� ���� �� �̸� Į�� ������ ��� �����ؾ� �ߺ� ������ �ǴܵǾ� �ߺ��� ���� ��.
*/

-- EMP ���̺��� ������ ��ȸ(�ߺ�����)
SELECT DISTINCT JOB FROM EMP;

-- JOB DEPTNO�� ������ ����
SELECT DISTINCT JOB, DEPTNO FROM EMP;

-- SELECT DISTINCT JOB, DISTINCT DEPTNO FROM EMP; << ���� �߻�(DISTANCT �� ���� ���)

/*
    <���� ������>
        ���� Į�� ���� �ϳ��� Į���� ��ó�� �����ϰų� �÷��� ���ͷ��� ������ �� �ִ�.
*/

--EMP ���̺��� , ���, �����, �޿��� �����ؼ� ��ȸ // || >> ���ڿ��� ��ġ�� ������ ������ ��.
SELECT EMPNO || ENAME || SAL
FROM EMP;

-- EMP ���̺���, �����, �޿��� ���ͷ��� �����Ͽ� ��ȸ
SELECT ENAME || '�� ������ ' || SAL || '�Դϴ�.'
FROM EMP;

SELECT * FROM EMP;

/*
    < WHERE >
        [����]
        SELECT Į��1, Į��2, ... Į��
        FROM ���̺��
        WHERE ���ǽ�;
        - ��ȸ�ϰ��� �ϴ� ���̺��� �ش� ���ǿ� �����ϴ� ������� ��ȸ�ϰ��� �� �� ����Ѵ�.
        - ���ǽĿ��� �پ��� �����ڵ��� ��� ����
        - �Լ��鵵 ��� ����.   
        
    <�񱳿�����>
     < , > , <=, >= : ��Һ�
     = : ����� (�ڹٿ� �ٸ�)
     !=, ^=, <> : �����ʴ�.
    
*/

-- EMP ���̺��� �μ��ڵ尡 30�� ������� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE DEPTNO = 30;

--EMP ���̺��� �μ��ڵ尡 20�� �ƴ� ������� ��� ����� �μ��ڵ� ��ȸ
SELECT empno, ename, deptno
FROM EMP
WHERE DEPTNO != 20;

--EMP ���̺���, �޿��� 1000�̻��� ���� �̸� ,�μ��ڵ�, �޿� ��ȸ
SELECT ename, deptno, SAL
FROM EMP
WHERE SAL >= 1000;

--1. EMP ���̺��� COMM�� 0�ʰ��� ����� �̸� ,�Ի���, �μ��ڵ�
SELECT ename, hiredate, deptno
FROM EMP
WHERE COMM > 0;

--2. EMP ���̺��� �޿��� 1500 ������ ����� �̸�, �޿�, �μ��ڵ� ��ȸ
SELECT ename, SAL, deptno
FROM EMP
WHERE SAL <= 1500;

SELECT* FROM EMP;

/*
    <��������>
        AND
        OR
    
*/

-- EMP ���̺���, �μ��ڵ尡 30�̸鼭 �޿��� 1000�̻��� ��� ��ȸ
SELECT *
FROM EMP
WHERE DEPTNO = 30 --WHERE �� �ڿ� AND �����ڷ� ���� �߰�
AND SAL >= 1000

-- EMP ���̺��� �޿��� 2000�̻��̸鼭, JOB�� MANAGER�� ��� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE SAL >= 2000 --WHERE �� �ڿ� AND �����ڷ� ���� �߰�
AND JOB = 'MANAGER'
;

--EMP ���̺��� �޿��� 2000�̻��̸鼭 4000������ ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL >= 2000 --WHERE �� �ڿ� AND �����ڷ� ���� �߰�
AND SAL <= 4000;

/*
    <BETWEEN AND>
    [����]
        WHERE �񱳴��Į�� BETWEEN A AND B
    
    - WHERE ������ ���Ǵ� �������� ������ ���� ������ ���þ� �� ���
    - �񱳴�� Į�� ���� A �̻��̰� B ������ ��� TRUE�� ����
    - �ʰ� ������ �ȵ�!! �̻� ���Ͽ����� ��� ����
*/
--EMP ���̺��� �޿��� 2000�̻��̸鼭 4000������ ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL BETWEEN 2000 AND 4000
--AND
--DEPTNO BETWEEN 20 AND 40 -- BETWEEN
;

-- EMP ���̺��� �޿��� 2000�̻��̸鼭 4000���ϰ� �ƴ� ����� ���, �����, �μ��ڵ�, �޿� ��ȸ
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 4000 -- NOT �� Į�� �� �Ǵ� BETWEEN �տ� �ۼ� ����
;

-- EMP ���̺���, �Ի����� 81/01/01 ~ 81/12/31�� �ƴ� ��� ��� Į�� ��ȸ
SELECT * 
FROM EMP
WHERE HIREDATE NOT BETWEEN '81/01/01' AND '81/12/31' 
ORDER BY HIREDATE DESC -- ORDER BY ������! �⺻�����δ� ASC(��������) -- DESC ��������
;

SELECT *
FROM EMP
WHERE SAL < 1000 OR NOT SAL >4000
;
/*
    <LIKE>
        [����]
        WHERE ��Į�� LIKE '����';
        
        - ���Ϸ��� Į���� ������ Ư�� ���Ͽ� ������ ��� TRUE ����
        - Ư�� ���Ͽ��� '%' , '_' �� ���ϵ� ī��� ��� ����
            % : 0���� �̻�
                EX ) ��Į��  LIKE '�ȳ�%' => ��Į�� �� �� '�ȳ�' ���� �����ϴ� ��� ���� ��ȸ
                    ��Į��  LIKE '%�ȳ�' => ��Į�� �� �� '�ȳ�' ���� ������ ��� ���� ��ȸ
                    ��Į��  LIKE '%�ȳ�%' => ��Į�� �� �� '�ȳ�' �� �����ϴ� ��� ���� ��ȸ
            _ : 1����
                EX ) ��Į��  LIKE '_�ȳ�' => ��Į�� �� �� '�ȳ�' �տ� �� ���ڰ� ���� ���� ��ȸ
                    ��Į��  LIKE '�ȳ�_' => ��Į�� �� �� '�ȳ�' �ڿ� �� ���ڰ� ���� ���� ��ȸ
                    ��Į��  LIKE '�ȳ�__' => ��Į�� �� �� '�ȳ�'�ڿ� �� ���ڰ� ���� ���� ��ȸ
                    ��Į��  LIKE '__' => ��Į�� �� �� �� ���ڰ� ���� ���� ��ȸ
*/
--EMP���̺��� �̸��� J�� �����ϴ� ����� ���, �����, �μ��ڵ�
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE 'J%'
;
--EMP���̺��� �̸��� N�� ������ ����� ���, �����, �μ��ڵ�
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE '%N';

--EMP���̺��� �̸��� E�� ���ԵǴ� ����� ���, �����, �μ��ڵ�
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE ENAME LIKE '%E%';

--EMP���̺��� �̸��� 5������ ����� ���, �����
SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME LIKE '_____';

--EMP���̺��� �����ȣ�� �� ��° �ڸ��� '5'�� ����� ���, �����
SELECT EMPNO, ENAME
FROM EMP
WHERE EMPNO LIKE '_5%'; -- ���ڸ����� ��� ������ �𸣹Ƿ� '%' �ٿ��ֱ�!
----------------------�ǽ�-----------------------------
--EMP���̺��� �̸��� ù ���ڰ� S �� �ƴ� ����� ��� �̸� ��ȸ
SELECT EMPNO, ENAME
FROM EMP
WHERE ENAME NOT LIKE 'S%'; -- NOT �� LIKE �� �Ǵ� Į���� �տ� �� �� ����.

/*
    <IS NULL / IS NOT NULL >
        [����]
            WHERE ��Į�� IS [NOT] NULL;
        - Į�� ���� NULL �� ���� ��� NULL �� �񱳿� ��� ��
        - IS  NULL: ��Į�� ���� NULL �� ��� TRUE
        - IS NOT NULL : ��Į�� ���� NULL �� �ƴ� ��� TRUE
*/
--EMP ���̺��� COMM�� NULL�� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE COMM IS NULL;

--EMP ���̺��� COMMDL NULL�� ����� ��� Į�� ��ȸ
SELECT *
FROM EMP
WHERE COMM IS NOT NULL;
/*
    <IN >
        [����]
            WHERE ��Į�� IN( ��, ��, ��, ��, ... ��);
        - �� ���  �� ��ġ�ϴ� ���� ���� ��� TRUE ����
*/
--EMP ���̺���  JOD�� SALESMAN �̰ų� MANAGER�� ����� ��� Į��
SELECT *
FROM EMP
WHERE JOB IN ('SALESMAN', 'MANAGER');-- OR�ε� �� �� ����.

/*
    <������ �켱����>
        0. ()
        1. ���������
        2. ���Ῥ����
        3. �񱳿�����
        4. IS NULL, LIKE, IN
        5. BETWEEN
        6. NOT
        7. AND
        8. OR
*/

/*
    <ORDER BY>
        - SQL �������� �߰��Ͽ� ���� ���
        ASC, DESC�� ��������, �������� ���� ����
        - �������� �߰��ϸ� ��.
*/
--EMP���̺� ��� ������ ��ȸ
SELECT *
FROM EMP
--ORDER BY COMM
--ORDER BY COMM ASC
--ORDER BY COMM DESC
--ORDER BY COMM DESC NULLS FIRST
--ORDER BY COMM ASC NULLS LAST
ORDER BY DEPTNO, SAL -- Į���� ���� ���� ����
;

--EMP ���̺��� EMPNO, ENAME, HIREDATE ������ ��ȸ
SELECT EMPNO ���, ENAME �����, HIREDATE �Ի���
FROM EMP
--ORDER BY HIREDATE
ORDER BY �Ի��� -- ��Ī �̿��ؼ� ��ȸ ����!
;

SELECT ENAME �����, ENO �ֹι�ȣ
FROM EMP
WHERE 
;


















