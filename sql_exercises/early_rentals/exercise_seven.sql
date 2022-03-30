SELECT 
    rental_id,
    staff_id,
    inventory_id,
    customer_id,
    DATE(rental_date),
    return_date,
    last_update
FROM
    rental
WHERE
    (HOUR(rental_date) < 10)
ORDER BY rental_date DESC
LIMIT 10;