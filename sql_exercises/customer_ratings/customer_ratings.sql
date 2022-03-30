USE sakila;
DROP TABLE IF EXISTS customer_ratings;
CREATE TABLE customer_ratings (
rating_id INT AUTO_INCREMENT PRIMARY KEY, 
customer_id SMALLINT UNSIGNED NOT NULL,
film_id SMALLINT UNSIGNED NOT NULL,
num_of_stars_id INT NOT NULL,
CONSTRAINT fk_customer_ratings_film FOREIGN KEY(film_id) REFERENCES film(film_id),
CONSTRAINT fk_customer_ratings_customer FOREIGN KEY(customer_id) REFERENCES customer(customer_id),
CONSTRAINT fk_customer_ratings_rating FOREIGN KEY(num_of_stars_id) REFERENCES rating(primary_key)
);
INSERT INTO customer_ratings (customer_id, film_id, num_of_stars_id)
VALUES 
(1, 3,  2),
(2, 1,  3),
(3, 30,  2),
(4, 10,  3),
(5, 30,  2),
(6, 10,  3),
(7, 30,  2),
(8, 10,  3),
(9, 30,  2),
(10, 10,  3),
(11, 30,  2),
(12, 10,  3),
(13, 30,  2),
(14, 10,  3),
(15, 30,  2),
(16, 10,  3),
(17, 30,  2),
(18, 10,  3),
(19, 30,  2),
(20, 10,  3),
(21, 30,  2),
(22, 10,  3);
SELECT 
rating_id, 
(
SELECT title FROM film 
WHERE customer_ratings.film_id = film.film_id
) AS 'film title'

FROM customer_ratings