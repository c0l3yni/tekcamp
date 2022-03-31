USE sakila;
SHOW TABLES;
SELECT 
    first_name AS 'customer first name',
    last_name AS 'customer last name',
    category.name AS 'genre',
    DATE(rental.rental_date)  AS 'date of rental'
FROM
    customer
        JOIN
    rental ON rental.customer_id = customer.customer_id
        JOIN
    inventory ON inventory.inventory_id = rental.inventory_id
        JOIN
    film_category ON film_category.film_id = inventory.film_id
        JOIN
    category ON category.category_id = film_category.category_id
WHERE
    first_name 
    LIKE '%n%' OR '%c%'OR '%s%' 
    AND last_name 
    LIKE '%n%' OR '%c%' OR '%s%'
GROUP BY category.name
ORDER BY COUNT(rental.rental_date) DESC;