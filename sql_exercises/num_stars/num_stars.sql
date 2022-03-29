USE sakila;
SHOW TABLES;
DROP TABLE IF EXISTS rating;
CREATE TABLE rating
(
primary_key INT AUTO_INCREMENT PRIMARY KEY,
num_of_stars INT UNIQUE NOT NULL,
star_description VARCHAR(50) NOT NULL
);
INSERT INTO rating(num_of_stars, star_description)
VALUES (0, 'worst movie ever'),
(1, 'pretty bad movie'),
(2, 'meh movie'),
(3, 'it was alright'),
(4, 'that was decent'),
(5, 'phenomenal');
SELECT * FROM rating;