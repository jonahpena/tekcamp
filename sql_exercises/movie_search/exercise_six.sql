SELECT 
    title, length
FROM
    film
WHERE
    (title LIKE '%A%' AND title LIKE '%B%'
        AND title LIKE '%C%') AND (length > 120);