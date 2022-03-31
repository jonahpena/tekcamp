SELECT 
    staff.first_name AS "First Name", staff.last_name AS "Last Name"
FROM
    (staff
INNER JOIN city ON staff.staff_id = city.city_id)
WHERE (city.city LIKE "Abha");