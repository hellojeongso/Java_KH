SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM LOCATIONS;
SELECT * FROM COUNTRIES;
SELECT * FROM REGIONS;
SELECT * FROM JOB_HISTORY;
SELECT * FROM JOBS;

-- 1. 근속 년수가 15년 이상인 사원의 이름(FIRST_NAME)과 입사일을 출력 
  SELECT FIRST_NAME, HIRE_DATE 
      FROM EMPLOYEES 
      WHERE (SYSDATE-HIRE_DATE)/365 >= 15; 
      
-- 2. ROWNUM을 사용하여, 관리자가 존재하는 부서중 평균 월급이 가장높은 부서를 출력
 SELECT DEPARTMENT_NAME, ROWNUM
 FROM (SELECT DEPARTMENT_NAME 
    	FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)
 	WHERE DEPARTMENT_ID IN 
		(SELECT DEPARTMENT_ID
      		FROM DEPARTMENTS 
      		WHERE MANAGER_ID IS NOT NULL)
     		GROUP BY DEPARTMENT_NAME
     		ORDER BY AVG(SALARY) DESC) A
WHERE ROWNUM = 1; 
-- DEPARTMENTS JOIN해서 
-- WHERE절에서 MANAGER_ID가 있는 부서를 찾고
-- DEPARTMANET_NAME을 그룹화하고 평균 연봉을 내림차순으로 출력하는 A라는 가상테이블을 만들었다
-- ROWNUM으로 1번째 순서 출력 


-- 3. 아시아에서 일하는 사원의 이름(FIRST_NAME)과 국가(COUNTRY_NAME), 월급을 출력
SELECT FIRST_NAME, COUNTRY_NAME, SALARY
FROM EMPLOYEES JOIN DEPARTMENTS USING(DEPARTMENT_ID)
      JOIN LOCATIONS USING(LOCATION_ID)
      JOIN COUNTRIES USING(COUNTRY_ID)
      JOIN REGIONS USING(REGION_ID)
WHERE REGION_NAME = 'Asia';


-- 4. 08년 이후에 입사한 사원의 FULL NAME(FIRST_NAME+LAST_NAME)과 월급, 직업(JOB_TITLE)을 출력 
SELECT FIRST_NAME || ' ' || LAST_NAME, SALARY, JOB_TITLE
FROM EMPLOYEES JOIN JOBS USING (JOB_ID)
WHERE HIRE_DATE >= '08/01/01';


-- 5. 전화번호가 515.127.4562사원의 이름(FIRST)과 직업, 주소(STREET_ADDRESS)를 출력
SELECT FIRST_NAME, JOB_TITLE, STREET_ADDRESS
FROM EMPLOYEES JOIN JOBS USING(JOB_ID)
    JOIN DEPARTMENTS USING(DEPARTMENT_ID) 
    JOIN LOCATIONS USING(LOCATION_ID)
WHERE PHONE_NUMBER = '515.127.4562';

-- 6. 직업이 'Accountant'이면서 가장 많은 월급을 받는 사원의 이름과 월급을 출력
SELECT FIRST_NAME, SALARY, JOB_TITLE
FROM EMPLOYEES JOIN JOBS USING(JOB_ID)
WHERE JOB_TITLE ='Accountant' AND SALARY = MAX_SALARY;

-- 7. 사원테이블에서 부서별 평균 월급을 출력하되, 평균 월급이 2000보다 큰 부서의 부서번호와 평균 월급을 출력하자.
SELECT DEPARTMENT_ID, AVG(SALARY)
FROM EMPLOYEES
HAVING AVG(SALARY) > 2000
GROUP BY DEPARTMENT_ID;

-- 8. 사원테이블에서 CUBE를 사용하여  각 직업별 평균월급을 출력하되, 월급이 높은 순으로 출력하자.(내림차순)
SELECT JOB_TITLE, AVG(SALARY)
FROM EMPLOYEES JOIN JOBS USING(JOB_ID)
GROUP BY CUBE(JOB_TITLE)
ORDER BY AVG(SALARY) DESC;

-- 9. 로마에서 일하고 있는 사람의 이름, 월급을 출력하자
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES JOIN DEPARTMENTS USING(DEPARTMENT_ID)
JOIN LOCATIONS USING(LOCATION_ID)
WHERE CITY = 'Roma';

-- 10. 직업이 SH_CLERK이면서, 입사일이 08년도 이후이고, 최소월급보다 많이 받는 사람들의 이름과 월급, 최소월급을 출력해라.
SELECT FIRST_NAME, SALARY, MIN_SALARY 
FROM EMPLOYEES JOIN JOBS USING(JOB_ID)
WHERE JOB_ID = 'SH_CLEKR' AND SALARY > MIN_SALARY AND HIRE_DATE > '08/01/01';


 