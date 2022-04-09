CREATE DATABASE workshop2
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE users
(
    ID       INT(11) AUTO_INCREMENT,
    EMAIL    VARCHAR(255) UNIQUE,
    USERNAME VARCHAR(255),
    PASSWORD VARCHAR(60),
    PRIMARY KEY (ID)
);

# DROP TABLE users;
# DROP DATABASE workshop2;

# dodawanie użytkownika,
INSERT INTO users (EMAIL, USERNAME, PASSWORD)
VALUES (EMAIL = ?, USERNAME = ?, PASSWORD = ?);
# zmiana danych,
UPDATE users
SET EMAIL    = ?,
    USERNAME = ?,
    PASSWORD = ?;
# pobieranie po id,
SELECT *
FROM users
WHERE ID = ?;
# usuwanie po id,
DELETE
FROM users
WHERE ID = ?;
# pobieranie wszystkich użytkowników.
SELECT * FROM users;


DELETE FROM users WHERE TRUE;
