USE sakila;
SHOW TABLES;
SELECT * FROM rental;
SELECT rental_id AS 'rental id', 
date(rental_date) AS 'date of rental', 
inventory_id AS 'inventory id', 
customer_id AS 'customer id', 
date(return_date) IS NOT NULL AS 'return date', 
staff_id AS 'staff id', 
date(last_update) AS 'last updated'
FROM rental WHERE TIME(rental_date) <'10:00'
order by last_update DESC LIMIT 10;