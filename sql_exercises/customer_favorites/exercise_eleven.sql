SELECT CONCAT(customer.last_name, ', ', customer.first_name) AS 'Full Name',
rental.rental_id, rental.rental_date, 
category.category_id, category.name
    
FROM
    customer
	INNER JOIN rental 
			ON customer.customer_id = rental.customer_id
    INNER JOIN category
			ON category.category_id = category.category_id
WHERE
    CONCAT(last_name, ', ', first_name) LIKE '%P%'
GROUP BY CONCAT(customer.last_name, ', ', customer.first_name)
ORDER BY rental_date DESC;