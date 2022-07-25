--�� ���б� ��ũ�� ����
--SQL01_SELECT(Basic)

-- 1��
-- �� ������б��� �а� �̸��� �迭�� ǥ���Ͻÿ�. ��, ��� ����� "�а� ��", "�迭"���� ǥ���ϵ��� �Ѵ�.
SELECT DEPARTMENT_NAME AS "�а� ��", CATEGORY AS �迭
FROM TB_DEPARTMENT;

-- 2��
-- �а��� �а� ������ ������ ������ ���·� ȭ�鿡 ����Ѵ�.
/* EX )
    ������а��� ������ 20�� �Դϴ�.
    ������а��� ������ 36�� �Դϴ�.
    ...
*/
SELECT DEPARTMENT_NAME || '�� ������' AS �а� , CAPACITY || '�� �Դϴ�.' AS ����
FROM TB_DEPARTMENT
;

-- 3��
-- "������а�" �� �ٴϴ� ���л� �� ���� �������� ���л��� ã�ƴ޶�� ��û�� ���Դ�. �����ΰ�?
-- (�����а��� '�а��ڵ�'�� �а� ���̺�(TB_DEPARTMENT)�� ��ȸ�ؼ� ã�� ������ ����)
SELECT *
FROM TB_STUDENT S
JOIN tb_department D
    ON S.DEPARTMENT_NO = d.department_no
    AND 
    ;

                     
-- 4�� 
-- ���������� ���� ���� ��� ��ü�ڵ��� ã�� �̸��� �Խ��ϰ��� �Ѵ�.
-- �� ����ڵ��� �й��� ������ ���� �� ����ڵ��� ã�� ������ SQL������ �ۼ��Ͻÿ�.
-- A513079, A513090, A513091, A513110, A513119
-- (�̸� ���� �������� ����)
SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A513079', 'A513090', 'A513091', 'A513110', 'A513119')
;


-- 5��
-- ���� ������ 20�� �̻� 30�� ������ �а����� �а� �̸��� �迭�� ����Ͻÿ�.
SELECT DEPARTMENT_NO, CATEGORY
FROM TB_DEPARTMENT
WHERE CAPACITY BETWEEN 20 AND 30
;

-- 6��
-- �� ������б��� ������ �����ϰ� ��� �������� �Ҽ� �а��� ������ �ִ�.
-- �׷� �� ������б� ������ �̸��� �˾Ƴ� �� �ִ� SQL ������ �ۼ��Ͻÿ�.
SELECT PROFESSOR_NAME
FROM TB_PROFESSOR P
JOIN TB_CLASS_PROFESSOR C
    ON P.PROFESSOR_NO = C.PROFESSOR_NO
    AND P.PROFESSOR_NO IS NULL
    ;

-- 7��
-- Ȥ�� ������� ������ �а��� �����Ǿ� ���� ���� �л��� �ִ��� Ȯ���ϰ��� �Ѵ�.
-- ��� SQL������ ����ϸ� �� ������ �ۼ��Ͻÿ�.
-- (SELECT STUDENT_NAME � ����) 
SELECT STUDENT_NAME
FROM TB_STUDENT S
JOIN TB_DEPARTMENT D
    ON S.DEPARTMENT_NO = D.DEPARTMENT_NO
    AND 

-- 8��
-- ������û�� �Ϸ��� �Ѵ�. �������� ���θ� Ȯ���ؾ� �ϴµ�, ���������� �����ϴ� ������� � �������� ���� ��ȣ�� ��ȸ�� ���ÿ�.


-- 9��
-- �� ���п��� � �迭(CATEGORY)���� �ִ��� ��ȸ�� ���ÿ�.


-- 10��
-- 02�й� ���� �����ڵ��� ������ ������� �Ѵ�. 
-- ������ ������� ������ �������� �л����� 
-- �й�, �̸�, �ֹι�ȣ�� ����ϴ� ������ �ۼ��Ͻÿ�.