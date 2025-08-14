SELECT pro.project_id , IFNULL(ROUND(AVG(experience_years), 2),0) as average_years
FROM Project pro
LEFT JOIN Employee emp
ON pro.employee_id = emp.employee_id
GROUP BY project_id;
