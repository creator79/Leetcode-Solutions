# Write your MySQL query statement below
 select contest_id , ROUND((COUNT(contest_id)/(SELECT COUNT(*) FROM Users))*100 ,2 )as percentage
 from register r 
 JOIN users u 
 ON u.user_id = r.user_id
 GROUP BY contest_id
 ORDER BY percentage desc , contest_id asc


