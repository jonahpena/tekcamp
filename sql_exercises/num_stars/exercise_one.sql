USE sakila;
SHOW TABLES;
DROP TABLE IF EXISTS rating;

CREATE TABLE rating
(
rating_id INT AUTO_INCREMENT PRIMARY KEY,
numberOfStars INT, 
starDescription varchar(100),
UNIQUE (numberOfStars)
);

INSERT INTO rating(numberOfStars, starDescription)
VALUES (0, "Worst movie ever"),
(1, "Very Bad"),
(2, "Bad"),
(3, "Average"),
(4, "Very Good"),
(5, "Amazing");

SELECT * FROM rating;