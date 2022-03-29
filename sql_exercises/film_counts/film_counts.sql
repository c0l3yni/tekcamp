USE sakila;
SHOW TABLES;
SELECT film_id, title, (
SELECT COUNT(*) FROM inventory
WHERE film.film_id = inventory.film_id
) AS 'Number of Copies'
FROM film;