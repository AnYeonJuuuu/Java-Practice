-- JOIN 
/*
    <JOIN>
        두 개 이상의 테이블에서 데이터를 조회하고자 할 때 사용
        
        [문법]
        1) ORACLE 전용 구문
         SELECT 칼럼, 칼럼...
          FROM 테이블1, 테이블2
          WHERE 테이블1. 칼럼 = 테이블2. 칼럼;
        - FROM 절에 조회하고자 하는 테이블들을 콤마로 구분하여 나열
        - WHERE 절에 매칭 시킬 칼럼명에 대한 조건 제시
        
        2) ANSI 표준 구문
            SELECT 칼럼, 칼럼
            FROM 테이블1
            FROM 테이블2
            ON 테이블1.칼럼 = 테이블2.칼럼;
        - FROM 절에 기준이 되는 테이블을 기술
        - JOIN 절에 같이 조회하고자 하는 테이블 기술 후 매칭시킬 칼럼에 대한 조건 기술
        - 연결에 사용하려는 칼럼명이 같은 경우 ON 구문 대신 USING(칼럼) 사용 가능.
*/
-- ANSI 표준으로 작성 = SQL 공통!
SELECT ENAME, EMP.DEPTNO, DEPT.DNAME
FROM EMP 
JOIN DEPT 
ON EMP.DEPTNO = DEPT.DEPTNO
;

-- 테이블 별칭 사용 가능!
SELECT ENAME, E.DEPTNO, D.DNAME
FROM EMP E
JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
--USING(DEPTNO) -- USING 사용 시, 테이블 별칭 사용 불가.
;


SELECT *
FROM DEPT
;

--ORACLE 전용
SELECT ENAME, EMP.DEPTNO, DNAME
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO
;

/*
    2) 다중 JOIN
        여러개의 테이블 조인하는 경우
*/

CREATE TABLE LOCATION(
    LOCNO NUMBER
    , LONAME VARCHAR2(100)
    , LONAMEKOR VARCHAR2(200)
);

INSERT INTO LOCATION VALUES(1,'NEW YORK', '뉴욕');
INSERT INTO LOCATION VALUES(2,'DALLAS', '달라스');
INSERT INTO LOCATION VALUES(3,'CHICAGO', '시카고');
INSERT INTO LOCATION VALUES(4,'BOSTON', '보스턴');

SELECT * FROM LOCATION;
COMMIT;


-- EMP, DEPT, LOCATION 3개의 테이블 활용
-- 사원번호, 사원명, 부서코드, 부서위치, 부서위치 (한글)
SELECT EMPNO, ENAME, E.DEPTNO, DNAME, LOC, LONAMEKOR
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
JOIN LOCATION L ON D.LOC = L.LONAME 
;

/*
    3) 외부JOIN (OUTTER JOIN) 
        테이블간의 JOIN시 일치하지 않는 행도 포함시켜서 조회 가능
        단, 반드시 기준이 되는 테이블을 지정해야 함
*/

SELECT *
FROM EMP
;

--EMP테이블에 사원 한 명 추가하기
--EMPNO 는, ENAME 자유룝게, JOB은 FREE , 매니저 없음, 
--입사일 오늘 날짜, 샐러리 1000, COMM없음, DEPTNO없음
INSERT INTO EMP VALUES (9999,'AYJ','FREE',NULL,SYSDATE, 1000,NULL,NULL);
COMMIT;

--ANSI
SELECT *
FROM EMP A
RIGHT OUTER JOIN DEPT B ON A.DEPTNO = B.DEPTNO ;
-- LEFT OUTER JOIN 의 의미 =  EMP 와 DEPT 조인 했는데,
-- 왼쪽에 있는 모든 정보가 나오도록 하는 것은 LEFT JOIN 
-- OUTER 키워드는 생략 가능.
-- RIGHT OUTER JOIN 시, AYJ는 안나옴 하지만, 오른쪽 테이블의 DEPTNO 40을 살려서 나옴.


--ORACLE 전용
SELECT *
FROM EMP A, DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO
-- (+) = LEFT 조인 / (+) = RIGHT 조인
-- +를 붙이지 않는 쪽이 기준점이 되는 테이블?
;

-- FULL OUTER JOIN : 두 테이블이 가지는 모든 행을 조회 가능. 
-- ORACLE 전용 구문은 FULL OUTER JOIN 구문 지원하지 않음.
SELECT *
FROM EMP A
FULL OUTER JOIN DEPT B ON A.DEPTNO = B.DEPTNO ;

/*
    4) 교차조인 (CROSS JOIN)
        조인되는 모든 테이블의 각 행들이 서로서로 모두 매핑된 데이터가 검색된다.
        테이블의 행들이 모두 곱해진 행들의 조합이 출력
        (실제 업무 시, 잘 사용하지는 않음)
*/
SELECT EMPNO, ENAME, DNAME
FROM EMP A
CROSS JOIN DEPT B 
--ON A.DEPTNO = B.DEPTNO : CROSS JOIN에서는 ON 안 씀
;

----------------- 위에는 등가 JOIN 이었음 : 같은 값이 있어야 연결 --------------------

/*
    5. 비등가 조인(NON EQUAL JOIN)
        조인 조건에 등호(=)를 사용하지 않는 조인문을 비등가 조인이라고 한다.
        지정한 칼럼값이 일치하는 경우가 아닌, 값의 범위에 포함되는 행들을 연결하는 방식
        ( = 이외의 비교 연산자를 사용한다.)
        ANSI 구문으로는 JOIN ON만 사용 가능(USING 사용 불가)
*/
SELECT * FROM SALGRADE;

SELECT *
FROM EMP A
JOIN SALGRADE B ON A.SAL > B.LOSAL
ORDER BY ENAME
;

/*
    6. 셀프 조인
        같은 테이블을 다시 한 번 조인하는 경우
*/
SELECT A.EMPNO, A.ENAME , A.MGR, B.ENAME 
FROM EMP A
JOIN EMP B ON A.MGR = B.EMPNO
;













