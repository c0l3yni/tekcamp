use sakila;
SHOW TABLES;
SELECT 
    staff_id, first_name, last_name, city
FROM
    staff
        JOIN
    store ON store.store_id = staff.store_id
        JOIN
    address ON address.address_id = store.address_id
        JOIN
    city ON city.city_id = address.city_id
    WHERE city.city = 'Lethbridge';

