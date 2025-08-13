SELECT sgn.user_id , round(avg(if(cfm.action="confirmed" , 1 , 0)), 2) as confirmation_rate
FROM Signups sgn
LEFT JOIN Confirmations cfm
ON sgn.user_id = cfm.user_id
GROUP BY user_id;