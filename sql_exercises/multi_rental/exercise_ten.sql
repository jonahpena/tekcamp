SELECT rental.customer_id,
    DATE(rental_date) AS "Rental Date",
    COUNT(rental.rental_id) AS "Movies Rented",
    SUM(payment.amount) AS "Total"
    
FROM
    rental
JOIN payment ON payment.rental_id = rental.rental_id
GROUP BY rental.customer_id, DATE(rental_date)
HAVING COUNT(rental.rental_id) > 1
ORDER BY rental.customer_id;