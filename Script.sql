--DROP DATABASE oop;

--CREATE DATABASE oop;

DROP TABLE `products`;

DROP TABLE `users`;

DROP TABLE `customers`;

CREATE TABLE `oop`.`products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `products_name` varchar(45) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `oop`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`idusers`));

INSERT INTO oop.users (`idusers`,`username`, `password`) VALUES (null,"test","test");

CREATE TABLE `oop`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customers_name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `contact` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));