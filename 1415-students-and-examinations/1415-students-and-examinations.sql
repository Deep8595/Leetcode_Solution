SELECT st.student_id , st.student_name , sub.subject_name , COUNT(exam.subject_name) as attended_exams
FROM Students as st
CROSS JOIN Subjects as sub
LEFT JOIN Examinations as exam
ON st.student_id = exam.student_id
AND exam.subject_name = sub.subject_name 
GROUP BY st.student_id , st.student_name , sub.subject_name
ORDER BY st.student_id , st.student_name;
