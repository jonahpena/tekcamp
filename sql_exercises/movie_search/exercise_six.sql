SELECT 
    title, length
FROM
    film
WHERE
    (title LIKE '%A%' OR title LIKE '%B%'
        OR title LIKE '%C%') AND (length > 120);