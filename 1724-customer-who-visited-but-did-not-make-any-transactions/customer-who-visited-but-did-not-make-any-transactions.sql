SELECT 
    v.customer_id,
    COUNT(*) AS count_no_trans
FROM 
    Visits v
WHERE 
    NOT EXISTS (
        SELECT 1 
        FROM Transactions t 
        WHERE t.visit_id = v.visit_id
    )
GROUP BY 
    v.customer_id;
