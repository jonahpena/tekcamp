SELECT 
    store_id AS "Store ID",
    film_id AS "Film ID",
    COUNT(film_id) AS '# of Film Copies'
FROM
    inventory
GROUP BY film_id, store_id;