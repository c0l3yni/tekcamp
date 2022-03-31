USE sakila;
SHOW TABLES;
SELECT 
    rental.customer_id,
    DATE(rental.rental_date) AS 'rental date',
    COUNT(rental.rental_id) AS 'number of movies rented',
    SUM(payment.amount) AS 'total'
FROM
    rental
        JOIN
    payment ON payment.rental_id = rental.rental_id
	GROUP BY rental.customer_id, DATE(rental_date)
    HAVING COUNT(rental.rental_id) > 1
    ORDER BY rental.customer_id, rental_date;
