DROP TABLE `products`;

DROP TABLE `users`;

DROP TABLE `customers`;

DROP TABLE `transactions`;

CREATE TABLE `oop`.`products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `products_name` varchar(45) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `products` VALUES (1,'Pen',20,20),(2,'Books',100,50),(3,'Water Bottles',2,70),(4,'Broom',1,100),(5,'Desk',1,1000);

CREATE TABLE `oop`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`idusers`));

INSERT INTO oop.users (`idusers`,`username`, `password`) VALUES (null,"test","test");
INSERT INTO oop.users (`idusers`,`username`, `password`) VALUES (null,"admin","admin");

CREATE TABLE `oop`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customers_name` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `contact` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `customers` VALUES (1,'Miyuru','No1','miyuru@test.com','1555685'),(2,'Sadeeptha','No5','sadee@test.com','1235777'),(3,'Ravindu','No16','ravindu@test.com','1255566'),(4,'Pirabranjan','No15','pirabranjan@test.com','225566'),(5,'Shamal','No58','shamal@test.com','1223355');

CREATE TABLE `oop`.`transactions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NULL,
  `products` INT NULL,
  `total` INT NULL,
  `customers` INT NULL,
  PRIMARY KEY (`id`));
  
  INSERT INTO `transactions` VALUES (1,'2018-05-19',1,2,1),(2,'2018-05-18',5,1,2),(3,'2018-05-17',2,5,3),(4,'2018-05-21',2,2,1),(5,'2018-05-16',3,1,5),(6,'2018-05-08',2,3,5);
