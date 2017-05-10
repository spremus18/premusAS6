# To run it:
# mysql -u root -p < schedule.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS schd_db;
CREATE DATABASE schd_db;
USE schd_db;

CREATE TABLE employee(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(100)
);

INSERT INTO employee (name) VALUES ("Dr. Evil");
INSERT INTO employee (name) VALUES ("Mini Me");
INSERT INTO employee (name) VALUES ("Number Two");
INSERT INTO employee (name) VALUES ("Austin Powers");

CREATE TABLE skill(
   id INT AUTO_INCREMENT PRIMARY KEY,
   skills VARCHAR(300)
);

INSERT INTO skill (skills) VALUES ("Butcher, Saucier, Baker");
INSERT INTO skill (skills) VALUES ("Saucier, Baker");
INSERT INTO skill (skills) VALUES ("Butcher, Dishwasher");
INSERT INTO skill (skills) VALUES ("Baker, Saucier");

CREATE TABLE availablity(
   id INT AUTO_INCREMENT PRIMARY KEY,
   avail INT
);

INSERT INTO availablity (avail) VALUES (18);
INSERT INTO availablity (avail) VALUES (24);
INSERT INTO availablity (avail) VALUES (14);
INSERT INTO availablity (avail) VALUES (14);

CREATE TABLE objects(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(300),
   val TEXT);   

