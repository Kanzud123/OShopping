ALTER TABLE PRODUCT
ADD P_Image image
CREATE TABLE ORDERS
(
OrderId int IDENTITY(1,1) PRIMARY KEY,
CustomerId int NOT NULL FOREIGN KEY REFERENCES CUSTOMERS (CustomerId),
ProductId int NOT NULL FOREIGN KEY REFERENCES PRODUCT (P_Id),
OrderDate date NULL,
OrderAmount int  NULL,
Price int NULL,
DelivaryCharge int NULL,
TotalPrice int NULL,
) 
