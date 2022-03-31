USE sakila;
SHOW TABLES;
SELECT title, length 
FROM film_list
WHERE length > 120 AND
title LIKE '%s%e%n%';

