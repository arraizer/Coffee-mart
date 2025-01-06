Create database Coffee
Go

CREATE TABLE roles (
	id int primary key,
	rolename VARCHAR (255) NOT NULL
);

Create table useraccount (
	id int IDENTITY(1,1) primary key ,
	username VARCHAR(255) NOT NULL UNIQUE,
	userpassword VARCHAR(255) NOT NULL,
	roleid int,
	FOREIGN KEY (roleid) REFERENCES roles(id)
);


Create table product_cag (
	id int IDENTITY(1,1) primary key,
	cagname varchar(255) not null
);

Create table productcoffee (
	coffeeid int identity(1,1) primary key,
	coffeename varchar(255) not null,
	coffeebrand varchar(255) not null,
	coffeeimg nvarchar(max) not null,
	quantity int not null,
	price decimal(10,2) not null,
	cag_id INT NOT NULL, 
	FOREIGN KEY (cag_id) REFERENCES product_cag(id)
);

Create table shoplist (
	id int IDENTITY(1,1) primary key,
	userid int,
	coffeeid int,
	quantity int not null,
	buydate DATETIME not null,
	foreign key(userid) references useraccount(id),
	foreign key(coffeeid) references productcoffee(coffeeid)
);

INSERT INTO roles (id, rolename) VALUES (1, 'admin');

INSERT INTO useraccount (username, userpassword, roleid) VALUES ('admin', 'admin123', 1);

CREATE ROLE admin;

GRANT CONTROL ON roles TO admin;
GRANT CONTROL ON useraccount TO admin;
GRANT CONTROL ON product_cag TO admin;
GRANT CONTROL ON productcoffee TO admin;
GRANT CONTROL ON shoplist TO admin;

Insert into roles (id,rolename) values (2,'tester');

Insert into useraccount (username,userpassword,roleid) values ('tester','test123',2);

CREATE ROLE user_role;

GRANT SELECT, INSERT ON useraccount TO user_role;
GRANT SELECT ON product_cag TO user_role;
GRANT SELECT ON productcoffee TO user_role;
GRANT SELECT, INSERT ON shoplist TO user_role;

Delete from roles

Alter table shoplist
Drop column buydate;





