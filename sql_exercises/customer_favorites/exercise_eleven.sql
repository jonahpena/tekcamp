USE sakila;
WITH customer_rentals
AS (SELECT
ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY customer_id, name) AS rownum1,
rental.customer_id,
category.name
from rental
JOIN inventory on inventory.inventory_id = rental.inventory_id
JOIN film on film.film_id = inventory.film_id
JOIN film_category on film_category.film_id = film.film_id
JOIN category on category.category_id = film_category.category_id
JOIN customer on customer.customer_id = category.category_id
GROUP BY customer_id, rental_date
ORDER BY customer_id, rental_date)

SELECT * FROM (
SELECT * ,
ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY customer_id, rownum2 DESC) AS rownum3
FROM (
SELECT
ROW_NUMBER() OVER (PARTITION BY customer_id, name ORDER BY customer_id) AS rownum2,
customer_rentals.rownum1,
customer_rentals.customer_id,
customer_rentals.name
FROM customer_rentals
WHERE
customer_rentals.rownum1 <=10 ) AS x) AS y
WHERE rownum3 = 1;