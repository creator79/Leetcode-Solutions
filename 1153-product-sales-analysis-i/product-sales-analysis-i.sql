# Write your MySQL query statement below
select product_name , year , price 
from Sales as s 
JOIN Product as p
ON s.product_id = p.product_id

