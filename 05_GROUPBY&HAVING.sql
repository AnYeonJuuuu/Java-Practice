-- 그룹

/*
    <GROUP BY>
    그룹 기준을 제시할 수 있는 구문
    여러 개의 값들을 하나의 그룹으로 묶어서 처리할 목적으로 사용한다.
    
*/

-- 전체 사원을 하나의 그룹으로 묶어서 월급 총합을 구한 결과
SELECT SUM(SAL) 
FROM EMP
;

-- 부서별 급여 총합
SELECT DEPTNO, SUM(SAL) AS 합계 --SELECT가 ORDER BY 보다 먼저 실행 됨.
FROM EMP
WHERE SAL > 2000
GROUP BY DEPTNO -- 부서코드가 같은 것들끼리 묶이도록!
ORDER BY 합계
;

-- JOB 별 급여 합계 조회
SELECT JOB 직무, SUM(SAL) 부서별급여합계
FROM EMP
GROUP BY JOB
;
---- 각 부서별 COMM을 받는 사원의 수(0을 NULL로 바꿔주고 받는 것으로 처리)
SELECT DEPTNO, COUNT(NULLIF(COMM,0))
FROM EMP
GROUP BY DEPTNO
;

-- 각 부서별 COMM 을 받는 사원 수 (0도 받는것으로 처리)
SELECT DEPTNO, COUNT(COMM)
FROM EMP
GROUP BY DEPTNO;

/*
    <HAVING>
        그룹에 대한 조건을 제시할 때 사용
*/

SELECT DEPTNO, SUM(SAL), COUNT(COMM)
FROM EMP
GROUP BY DEPTNO
HAVING SUM(SAL) > 10000 -- 어떤 조건을 검사 : 이 그룸을 통해 만들어지는 어떠한 값 / ?값의 형태가 단일행 ,단일열이 가능?
;

--각 부서별 평균 급여조회 (평균급여가 2000 이상인 경우만)
SELECT DEPTNO 부서번호, FLOOR(AVG(SAL)) 평균급여
FROM EMP
GROUP BY DEPTNO
HAVING AVG(SAL) >=2000
ORDER BY 부서번호
;

-- 급여가 1000 이상인 사람들에 대해 부서별 급여 합계 조회
SELECT DEPTNO 부서번호, SUM(SAL) 부서별급여합계
FROM EMP
WHERE SAL >= 1000
GROUP BY DEPTNO
;

-- 각 부서별 보너스(COMM) 받는 사원의 수 조회
SELECT DEPTNO, COUNT(NULLIF(COMM,0))
FROM EMP
GROUP BY DEPTNO
;
----------------------------복습 질문-------------------------
SELECT ENAME,777
FROM EMP;

SELECT
    EMPNO
    , ENAME
    , CASE 
    WHEN DEPTNO > 7 AND DEPTNO < 13 THEN 1 -- AND 앞 뒤 조건이 다 맞아야 다음으로 넘어감
    WHEN DEPTNO BETWEEN 5 AND 15 THEN 1 -- 조건 여러 개 사용 가능, 눈에 보이기에도 편함 
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
------------------------------ 복습 끝-------------------------------

/*
    집계 함수
        그룹별 산출한 결과 값의 중간 집계를 계산 해주는 함수.
        - CUBE :
        - ROLLUP : 
        ( - GROUPING SETS = CUBE로 사용해도 무방함. )
        - GROUPING : 
        
*/

SELECT DEPTNO, JOB,COMM, SUM(SAL)
FROM EMP
--GROUP BY CUBE(DEPTNO, JOB)-- 부서코드랑 직업으로 9그룹 생성 , 두 칼럼 합쳐서 쭉 계산 DEPTNO 가지고 소계, JOB 소계, 
GROUP BY ROLLUP(DEPTNO,JOB,COMM) -- GROUP BY 할 때 칼럼 여러 개도 가능!!!(중요), DEPTNO만 가지고 소계
ORDER BY DEPTNO
;

SELECT DEPTNO, JOB, SUM(SAL)
FROM EMP
GROUP BY GROUPING SETS(DEPTNO, JOB);

-- GROUPING 값이 NULL이면 1, NULL이 아니라면 0 이 나옴
SELECT DEPTNO, JOB, SUM(SAL),GROUPING(JOB), GROUPING(DEPTNO) 
FROM EMP
GROUP BY GROUPING SETS(DEPTNO, JOB)
;

SELECT
    DEPTNO 부서구분
    ,CASE
        WHEN DEPTNO = 10 THEN '영업1팀'
        WHEN DEPTNO = 20 THEN '영업2팀'
        WHEN DEPTNO = 30 THEN '영업3팀'
        ELSE '사장님'
        END 부서
--    ,JOB
     ,CASE
        WHEN GROUPING(JOB ) = 1 THEN '모든직업' 
        ELSE JOB
        END 직업구분
    ,SUM(SAL) 
FROM EMP
GROUP BY ROLLUP(DEPTNO, JOB)
ORDER BY DEPTNO
;

/*
    < 집합 연산자 >
        여러 개의 쿼리문을 가지고 하나의 쿼리문으로 만드는 연산자이다.(= 실행 결과 합치기)
        
        UNION : 합집합 -> 두 쿼리문의 수행 결과를 합친 후 , 중복 제거
        UNION ALL : 합집합 -> 두 쿼리문의 수행 결과를 합침 , 중복허용
        INTERSECT : 교집합 -> 두 쿼리문 수행 결과 중복된 결과만 추출
        MINUS : 차집합 -> 선행 쿼리의 결과 중 후행 쿼리의 결과값을 뺀 나머지, 순서에 따라 영향을 받음
*/

SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > 2000
MINUS
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > 3000
;













