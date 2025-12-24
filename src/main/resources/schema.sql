CREATE TABLE customer (
                          id INT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          email VARCHAR(150) NOT NULL UNIQUE,
                          phone VARCHAR(15),
                          city VARCHAR(100)
);

