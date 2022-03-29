USE sakila;
SHOW TABLES;
SELECT first_name, last_name FROM customer
WHERE first_name LIKE 'c%' AND last_name LIKE 'c%';

