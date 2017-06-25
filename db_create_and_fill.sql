DROP DATABASE IF EXISTS test;

CREATE DATABASE test;

USE test;

CREATE TABLE `users`
(
	`users_id` INT(8) NOT NULL AUTO_INCREMENT,
	`users_name` VARCHAR(25) NOT NULL,
	`users_age` INT NOT NULL,
	`users_isAdmin` BIT(1) NOT NULL,
	`users_createdDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`users_id`)
)
COLLATE='utf8_general_ci';

INSERT INTO `users` (`users_id`,`users_name`,`users_age`,`users_isAdmin`,`users_createdDate`) VALUES (1,"Alex",21,1,"2014-07-11 16:50:27"),(2,"Bob",22,1,"2016-07-10 01:52:28"),(3,"Nick",33,0,"2017-01-01 18:04:23"),(4,"John",16,0,"2015-12-01 19:14:05"),(5,"Steve",44,1,"2017-02-13 15:07:40"),(6,"Ben",19,0,"2016-09-05 23:56:05"),(7,"Andrew",20,0,"2016-09-05 23:58:05");