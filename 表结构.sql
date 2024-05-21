-- 
-- Set character set the client will use to send SQL statements to the server
--
SET NAMES 'utf8';

--
-- Set default database
--
create database myemployees1;
USE myemployees1;

--
-- Create table `locations`
--
CREATE TABLE locations (
  location_id int NOT NULL AUTO_INCREMENT,
  street_address varchar(40) DEFAULT NULL,
  postal_code varchar(12) DEFAULT NULL,
  city varchar(30) DEFAULT NULL,
  state_province varchar(25) DEFAULT NULL,
  country_id varchar(2) DEFAULT NULL,
  PRIMARY KEY (location_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 3201,
AVG_ROW_LENGTH = 712,
CHARACTER SET gb2312,
COLLATE gb2312_chinese_ci;

--
-- Create table `departments1`
--
CREATE TABLE departments1 (
  department_id int NOT NULL AUTO_INCREMENT,
  department_name varchar(3) DEFAULT NULL,
  manager_id int DEFAULT NULL,
  location_id int DEFAULT NULL,
  PRIMARY KEY (department_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 307,
AVG_ROW_LENGTH = 512,
CHARACTER SET gb2312,
COLLATE gb2312_chinese_ci;

--
-- Create foreign key
--
ALTER TABLE departments1
ADD CONSTRAINT loc_id_fk FOREIGN KEY (location_id)
REFERENCES locations (location_id);

--
-- Create table `employees1`
--
CREATE TABLE employees1 (
  employee_id int NOT NULL AUTO_INCREMENT,
  first_name varchar(20) DEFAULT NULL,
  last_name varchar(25) DEFAULT NULL,
  email varchar(25) DEFAULT NULL,
  phone_number varchar(20) DEFAULT NULL,
  job_id varchar(10) DEFAULT NULL,
  salary double(10, 2) DEFAULT NULL,
  commission_pct double(4, 2) DEFAULT NULL,
  manager_id int DEFAULT NULL,
  department_id int DEFAULT NULL,
  hiredate datetime DEFAULT NULL,
  PRIMARY KEY (employee_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 217,
AVG_ROW_LENGTH = 151,
CHARACTER SET gb2312,
COLLATE gb2312_chinese_ci;

--
-- Create index `firs_name_index` on table `employees1`
--
ALTER TABLE employees1
ADD INDEX firs_name_index (first_name);

--
-- Create foreign key
--
ALTER TABLE employees1
ADD CONSTRAINT FK_employees_department_id FOREIGN KEY (department_id)
REFERENCES departments1 (department_id);

CREATE TABLE jobs (
                    job_id varchar(10) NOT NULL,
                    job_title varchar(35) DEFAULT NULL,
                    min_salary int DEFAULT NULL,
                    max_salary int DEFAULT NULL,
                    PRIMARY KEY (job_id)
)
  ENGINE = INNODB,
  AVG_ROW_LENGTH = 862,
  CHARACTER SET gb2312,
  COLLATE gb2312_chinese_ci;
--
-- Create table `type`
--
# CREATE TABLE type (
#   type_id int NOT NULL AUTO_INCREMENT,
#   name varchar(50) NOT NULL,
#   PRIMARY KEY (type_id)
# )
# ENGINE = INNODB,
# AUTO_INCREMENT = 5,
# AVG_ROW_LENGTH = 4096,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create table `goods`
# --
# CREATE TABLE goods (
#   goods_id int NOT NULL AUTO_INCREMENT,
#   name varchar(50) NOT NULL,
#   price decimal(10, 2) NOT NULL,
#   type_id int NOT NULL,
#   image_url varchar(100) DEFAULT NULL,
#   status int NOT NULL,
#   stock int NOT NULL,
#   details text DEFAULT NULL,
#   add_time datetime DEFAULT NULL,
#   on_sale_time datetime DEFAULT NULL,
#   off_sale_time datetime DEFAULT NULL,
#   PRIMARY KEY (goods_id)
# )
# ENGINE = INNODB,
# AUTO_INCREMENT = 4,
# AVG_ROW_LENGTH = 8192,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create foreign key
# --
# ALTER TABLE goods
# ADD CONSTRAINT goods_ibfk_1 FOREIGN KEY (type_id)
# REFERENCES type (type_id);
#
# --
# -- Create table `grade`
# --
# CREATE TABLE grade (
#   grade_id int NOT NULL,
#   grade_name varchar(20) DEFAULT NULL,
#   PRIMARY KEY (grade_id)
# )
# ENGINE = INNODB,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create table `student`
# --
# CREATE TABLE student (
#   sno int NOT NULL AUTO_INCREMENT,
#   sname varchar(20) NOT NULL,
#   start_year year DEFAULT NULL,
#   birth date DEFAULT NULL,
#   grade int DEFAULT NULL,
#   gender varchar(10) DEFAULT NULL,
#   PRIMARY KEY (sno)
# )
# ENGINE = INNODB,
# AUTO_INCREMENT = 4,
# AVG_ROW_LENGTH = 8192,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create foreign key
# --
# ALTER TABLE student
# ADD CONSTRAINT FK_student_grade FOREIGN KEY (grade)
# REFERENCES grade (grade_id);
#
# --
# -- Create table `user`
# --
# CREATE TABLE user (
#   user_id int NOT NULL AUTO_INCREMENT,
#   username varchar(50) NOT NULL,
#   password varchar(50) NOT NULL,
#   phone varchar(20) NOT NULL,
#   email varchar(50) DEFAULT NULL,
#   avatar_url varchar(100) DEFAULT NULL,
#   status int NOT NULL,
#   role int NOT NULL DEFAULT 1,
#   balance decimal(10, 2) DEFAULT NULL,
#   PRIMARY KEY (user_id)
# )
# ENGINE = INNODB,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create index `email` on table `user`
# --
# ALTER TABLE user
# ADD UNIQUE INDEX email (email);
#
# --
# -- Create index `phone` on table `user`
# --
# ALTER TABLE user
# ADD UNIQUE INDEX phone (phone);
#
# --
# -- Create table `cart`
# --
# CREATE TABLE cart (
#   cart_id int NOT NULL AUTO_INCREMENT,
#   user_id int NOT NULL DEFAULT 0,
#   goods_id int NOT NULL,
#   add_time datetime DEFAULT NULL,
#   quantity int NOT NULL,
#   PRIMARY KEY (cart_id)
# )
# ENGINE = INNODB,
# AUTO_INCREMENT = 5,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create foreign key
# --
# ALTER TABLE cart
# ADD CONSTRAINT cart_ibfk_1 FOREIGN KEY (user_id)
# REFERENCES user (user_id);
#
# --
# -- Create foreign key
# --
# ALTER TABLE cart
# ADD CONSTRAINT cart_ibfk_2 FOREIGN KEY (goods_id)
# REFERENCES goods (goods_id);
#
# --
# -- Create table `users`
# --
# CREATE TABLE users (
#   user_id int NOT NULL AUTO_INCREMENT,
#   username varchar(50) NOT NULL,
#   password varchar(50) NOT NULL,
#   phone varchar(20) NOT NULL,
#   email varchar(50) DEFAULT NULL,
#   avatar_url varchar(100) DEFAULT NULL,
#   status int DEFAULT 1,
#   role int NOT NULL DEFAULT 1,
#   balance decimal(10, 2) DEFAULT NULL,
#   PRIMARY KEY (user_id)
# )
# ENGINE = INNODB,
# AUTO_INCREMENT = 6,
# AVG_ROW_LENGTH = 4096,
# CHARACTER SET utf8mb4,
# COLLATE utf8mb4_0900_ai_ci;
#
# --
# -- Create index `email` on table `users`
# --
# ALTER TABLE users
# ADD UNIQUE INDEX email (email);
#
# --
# -- Create index `phone` on table `users`
# --
# ALTER TABLE users
# ADD UNIQUE INDEX phone (phone);
#
# --
# -- Create table `user1`
# --
# CREATE TABLE user1 (
#   user_id int NOT NULL AUTO_INCREMENT,
#   username varchar(50) NOT NULL,
#   password varchar(50) NOT NULL,
#   phone varchar(20) NOT NULL,
#   email varchar(50) DEFAULT NULL,
#   avatar_url varchar(100) DEFAULT NULL,
#   status int NOT NULL,
#   role int NOT NULL DEFAULT 1,
#   balance decimal(10, 2) DEFAULT NULL,
#   PRIMARY KEY (user_id)
# )
# ENGINE = INNODB,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create index `email` on table `user1`
# --
# ALTER TABLE user1
# ADD UNIQUE INDEX email (email);
#
# --
# -- Create index `phone` on table `user1`
# --
# ALTER TABLE user1
# ADD UNIQUE INDEX phone (phone);
#
# --
# -- Create table `user01`
# --
# CREATE TABLE user01 (
#   user_id int NOT NULL AUTO_INCREMENT,
#   username varchar(50) NOT NULL,
#   password varchar(50) NOT NULL,
#   phone varchar(20) NOT NULL,
#   email varchar(50) DEFAULT NULL,
#   avatar_url varchar(100) DEFAULT NULL,
#   status int NOT NULL,
#   role int NOT NULL DEFAULT 1,
#   balance decimal(10, 2) DEFAULT NULL,
#   PRIMARY KEY (user_id)
# )
# ENGINE = INNODB,
# CHARACTER SET gb2312,
# COLLATE gb2312_chinese_ci;
#
# --
# -- Create index `email` on table `user01`
# --
# ALTER TABLE user01
# ADD UNIQUE INDEX email (email);
#
# --
# -- Create index `phone` on table `user01`
# --
# ALTER TABLE user01
# ADD UNIQUE INDEX phone (phone);

--
-- Create table `jobs`
--
