-- �׷�

/*
    <GROUP BY>
    �׷� ������ ������ �� �ִ� ����
    ���� ���� ������ �ϳ��� �׷����� ��� ó���� �������� ����Ѵ�.
    
*/

-- ��ü ����� �ϳ��� �׷����� ��� ���� ������ ���� ���
SELECT SUM(SAL) 
FROM EMP
;

-- �μ��� �޿� ����
SELECT DEPTNO, SUM(SAL) AS �հ� --SELECT�� ORDER BY ���� ���� ���� ��.
FROM EMP
WHERE SAL > 2000
GROUP BY DEPTNO -- �μ��ڵ尡 ���� �͵鳢�� ���̵���!
ORDER BY �հ�
;

-- JOB �� �޿� �հ� ��ȸ
SELECT JOB ����, SUM(SAL) �μ����޿��հ�
FROM EMP
GROUP BY JOB
;
---- �� �μ��� COMM�� �޴� ����� ��(0�� NULL�� �ٲ��ְ� �޴� ������ ó��)
SELECT DEPTNO, COUNT(NULLIF(COMM,0))
FROM EMP
GROUP BY DEPTNO
;

-- �� �μ��� COMM �� �޴� ��� �� (0�� �޴°����� ó��)
SELECT DEPTNO, COUNT(COMM)
FROM EMP
GROUP BY DEPTNO;

/*
    <HAVING>
        �׷쿡 ���� ������ ������ �� ���
*/

SELECT DEPTNO, SUM(SAL), COUNT(COMM)
FROM EMP
GROUP BY DEPTNO
HAVING SUM(SAL) > 10000 -- � ������ �˻� : �� �׷��� ���� ��������� ��� �� / ?���� ���°� ������ ,���Ͽ��� ����?
;

--�� �μ��� ��� �޿���ȸ (��ձ޿��� 2000 �̻��� ��츸)
SELECT DEPTNO �μ���ȣ, FLOOR(AVG(SAL)) ��ձ޿�
FROM EMP
GROUP BY DEPTNO
HAVING AVG(SAL) >=2000
ORDER BY �μ���ȣ
;

-- �޿��� 1000 �̻��� ����鿡 ���� �μ��� �޿� �հ� ��ȸ
SELECT DEPTNO �μ���ȣ, SUM(SAL) �μ����޿��հ�
FROM EMP
WHERE SAL >= 1000
GROUP BY DEPTNO
;

-- �� �μ��� ���ʽ�(COMM) �޴� ����� �� ��ȸ
SELECT DEPTNO, COUNT(NULLIF(COMM,0))
FROM EMP
GROUP BY DEPTNO
;
----------------------------���� ����-------------------------
SELECT ENAME,777
FROM EMP;

SELECT
    EMPNO
    , ENAME
    , CASE 
    WHEN DEPTNO > 7 AND DEPTNO < 13 THEN 1 -- AND �� �� ������ �� �¾ƾ� �������� �Ѿ
    WHEN DEPTNO BETWEEN 5 AND 15 THEN 1 -- ���� ���� �� ��� ����, ���� ���̱⿡�� ���� 
    WHEN DEPTNO = 10 THEN 1
        ELSE -1
    END
FROM EMP
;





SELECT  *
FROM EMP
WHERE COMM IS NOT NULL;
GROUP BY DEPTNO
;
------------------------------ ���� ��-------------------------------

/*
    ���� �Լ�
        �׷캰 ������ ��� ���� �߰� ���踦 ��� ���ִ� �Լ�.
        - CUBE :
        - ROLLUP : 
        ( - GROUPING SETS = CUBE�� ����ص� ������. )
        - GROUPING : 
        
*/

SELECT DEPTNO, JOB,COMM, SUM(SAL)
FROM EMP
--GROUP BY CUBE(DEPTNO, JOB)-- �μ��ڵ�� �������� 9�׷� ���� , �� Į�� ���ļ� �� ��� DEPTNO ������ �Ұ�, JOB �Ұ�, 
GROUP BY ROLLUP(DEPTNO,JOB,COMM) -- GROUP BY �� �� Į�� ���� ���� ����!!!(�߿�), DEPTNO�� ������ �Ұ�
ORDER BY DEPTNO
;

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS(DEPTNO, JOB);

-- GROUPING ���� NULL�̸� 1, NULL�� �ƴ϶�� 0 �� ����
SELECT DEPTNO, JOB, SUM(SAL),GROUPING(JOB), GROUPING(DEPTNO) 
FROM EMP
GROUP BY GROUPING SETS(DEPTNO, JOB)
;

SELECT
    DEPTNO �μ�����
    ,CASE
        WHEN DEPTNO = 10 THEN '����1��'
        WHEN DEPTNO = 20 THEN '����2��'
        WHEN DEPTNO = 30 THEN '����3��'
        ELSE '�����'
        END �μ�
--    ,JOB
     ,CASE
        WHEN GROUPING(JOB ) = 1 THEN '�������' 
        ELSE JOB
        END ��������
    ,SUM(SAL) 
FROM EMP
GROUP BY ROLLUP(DEPTNO, JOB)
ORDER BY DEPTNO
;

/*
    < ���� ������ >
        ���� ���� �������� ������ �ϳ��� ���������� ����� �������̴�.(= ���� ��� ��ġ��)
        
        UNION : ������ -> �� �������� ���� ����� ��ģ �� , �ߺ� ����
        UNION ALL : ������ -> �� �������� ���� ����� ��ħ , �ߺ����
        INTERSECT : ������ -> �� ������ ���� ��� �ߺ��� ����� ����
        MINUS : ������ -> ���� ������ ��� �� ���� ������ ������� �� ������, ������ ���� ������ ����
*/

SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > 2000
MINUS
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > 3000
;













