-- JOIN 
/*
    <JOIN>
        �� �� �̻��� ���̺��� �����͸� ��ȸ�ϰ��� �� �� ���
        
        [����]
        1) ORACLE ���� ����
         SELECT Į��, Į��...
          FROM ���̺�1, ���̺�2
          WHERE ���̺�1. Į�� = ���̺�2. Į��;
        - FROM ���� ��ȸ�ϰ��� �ϴ� ���̺���� �޸��� �����Ͽ� ����
        - WHERE ���� ��Ī ��ų Į���� ���� ���� ����
        
        2) ANSI ǥ�� ����
            SELECT Į��, Į��
            FROM ���̺�1
            FROM ���̺�2
            ON ���̺�1.Į�� = ���̺�2.Į��;
        - FROM ���� ������ �Ǵ� ���̺��� ���
        - JOIN ���� ���� ��ȸ�ϰ��� �ϴ� ���̺� ��� �� ��Ī��ų Į���� ���� ���� ���
        - ���ῡ ����Ϸ��� Į������ ���� ��� ON ���� ��� USING(Į��) ��� ����.
*/
-- ANSI ǥ������ �ۼ� = SQL ����!
SELECT ENAME, EMP.DEPTNO, DEPT.DNAME
FROM EMP 
JOIN DEPT 
ON EMP.DEPTNO = DEPT.DEPTNO
;

-- ���̺� ��Ī ��� ����!
SELECT ENAME, E.DEPTNO, D.DNAME
FROM EMP E
JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
--USING(DEPTNO) -- USING ��� ��, ���̺� ��Ī ��� �Ұ�.
;


SELECT *
FROM DEPT
;

--ORACLE ����
SELECT ENAME, EMP.DEPTNO, DNAME
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
;

/*
    2) ���� JOIN
        �������� ���̺� �����ϴ� ���
*/

CREATE TABLE LOCATION(
    LOCNO NUMBER
    , LONAME VARCHAR2(100)
    , LONAMEKOR VARCHAR2(200)
);

INSERT INTO LOCATION VALUES(1,'NEW YORK', '����');
INSERT INTO LOCATION VALUES(2,'DALLAS', '�޶�');
INSERT INTO LOCATION VALUES(3,'CHICAGO', '��ī��');
INSERT INTO LOCATION VALUES(4,'BOSTON', '������');

SELECT * FROM LOCATION;
COMMIT;


-- EMP, DEPT, LOCATION 3���� ���̺� Ȱ��
-- �����ȣ, �����, �μ��ڵ�, �μ���ġ, �μ���ġ (�ѱ�)
SELECT EMPNO, ENAME, E.DEPTNO, DNAME, LOC, LONAMEKOR
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
JOIN LOCATION L ON D.LOC = L.LONAME 
;

/*
    3) �ܺ�JOIN (OUTTER JOIN) 
        ���̺��� JOIN�� ��ġ���� �ʴ� �൵ ���Խ��Ѽ� ��ȸ ����
        ��, �ݵ�� ������ �Ǵ� ���̺��� �����ؾ� ��
*/

SELECT *
FROM EMP
;

--EMP���̺� ��� �� �� �߰��ϱ�
--EMPNO ��, ENAME �������, JOB�� FREE , �Ŵ��� ����, 
--�Ի��� ���� ��¥, ������ 1000, COMM����, DEPTNO����
INSERT INTO EMP VALUES (9999,'AYJ','FREE',NULL,SYSDATE, 1000,NULL,NULL);
COMMIT;

--ANSI
SELECT *
FROM EMP A
RIGHT OUTER JOIN DEPT B ON A.DEPTNO = B.DEPTNO ;
-- LEFT OUTER JOIN �� �ǹ� =  EMP �� DEPT ���� �ߴµ�,
-- ���ʿ� �ִ� ��� ������ �������� �ϴ� ���� LEFT JOIN 
-- OUTER Ű����� ���� ����.
-- RIGHT OUTER JOIN ��, AYJ�� �ȳ��� ������, ������ ���̺��� DEPTNO 40�� ����� ����.


--ORACLE ����
SELECT *
FROM EMP A, DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO
-- (+) = LEFT ���� / (+) = RIGHT ����
-- +�� ������ �ʴ� ���� �������� �Ǵ� ���̺�?
;

-- FULL OUTER JOIN : �� ���̺��� ������ ��� ���� ��ȸ ����. 
-- ORACLE ���� ������ FULL OUTER JOIN ���� �������� ����.
SELECT *
FROM EMP A
FULL OUTER JOIN DEPT B ON A.DEPTNO = B.DEPTNO ;

/*
    4) �������� (CROSS JOIN)
        ���εǴ� ��� ���̺��� �� ����� ���μ��� ��� ���ε� �����Ͱ� �˻��ȴ�.
        ���̺��� ����� ��� ������ ����� ������ ���
        (���� ���� ��, �� ��������� ����)
*/
SELECT EMPNO, ENAME, DNAME
FROM EMP A
CROSS JOIN DEPT B 
--ON A.DEPTNO = B.DEPTNO : CROSS JOIN������ ON �� ��
;

----------------- ������ � JOIN �̾��� : ���� ���� �־�� ���� --------------------

/*
    5. �� ����(NON EQUAL JOIN)
        ���� ���ǿ� ��ȣ(=)�� ������� �ʴ� ���ι��� �� �����̶�� �Ѵ�.
        ������ Į������ ��ġ�ϴ� ��찡 �ƴ�, ���� ������ ���ԵǴ� ����� �����ϴ� ���
        ( = �̿��� �� �����ڸ� ����Ѵ�.)
        ANSI �������δ� JOIN ON�� ��� ����(USING ��� �Ұ�)
*/
SELECT * FROM SALGRADE;

SELECT *
FROM EMP A
JOIN SALGRADE B ON A.SAL > B.LOSAL
ORDER BY ENAME
;

/*
    6. ���� ����
        ���� ���̺��� �ٽ� �� �� �����ϴ� ���
*/
SELECT A.EMPNO, A.ENAME , A.MGR, B.ENAME 
FROM EMP A
JOIN EMP B ON A.MGR = B.EMPNO
;













