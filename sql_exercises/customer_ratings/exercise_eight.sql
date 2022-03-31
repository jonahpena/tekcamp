CREATE TABLE customer_ratings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    customer_rating INT,

	fk_customer_id smallint unsigned,
    FOREIGN KEY (fk_customer_id)
        REFERENCES customer (customer_id),

	fk_film_id smallint unsigned NOT NULL,
    FOREIGN KEY (fk_film_id)
        REFERENCES film (film_id),

	fk_num_stars INT NOT NULL,
    FOREIGN KEY (fk_num_stars)
        REFERENCES rating (numberOfStars)
);

INSERT INTO customer_ratings(customer_rating, fk_film_id, fk_num_stars) 
VALUES  (1, 1, 5), (1, 2, 1), (1, 3, 4), (1, 4, 4), (1, 5, 5),
(1, 1, 5), (1, 2, 1), (1, 3, 3), (1, 4, 2), (1, 5, 1),
(1, 1, 4), (1, 2, 4), (1, 3, 5), (1, 4, 5), (1, 5, 4),
(1, 1, 1), (1, 2, 3), (1, 3, 1), (1, 4, 3), (1, 5, 2),
(1, 1, 3), (1, 2, 4), (1, 3, 4), (1, 4, 2), (1, 5, 5);

SELECT 
    film.film_id,
    film.title AS Movie,
    AVG(fk_num_stars) AS 'Average Rating',
    MIN(fk_num_stars) AS 'Lowest Rating',
    MAX(fk_num_stars) AS 'Highest Rating',
    COUNT(customer_rating) AS '# of Ratings Recieved'
FROM customer_ratings
	INNER JOIN film 
			ON customer_ratings.fk_film_id = film.film_id
    INNER JOIN rating 
			ON customer_ratings.fk_num_stars = rating.numberOfStars
GROUP BY title
ORDER BY title;