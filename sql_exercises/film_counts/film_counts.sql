USE sakila;
SHOW TABLES;
SELECT COUNT(*) AS 'Inventory in stock', 
store_id, film_id
FROM inventory
GROUP BY film_id;
