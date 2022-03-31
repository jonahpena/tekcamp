SELECT 
    CONCAT(last_name, ', ', first_name) AS 'Full Name'
FROM
    customer
WHERE
    CONCAT(last_name, ', ', first_name) LIKE '%P%';