-- ������ SEQUENCE
/*
    <SEQUENCE>
        �������� ���������� �����ϴ� ������ �ϴ� ��ü�̴�.
        
    <SEQUENCE ����>
        [ǥ����]
            CREATE SEQUNCE ��������
            [START WITH ����]
            [INCREAMENT BY ����]
            [MAXVALUE ����]
            [MINVALUE ����]
            [CYCLE | NOCYCLE]
            [CACHE ����Ʈũ�� | NOCACHE]; (�⺻�� 20 ����Ʈ)
            
        [��� ����]
            ��������.CURRVAL : ���� �������� ��
            ��������.NEXTVAL : ������ ���� ������Ű�� ������ ������ ��
                              (���� ������ ������ INCREAMENT �� ��ŭ ������ ��)
                              
        * ĳ�ø޸�
          - �̸� ���� ������ �����ؼ� �����صд�.
          - �Ź� ȣ���� ������ ������ ���� ���� ������ �ϴ� ���� �ƴ� ĳ�� �޸� ������ �̸� ������ ������ ����Ѵ�.
*/
DROP SEQUENCE SEQ_MEMBER_NO;
CREATE SEQUENCE SEQ_MEMBER_NO
NOCACHE NOCYCLE -- �ɼ������ؾ� ��
;


SELECT SEQ_MEMBER_NO.NEXTVAL FROM DUAL; -- ���� �� ��� :: ������ ������ 1�� �þ :: ���ʿ� �� �� ���� ���־�� ���� ����.
SELECT SEQ_MEMBER_NO.CURRVAL FROM DUAL; -- ���� �� ���

-- ����


-- ��뿹��
CREATE TABLE TB_MEMBER(
    NO NUMBER
    ,ID VARCHARW
);

INSERT INTO TB_MEMBER VALUES;




































