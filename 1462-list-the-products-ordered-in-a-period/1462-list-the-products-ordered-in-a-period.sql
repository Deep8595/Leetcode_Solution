SELECT pro.product_name , SUM(ors.unit) AS unit
FROM Products as pro
JOIN Orders as ors 
ON pro.product_id = ors.product_id
WHERE order_date LIKE '2020-02-%'
GROUP BY pro.product_id
HAVING unit >= 100;