SELECT store_id, film_id, COUNT(film_id) AS "number of film copies" FROM inventory
GROUP BY film_id ORDER BY store_id;