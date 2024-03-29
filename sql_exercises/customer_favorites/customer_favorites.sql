use sakila;
WITH customer_rentals
AS (SELECT 
ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY customer_id, name) AS rownum1, 
customer_id,  
category.name
from rental
join inventory on inventory.inventory_id = rental.inventory_id
join film on film.film_id = inventory.film_id
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
GROUP BY customer_id, rental_date
order by customer_id, rental_date)

SELECT customer.first_name AS 'first name', customer.last_name AS 'last name', name AS 'most frequently rented' FROM (
SELECT * ,
ROW_NUMBER() OVER (PARTITION BY customer_id ORDER BY customer_id, rownum2 DESC) AS rownum3
FROM (
SELECT 
ROW_NUMBER() OVER (PARTITION BY customer_id, name ORDER BY customer_id) AS rownum2,
customer_rentals.rownum1,
customer_id,
customer_rentals.name
FROM customer_rentals
WHERE 
customer_rentals.rownum1 <=10 ) AS x) AS y
join customer on customer.customer_id = y.customer_id
WHERE rownum3 = 1
	AND first_name 
    LIKE '%n%' OR '%c%'OR '%s%' 
    AND last_name 
    LIKE '%n%' OR '%c%' OR '%s%';

    