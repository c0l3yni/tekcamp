USE sakila;
SHOW TABLES;
SELECT first_name, last_name FROM customer
WHERE first_name LIKE '%n%' OR '%c%' OR '%s%' AND last_name LIKE '%n%' OR '%c%' OR '%s%';
