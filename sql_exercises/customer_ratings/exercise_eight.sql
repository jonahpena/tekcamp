CREATE TABLE customer_ratings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_rating INT,
    fk_film_id smallint unsigned,
    FOREIGN KEY (fk_film_id)
        REFERENCES film (film_id)
);

INSERT INTO customer_ratings(customer_rating)
VALUES (3), (1), (3), (5), (5), (1),(0), (0), (5), (4), (2), (5), (2), (3), 
(4), (5), (3), (3), (2), (1), (4), (2), (2), (1), (5), (5), (5);

SELECT 
    film_id,
    title AS Movie,
    customer_rating AS 'Customer Rating',
    AVG(customer_rating) AS 'Average Rating',
    MIN(customer_rating) AS 'Lowest Rating',
    MAX(customer_rating) AS 'Highest Rating',
    COUNT(customer_rating) AS '# of Ratings Recieved'
FROM
    film
        LEFT JOIN
    customer_ratings ON film.film_id = customer_ratings.id
GROUP BY title
ORDER BY film_id;