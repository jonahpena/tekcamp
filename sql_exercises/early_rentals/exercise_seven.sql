SELECT 
    rental_id AS "Rental ID",
    staff_id AS "Staff ID",
    inventory_id AS "Inventory ID",
    customer_id AS "Customer ID",
    DATE(rental_date) AS "Rental Date",
    return_date AS "Return Date",
    last_update AS "Last Update"
FROM
    rental
WHERE
    (HOUR(rental_date) < 10)
ORDER BY rental_date DESC
LIMIT 10;