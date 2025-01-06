Use Coffee
/* insert data to product cagtergory*/
SET IDENTITY_INSERT product_cag ON;

INSERT INTO product_cag(id,cagname) values (1,'Instant Coffee');
INSERT INTO product_cag(id,cagname) values (2,'Roasted Coffee');
INSERT INTO product_cag(id,cagname) values (3,'Additives');
INSERT INTO product_cag(id,cagname) values (4,'Accessories ');

SET IDENTITY_INSERT product_cag OFF;

/*insert data to product coffee */

SET IDENTITY_INSERT productcoffee ON;
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (1,'G7 Instant Coffee','TrungNguyen',N'\images\G7instant.png',40,2,1 );
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (2,'MrViet Roasted Coffee','MrViet',N'\images\Arabica.png',10,6, 2);
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (3,'NestCafe Instant Coffee','NestCafe',N'\images\nestcafe.png',20,6,1 );
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (4,'NestCafe Robusta Roasted Coffee','NestCafe',N'\images\robusta.png',100,6, 2);
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (5,'Caphechon','Kofe',N'\images\chon.png',5,25,2 );
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (6,'Coffee Fillter','TrungNguyen',N'\images\Accessories.png',50,4, 4);
INSERT INTO productcoffee(coffeeid,coffeename,coffeebrand,coffeeimg,quantity,price,cag_id) values (7,'Ngoi Sao Phuong Nam','Vinamilk',N'\images\ConductMilk.png',50,1, 3);

SET IDENTITY_INSERT productcoffee OFF;


Insert into roles(id,rolename) values(1,'admin');
Insert into roles(id,rolename) values(2,'user');

set identity_insert useraccount ON;

Insert into useraccount(id,roleid,username,userpassword) values (1,1,'admin','admin123');
Insert into useraccount(id,roleid,username,userpassword) values (2,2,'tester','test456');

set identity_insert useraccount OFF;