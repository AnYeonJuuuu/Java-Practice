
-- DDL(CREATE)
/*
    DDL 
        데이터 정의 언어
        객체 생성, 변경, 삭제 등
        실제 데이터 값이 아닌, 데이터의 구조 자체를 정의하는 언어.
        
        - 오라클 객체 : 테이블, 뷰, 시퀀스, 인덱스, 트리거, 프로시져, 함수, 사용자 등...
        
*/

--DROP TABLE TB_MEMBER;

CREATE TABLE TB_MEMBER(
    ID VARCHAR2(30)
    , PWD VARCHAR2(100)
    , NAME VARCHAR2(20)
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE 
);

DESC TB_MEMBER; -- 테이블의 정보 조회

COMMENT ON COLUMN TB_MEMBER.ID IS '회원아이디'; -- 코멘트 달기

/*
    제약조건(CONSTRAINT)
        사용자가 원하는 조건의 데이터만 유지하기 위해서 사용
        데이터 무결성 보장을 목적으로 함 (정확성, 일관성 유지)
        
        * NOT NULL, UNIQUE(중복불가), CHECK, PRIMARY KEY( LIEK. 낫널 + 유니크), FOREIGN KEY
*/

-- 제약 조건 확인 -- 제약조건 자체 확인
DESC USER_CONSTRAINTS; -- 해당 테이블의 정보 조회
SELECT * FROM USER_CONSTRAINTS WHERE OWNER = 'C##KH'; 

-- 제약조건이 걸린 칼럼 조회
DESC USER_CONS_COLUMNS;
SELECT * FROM USER_CONS_COLUMNS;

-- NOT NULL : 해당 칼럼에 반드시 값이 있어야 하는 경우
INSERT INTO TB_MEMBER VALUES(NULL,NULL,NULL,NULL);
SELECT * FROM TB_MEMBER; 

-- 테이블 생성
--DROP TABLE TB_MEMBER;
CREATE TABLE TB_MEMBER(
    ID VARCHAR2(30) NOT NULL
    , PWD VARCHAR2(100) NOT NULL
    , NAME VARCHAR2(20) NOT NULL
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE 
);

-- 테이블 생성
--DROP TABLE TB_MEMBER;
CREATE TABLE TB_MEMBER(
    ID VARCHAR2(30) NOT NULL UNIQUE
    , PWD VARCHAR2(100) NOT NULL UNIQUE
    , NAME VARCHAR2(20) NOT NULL UNIQUE
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE 
);

INSERT INTO TB_MEMBER (ID, PWD, NAME )VALUES('USER01','1234','AYJ');
SELECT * FROM TB_MEMBER; 

-- 테이블 생성
DROP TABLE TB_MEMBER;
CREATE TABLE TB_MEMBER(
    ID VARCHAR2(30) CONSTRAINT MEMBER_ID_NN NOT NULL -- 제약조건에 이름 붙여주는 것도 가능 :  CONSTRAINT 붙이고 싶은 이름
    , PWD VARCHAR2(100) 
    , NAME VARCHAR2(20) CONSTRAINT MEMBER_NAME_UQ UNIQUE
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE 
);

INSERT INTO TB_MEMBER (ID, PWD, NAME )VALUES( 'ATY' ,'1234','AYJ');
SELECT * FROM TB_MEMBER; 

-- 테이블 생성
 -- 제약조건을 아래에 따로 걸어주는 방법
DROP TABLE TB_MEMBER;
CREATE TABLE TB_MEMBER(
    ID VARCHAR2(30) CONSTRAINT MEMBER_ID_NN NOT NULL -- 칼럼 옆에 제약조건 걸면 = 칼럼레벨 에 걸어준다.
    , PWD VARCHAR2(100) 
    , NAME VARCHAR2(20) 
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE 
    , CONSTRAINT MEMBER_ID_PWD_NAME_UQ UNIQUE(ID,PWD,NAME)-- 세개를 한 번에 제약조건 걸어준 것! 셋 중 하나만 달라도 인서트 가능!
);

INSERT INTO TB_MEMBER (ID, PWD, NAME )VALUES( 'ATY' ,'3333','AYJ');
SELECT * FROM TB_MEMBER; 

INSERT INTO TB_MEMBER (ID, PWD, NAME, ENROLL_DATE )VALUES( 'USER01' ,'1234','NAME01', DEFAULT);
SELECT * FROM TB_MEMBER; 

DROP TABLE TB_MEMBER;

--CHECK 제약조건
DROP TABLE STUDENT;

CREATE TABLE STUDENT(
    NO NUMBER CONSTRAINT NNNNN CHECK((NO > 0 ))
    , NICK VARCHAR2(100)
    , NAME VARCHAR2(100) 
    , GENDER CHAR(1) CONSTRAINT XXX CHECK(GENDER IN ('M','F'))
    , CONSTRAINT ABC CHECK (NAME != NICK) -- 다른 열에 테이블 조건 걸기위해서는 테이블레벨 에 걸기 :: 가능하면 DB에서 사용하지 않기!!
);

INSERT INTO STUDENT VALUES(-1, '안연주', 'F');
SELECT * FROM STUDENT ;
INSERT INTO STUDENT VALUES(1, '안연주', 'X');

-- 기본키
/* <기본키>
    테이블에서 한 행의 정보를 식별하기 위해 사용할 컬럼에 부여하는 제약조건
    각 행들을 구분할 수 있는 식별자
    기본 키 제약조건 설정 시, 자동으로 낫 널 + 유니크 조건이 설정됨
    한 테이블에 한 개만 설정할 수 있다. (여러 개의 칼럼을 묶어서 기본키로 지정 가능)
    컬럼 레벨, 테이블 레벨 설정 가능
    
    ?? 가장 중요한 칼럼에 걸ㄱㅣ? // 학생의 학번, 사람의 주민등록번호 
*/

DROP TABLE TB_MEMBER;

CREATE TABLE TB_MEMBER(
    ID VARCHAR2(100) PRIMARY KEY
    , PWD VARCHAR2(100)
    , NICK VARCHAR2(100)
);

INSERT INTO TB_MEMBER VALUES('USER01', '1234', 'NICK01');
INSERT INTO TB_MEMBER VALUES(NULL, '1234', 'NICK01');
SELECT * FROM TB_MEMBER;

DROP TABLE TB_MEMBER;

CREATE TABLE TB_MEMBER(
    ID VARCHAR2(100) 
    , PWD VARCHAR2(100)
    , NICK VARCHAR2(100)
    , CONSTRAINT MEMBER_PK_ID_PWD PRIMARY KEY(ID,PWD) -- 복합키 (여러 개의 칼럼 묶어서)
);

INSERT INTO TB_MEMBER VALUES(NULL, '1234', 'NICK01');
INSERT INTO TB_MEMBER VALUES('USER01', NULL , 'NICK01');

INSERT INTO TB_MEMBER VALUES('USER01', '1234', 'NICK01');

/*
    <외래키>
        다른 테이블에 존재하는 값만을 가져와야 하는 칼럼에 부여(NULL 가능)
        
        [문법]
        1) 칼럼 레벨
            칼럼명 자료형(크기) [CONSTANINT 제약조건명] REFERENCES 참조테이블명 [(기본키)] [삭제롤]
            
        2) 테이블 레벨
            [CONSTRAINT 제약조건명] FOREIGN KEY(칼럼명) REFERENCES 참조테이블명 [(기본키)] [삭제롤]
            
        [삭제롤]
            부모테이블의 데이터가 삭제 됐을 때 옵션
            1) ON DELETE RESTRICT : 
            자식 테이블의 참조 키가 부모 테이블의 키 값을 참조하는 경우,
            부모 테이블행을 삭제할 수 없다. (기본옵션)
            2) ON DELETE SET NULL : 
            부모테이블의 데이터 삭제 시, 참조하고 있는 자식 테이블의 칼럼 값이  NULL 로 변경
            3) ON DELETE CASCADE : 
            부모테이블의 데이터 삭제 시, 참조하고 있는 자식 테이블의 칼럼 값이 존재하는 행 전체 삭제.
*/
DROP TABLE STUDENT;
CREATE TABLE STUDENT(
    NO NUMBER PRIMARY KEY
    , NAME VARCHAR2(100) NOT NULL
);

DROP TABLE SCORE;
CREATE TABLE SCORE(
    STD_NO NUMBER REFERENCES STUDENT ON DELETE SET NULL
    , SCORE NUMBER NOT NULL
);

INSERT INTO STUDENT(NO, NAME) VALUES(1, '일번학생');
INSERT INTO STUDENT(NO, NAME) VALUES(2, '이번학생');
INSERT INTO STUDENT(NO, NAME) VALUES(3, '삼번학생');
SELECT * FROM STUDENT;

INSERT INTO SCORE(STD_NO, SCORE) VALUES(1,100);
INSERT INTO SCORE(STD_NO, SCORE) VALUES(2,90);
INSERT INTO SCORE(STD_NO, SCORE) VALUES(3,80);
SELECT * FROM SCORE;

INSERT INTO SCORE(STD_NO, SCORE) VALUES(5,99);

DELETE STUDENT WHERE NO = 1;









