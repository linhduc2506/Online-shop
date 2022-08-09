
use shop;

CREATE TABLE Roles (
	id int AUTO_INCREMENT not null primary key,
	name varchar(100) not null unique
);

CREATE TABLE Users (
	id int AUTO_INCREMENT not null primary key,
	email varchar(100) not null unique,
	username varchar(100) not null unique,
	password varchar(100) not null,
	address varchar(100),
	phone varchar(100),
	gender varchar(100),
	status varchar(100),
	profile varchar(500),
	avatar varchar(200),
	shortDescription varchar(25),
	emailVerified bit,
	verifyToken varchar(200),
	role int not null, FOREIGN KEY(role) REFERENCES Roles(id),
	deleted bit default 0
);

CREATE TABLE ProductCategories (
	id int AUTO_INCREMENT not null primary key,
	name varchar(50) unique
);

CREATE TABLE Products (
	id int AUTO_INCREMENT not null primary key,
	name varchar(100) not null,
	quantity decimal(19, 6) not null,
	price decimal(19, 6) not null,
	category int not null, FOREIGN KEY(category) REFERENCES ProductCategories(id),
	thumbnail varchar(100),
	description varchar(500),
	unit varchar(20),
	creatorId int not null, FOREIGN KEY(creatorId) REFERENCES Users(id)
);

INSERT INTO Roles (name) VALUES ('user');
INSERT INTO Roles (name) VALUES ('admin');

INSERT INTO Users (username, email, profile, role, address, phone, gender, status, shortDescription, emailVerified, password, avatar)
VALUES ('username', 'someone@email.com', 'Im proud to the first user in this software!', 2, '192 Avenue Street', '0933 485 222', 'Female', 'Married', 'Hi there!', 1, '$31$16$RV53nD3fRxSFviE0HWVqV0Z4hOMb4QBM3iE3Vvu5Gmc', 'https://i.postimg.cc/BZmgq0fT/pexels-dmitriy-ganin-7538060.jpg');
INSERT INTO Users (username, email, profile, role, address, phone, gender, status, shortDescription, emailVerified, password, avatar) 
VALUES ('username1', 'username1@email.com', 'Im proud to the second user in this software!', 1, '24 Long Street', '0942 733 834', 'Male', 'Not married', 'Hello Im Josh!', 1, '$31$16$RV53nD3fRxSFviE0HWVqV0Z4hOMb4QBM3iE3Vvu5Gmc', 'https://i.postimg.cc/CxqHHnB7/pexels-mikhail-nilov-7815116.jpg');
INSERT INTO Users (username, email, profile, role, address, phone, gender, status, shortDescription, emailVerified, password, avatar) 
VALUES ('username2', 'username2@email.com', 'Im proud to the third user in this software!', 1, '293 Wall Street', '0922 483 838', 'Female', 'Undefined', 'Hello Im Jane!', 1, '$31$16$RV53nD3fRxSFviE0HWVqV0Z4hOMb4QBM3iE3Vvu5Gmc', 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg');

INSERT INTO Users (username, email, profile, role, address, phone, gender, status, shortDescription, emailVerified, password, avatar) 
VALUES ('username3', 'username3@email.com', 'Im proud to the third user in this software!', 2, '293 Wall Street', '0922 483 838', 'Female', 'Undefined', 'Hello Im Jane!', 1, '123', 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg');



INSERT INTO Users (email, username, password, role) VALUES ('abc1', 'abc2', '3', 1);

INSERT INTO Users (username, email, profile, role, address, phone, gender, status, shortDescription, emailVerified, password, avatar) 
VALUES ('username4', 'tungvphhe151219@fpt.edu.vn', 'Im proud to the third user in this software!', 2, '293 Wall Street', '0922 483 838', 'Female', 'Undefined', 'Hello Im Jane!', 1, '123', 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg');

CREATE TABLE BlogCategories (
	id int AUTO_INCREMENT not null primary key,
	name varchar(50) unique
);

CREATE TABLE Blogs (
	id int AUTO_INCREMENT not null primary key,
	image varchar(100),
	title varchar(100) not null,
	createdAt Date,
	content varchar(2047),
	category int not null, FOREIGN KEY(category) REFERENCES BlogCategories(id),
	authorId int not null, FOREIGN KEY(authorId) REFERENCES Users(id)
);

INSERT INTO BlogCategories (name) VALUES ('Beauty');
INSERT INTO BlogCategories (name) VALUES ('Food');
INSERT INTO BlogCategories (name) VALUES ('Life Style');
INSERT INTO BlogCategories (name) VALUES ('Travel');

INSERT INTO Blogs (title, createdAt, category, authorId, image, content) VALUES ('6 Ways To Prepare Breakfast For 30', '2021-06-09', 1, 1, 'https://i.postimg.cc/BZmgq0fT/pexels-dmitriy-ganin-7538060.jpg', 'Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus. Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.');
INSERT INTO Blogs (title, createdAt, category, authorId, image, content) VALUES ('Visit the clean farm in the US', '2021-06-09', 2, 2, 'https://i.postimg.cc/sgkmt4db/pexels-rajesh-tp-1633525.jpg', 'Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus. Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.');
INSERT INTO Blogs (title, createdAt, category, authorId, image, content) VALUES ('Cooking tips make cooking simple', '2021-06-09', 1, 1, 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg', 'Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus. Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.');
INSERT INTO Blogs (title, createdAt, category, authorId, image, content) VALUES ('The Moment You Need To Remove Garlic From The Menu', '2021-06-09', 3, 1, 'https://i.postimg.cc/zvGFndKH/pexels-lo-2329440.jpg', 'Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus. Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.');
INSERT INTO Blogs (title, createdAt, category, authorId, image, content) VALUES ('9 Kinds Of Vegetable Protect The Liver', '2021-06-09', 1, 2, 'https://i.postimg.cc/zvGFndKH/pexels-lo-2329440.jpg', 'Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Proin eget tortor risus. Donec rutrum congue leo eget malesuada. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Donec sollicitudin molestie malesuada. Nulla quis lorem ut libero malesuada feugiat. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem.');

INSERT INTO ProductCategories (name) VALUES ('Fresh Meat');
INSERT INTO ProductCategories (name) VALUES ('Vegetable');
INSERT INTO ProductCategories (name) VALUES ('Fruits & Nut Gifts');
INSERT INTO ProductCategories (name) VALUES ('Fresh Berries');
INSERT INTO ProductCategories (name) VALUES ('Ocean Foods');
INSERT INTO ProductCategories (name) VALUES ('Butter & Eggs');

INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Crab Pool Security', 30, 50, 1, 'https://i.postimg.cc/BZmgq0fT/pexels-dmitriy-ganin-7538060.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Bananas', 69, 50, 1, 'https://i.postimg.cc/zvGFndKH/pexels-lo-2329440.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Mangos', 30, 50, 2, 'https://i.postimg.cc/sDfNcmsc/pexels-marta-dzedyshko-2067437.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Cucumbers', 96, 50, 3, 'https://i.postimg.cc/CxqHHnB7/pexels-mikhail-nilov-7815116.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Vegetables pack', 125, 50, 4, 'https://i.postimg.cc/sgkmt4db/pexels-rajesh-tp-1633525.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Organic meat', 30, 50, 5, 'https://i.postimg.cc/Y2RXhFYm/pexels-rajesh-tp-1633559.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Porks', 25.5, 50, 6, 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 1);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Vegetable', 83.4, 50, 3, 'https://i.postimg.cc/CxqHHnB7/pexels-mikhail-nilov-7815116.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 2);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Coffee', 125, 50.99, 4, 'https://i.postimg.cc/sgkmt4db/pexels-rajesh-tp-1633525.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 2);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Organic Tea', 39.99, 50, 5, 'https://i.postimg.cc/Y2RXhFYm/pexels-rajesh-tp-1633559.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 2);
INSERT INTO Products (name, price, quantity, category, thumbnail, description, creatorId) VALUES ('Chilli Sauce', 15, 50, 6, 'https://i.postimg.cc/k5Ws9R7G/pexels-rauf-allahverdiyev-1367243.jpg', 'Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Proin eget tortor risus.', 2);

CREATE TABLE Customers (
	id int AUTO_INCREMENT not null primary key,
	email varchar(100),
	fullname varchar(100),
	address varchar(100),
	phone varchar(100),
	gender varchar(100),
    createdAt Date,
    creatorId int not null, FOREIGN KEY(creatorId) REFERENCES Users(id)
);

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username3@email.com', 'Lionel Ronaldo', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username4@email.com', 'Lionel Ronaldo 2', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username5@email.com', 'Lionel Ronaldo 3', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username6@email.com', 'Lionel Ronaldo 4', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Lionel Ronaldo 5', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Lionel Ronaldo 5', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 1', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 1', '293 Wall Street', '0942 733 834', 'Female', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 2', '293 Wall Street', '0942 733 834', 'Female', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 3', '293 Wall Street', '0942 733 834', 'Female', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 4', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 5', '293 Wall Street', '0942 733 834', 'Female', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 6', '293 Wall Street', '0942 733 834', 'Male', '2001-01-01', '5');

INSERT INTO Customers (email, fullname, address, phone, gender, createdAt, creatorId) 
values ('username7@email.com', 'Ronaldo Lionel 7', '293 Wall Street', '0942 733 834', 'Female', '2001-01-01', '5');

create table FeedbackLists (
	id int AUTO_INCREMENT not null primary key,
    userID int not null ,
    productID int not null ,
    rateStar int not null,
    cmt varchar(100),
    status boolean
);
INSERT INTO `feedbacklists` VALUES (1,'1','1',5,'Đẹp',NULL),
(2,'1','2',5,'Chất vải rất thích',NULL),(3,'1','3',5,'Đáng yêu',NULL),(4,'1','4',5,NULL,NULL),
(5,'1','5',5,'Shop giao hàng nhanh',NULL),(6,'1','6',4,'Tạm ổn',NULL),
(7,'1','7',5,NULL,NULL),(8,'4','8',1,'Tệ',NULL),(9,'4','9',2,NULL,NULL),
(10,'4','10',3,NULL,NULL),(11,'4','11',3,NULL,NULL),(12,'4','12',3,NULL,NULL),(13,'4','13',3,NULL,NULL),
(14,'4','14',3,NULL,NULL),(15,'4','15',3,NULL,NULL);

CREATE TABLE settingList (
	id int AUTO_INCREMENT not null primary key,
	stype varchar(100),
	svalue varchar(100),
	sorder varchar(100),
	sclass varchar(100),
    sstatus varchar(100)
);

INSERT INTO settingList (stype, svalue, sorder, sclass ,sstatus)
VALUES ('Account Setting', 'Web Setting1', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Page Setting', 'Web Setting2', 'Change the task of page', 'label label-danger', 'deactivate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Role Setting', 'Web Setting3', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Account Setting', 'Web Setting4', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Page Setting', 'Web Setting5', 'Change the task of page', 'label label-danger', 'deactivate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Role Setting', 'Web Setting6', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Account Setting', 'Web Setting7', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Page Setting', 'Web Setting8', 'Change the task of page', 'label label-success', 'activate');
INSERT INTO settingList (stype, svalue, sorder, sclass, sstatus)
VALUES ('Role Setting', 'Web Setting9', 'Change the task of page', 'label label-danger', 'deactivate');

CREATE TABLE OrderStatus (
	id int AUTO_INCREMENT not null primary key,
	status varchar(50) not null unique
);

CREATE TABLE Orders (
	id int AUTO_INCREMENT not null primary key,
	buyerId int not null, FOREIGN KEY(buyerId) REFERENCES Users(id),
	createdAt Date,
	updatedAt Date,
	status int not null, FOREIGN KEY(status) REFERENCES OrderStatus(id)
);

CREATE TABLE OrderProduct (
	id int AUTO_INCREMENT not null primary key,
	orderId int not null, FOREIGN KEY(orderId) REFERENCES Orders(id),
	productId int not null, FOREIGN KEY(productId) REFERENCES Products(id),
	quantity int not null
);

INSERT INTO OrderStatus (status) VALUES ('cart');
INSERT INTO OrderStatus (status) VALUES ('completed');

INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (1, 2, '2021-06-09', '2021-06-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-06-09', '2021-06-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-05-09', '2021-05-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-04-09', '2021-04-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-04-09', '2021-04-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-03-09', '2021-03-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 2, '2021-02-01', '2021-02-01');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (1, 1, '2021-05-19', '2021-06-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-03-29', '2021-06-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-02-19', '2021-05-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-03-09', '2021-04-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-01-07', '2021-04-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-05-08', '2021-03-09');
INSERT INTO Orders (status, buyerId, createdAt, updatedAt) VALUES (2, 1, '2021-09-01', '2021-02-01');

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (1, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (1, 6, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (1, 3, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (1, 2, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (1, 5, 3);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (2, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (2, 2, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (2, 3, 5);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (2, 8, 7);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (2, 5, 2);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (3, 1, 6);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (3, 4, 7);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (3, 3, 8);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (3, 2, 9);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (3, 5, 1);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (4, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (4, 2, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (4, 3, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (4, 6, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (4, 5, 4);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (5, 1, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (5, 2, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (5, 3, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (5, 6, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (5, 5, 6);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (6, 1, 5);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (6, 2, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (6, 3, 7);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (6, 7, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (6, 5, 3);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (7, 1, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (7, 6, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (7, 3, 6);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (7, 2, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (7, 5, 2);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (8, 3, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (8, 4, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (8, 7, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (8, 6, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (8, 5, 3);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (9, 8, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (9, 9, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (9, 7, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (9, 2, 6);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (9, 1, 1);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (10, 3, 6);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (10, 2, 7);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (10, 7, 8);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (10, 8, 9);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (10, 1, 1);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (11, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (11, 2, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (11, 7, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (11, 9, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (11, 4, 4);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (12, 2, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (12, 4, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (12, 5, 1);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (12, 7, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (12, 8, 6);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (13, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (13, 2, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (13, 3, 4);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (13, 10, 7);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (13, 5, 8);

INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (14, 1, 2);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (14, 3, 3);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (14, 4, 5);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (14, 8, 6);
INSERT INTO OrderProduct (orderId, productId, quantity) VALUES (14, 6, 8);





