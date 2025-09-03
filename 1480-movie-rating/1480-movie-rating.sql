(
    SELECT u.name AS results FROM Users AS u
    INNER JOIN MovieRating mrt
    ON u.user_id = mrt.user_id
    GROUP BY u.user_id
    ORDER BY COUNT(u.user_id) DESC ,
    u.name LIMIT 1
)
UNION ALL 
(
    SELECT mov.title AS results FROM Movies AS mov
    INNER JOIN MovieRating mrt 
    ON mrt.movie_id = mov.movie_id
    WHERE MONTH(mrt.created_at) = '02' AND YEAR(mrt.created_at) = '2020'
    GROUP BY mov.title
    ORDER BY AVG(mrt.rating) DESC ,
    mov.title LIMIT 1
)