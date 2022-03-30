USE sakila;
SHOW TABLES;
DROP TABLE IF EXISTS ratings;

CREATE TABLE ratings
(
numberOfStars INT, 
starDescription varchar(100), 
PRIMARY KEY (numberOfStars)
);

INSERT INTO ratings(numberOfStars, starDescription)
VALUES (0, "worst movie ever"),
(1, "Very Bad"),
(2, "Bad"),
(3, "Average"),
(4, "Very Good"),
(5, "Amazing");

SELECT * FROM ratings;