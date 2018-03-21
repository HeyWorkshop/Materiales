CREATE DATABASE tienda;
USE tienda;

CREATE TABLE category(
	idCat INT(10) NOT NULL AUTO_INCREMENT,
    nameCat VARCHAR(10) NOT NULL,
    PRIMARY KEY (idCat)
);

CREATE TABLE items (
	idItem INT(10) NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    price FLOAT NOT NULL,
    id_cat INT(10) NOT NULL,
    PRIMARY KEY (idItem),
    FOREIGN KEY (id_cat) REFERENCES category(idCat)
);

CREATE TABLE sales(
	idItem INT(10) NOT NULL,
    id_cat INT(10) NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (idItem) REFERENCES items(idItem),
    FOREIGN KEY (id_cat) REFERENCES category(idCat)
);


INSERT INTO category (nameCat) VALUES 
("higiene"),
("comida"),
("ropa");

INSERT INTO items (name, price, id_cat) VALUES
("Papel Higienico", 30, 1),
("Chetos", 15, 2),
("Camiseta", 100, 3),
("Pasta dental", 25, 1),
("Charritos", 28, 2);

UPDATE items SET name = "Papel de baño", price = 28 WHERE idItem = 1;

INSERT INTO items (name, price, id_cat) VALUES
("Jabón", 15, 1);

DELETE FROM items WHERE idItem = 6;	

SELECT * FROM items;

SELECT * FROM items WHERE items.price > 25;

SELECT idItem, name FROM items;

SELECT name, price, nameCat FROM 
items JOIN category 
ON items.id_cat = category.idCat;

SELECT name, price, nameCat FROM 
items JOIN category 
ON items.id_cat = category.idCat
WHERE nameCat = "higiene";