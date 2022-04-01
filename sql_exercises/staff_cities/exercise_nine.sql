SELECT 
    staff.first_name AS "First Name", staff.last_name AS "Last Name"
FROM
    (((staff
INNER JOIN store ON store.store_id = staff.store_id)
INNER JOIN address ON address.address_id = store.address_id)
INNER JOIN city ON city.city_id = address.city_id)
WHERE (city.city LIKE "Woodridge");