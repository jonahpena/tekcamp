SELECT 
    title AS "Movie",
    length AS "Length in Minutes"
FROM
    film
WHERE
    (title LIKE '%A%' AND title LIKE '%B%'
        AND title LIKE '%C%') AND (length > 120);