SELECT 
CONCAT(rental.customer_id, ', ', DAY(rental_date)) AS "ID + Date Rented",
    rental.customer_id AS "Customer",
    rental.rental_id,
    rental.inventory_id,    
    rental_date,
    return_date,
    DAY(rental_date),
    payment.payment_id,
    payment.amount
FROM
    rental
INNER JOIN payment
		ON rental.rental_id = payment.payment_id
WHERE
    (HOUR(rental_date) < 10)
ORDER BY CONCAT(rental.customer_id, ', ', DAY(rental_date));
