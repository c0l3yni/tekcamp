USE sakila;
DROP TABLE IF EXISTS customer_ratings;
CREATE TABLE customer_ratings (
    rating_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id SMALLINT UNSIGNED NOT NULL,
    film_id SMALLINT UNSIGNED NOT NULL,
    num_of_stars INT NOT NULL,
    CONSTRAINT fk_customer_ratings_film FOREIGN KEY (film_id)
        REFERENCES film (film_id),
    CONSTRAINT fk_customer_ratings_customer FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id),
    CONSTRAINT fk_customer_ratings_rating FOREIGN KEY (num_of_stars)
        REFERENCES rating (num_of_stars)
);
INSERT INTO customer_ratings (customer_id, film_id, num_of_stars)
VALUES 
(1, 2,  1),
(2, 13,  3),
(3, 30,  2),
(4, 32,  4),
(5, 3,  5),
(6, 56,  3),
(7, 12,  2),
(8, 3,  0),
(9, 45,  2),
(10, 12,  3),
(11, 62,  5),
(12, 3,  5),
(13, 23,  4),
(14, 4,  3),
(15, 4,  2),
(16, 7,  1),
(17, 12,  4),
(18, 31,  5),
(19, 32,  3),
(20, 53,  3),
(21, 2,  4),
(22, 67,  3);

SELECT 
film.film_id,
film.title AS 'movie name',
AVG(customer_ratings.num_of_stars) AS 'average star rating',
MIN(customer_ratings.num_of_stars) AS 'lowest rating',
MAX(customer_ratings.num_of_stars) AS 'highest rating',
COUNT(customer_ratings.rating_id) AS 'number of ratings'
FROM 
film 
JOIN 
customer_ratings ON film.film_id = customer_ratings.film_id
GROUP BY customer_ratings.film_id
ORDER BY film_id;