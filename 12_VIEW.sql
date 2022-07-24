-- VIEW
/*
    <VIEW>
        SELECT ���� ������ �� �ִ� ��ü�̴�.(������ ���� ���̺�)
        �����͸� �����ϰ� ���� ������ ���̺� ���� SQL�� ����Ǿ� �־� VIEW ������ �� SQL�� �����ϸ鼭 ������� �����´�.
        
        [����]
            CREATE [OR REPLACE] VIEW ���
            AS ���� ����;
            
        SELECT
        FROM
        JOIN ~~
*/

--�ѱ����� �ٹ��ϴ� ������� ���, �̸�, �μ��� ,�޿�, ������
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE N.NATIONAL_NAME = '�ѱ�'
;

--�Ϻ����� �ٹ��ϴ� ������� ���, �̸�, �μ��� ,�޿�, ������
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
WHERE N.NATIONAL_NAME = '�Ϻ�'
;


-- 4�� ���̺��� �� ���� �� �� �ִ� �� �̿�!!

-- VIEW
CREATE OR REPLACE VIEW V_EMPLOYEE
AS
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY, NATIONAL_NAME
FROM EMPLOYEE E
JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
JOIN LOCATION L ON D.LOCATION_ID = L.LOCAL_CODE
JOIN NATIONAL N ON L.NATIONAL_CODE = N.NATIONAL_CODE
;

SELECT *
FROM V_EMPLOYEE;

--�ѱ����� �ٹ��ϴ� ������� ���, �̸�, �μ��� ,�޿�, ������
SELECT *
FROM V_EMPLOYEE
WHERE NATIONAL_NAME = '�ѱ�';

-- DML
COMMIT;
UPDATE v_employee
SET SALARY = 999999999
WHERE EMP_NAME = '������';

 -- �並 ������ ������ ������ �����ϱ�� ��. �並 ����ϴ� ������ �ܺ� ������ �� �̿��ϹǷ� ������ ���� �� �̿������� ����.
SELECT * FROM V_EMPLOYEE;
SELECT * FROM EMPLOYEE;
ROLLBACK;

-- READ ONLY
CREATE OR REPLACE VIEW V_DEPT_01
AS
SELECT *
FROM DEPARTMENT
WITH READ ONLY
;

SELECT * FROM USER_VIEWS; -- ���� ���� �信 ���� ������ ��� �ڵ�
SELECT VIEW_NAME, READ_ONLY FROM USER_VIEWS; -- READ ONLY Į�� ���� ���.












