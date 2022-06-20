/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  jordanmurray
 * Created: 30 Nov 2021
 */


CREATE TABLE Products (
    productID INTEGER PRIMARY KEY AUTOINCREMENT,
    productBrandName varchar(255),
    productModelName varchar(255),
    productModelYear int NOT NULL,
    productPrice int NOT NULL,
    currentProductLevels varchar(255),
    productAvailability boolean,
    productCondition varchar(255),
    productSize varchar(255),
    productScreenSize varchar(255),
    productProcessor varchar(255),
    productRAM varchar(255),
    productHasOS varchar(255),
    productStorage varchar(255),
    productisAccessory boolean,
    productHasWarranty boolean
 );

CREATE TABLE Employees (
    employeeID INTEGER PRIMARY KEY AUTOINCREMENT,
    employeeFirst varchar(255),
    employeeSurname varchar(255),
    employeePosition varchar(255),
    employeeTypeOfContract varchar(255),
    employeeContractStartDate date,
    employeeContractLength varchar(255),
    employeePayFrequency varchar(255),
    employeeHourlyRate decimal(10,2) NOT NULL
);

CREATE TABLE Customers (
    customerTelephone varchar(255) NOT NULL,
    employeeID int NOT NULL,
    customerFirst varchar(255),
    customerLast varchar(255),
    customerCardCVV varchar(255),
    customerIsMember boolean,
    PRIMARY KEY (customerTelephone),
    FOREIGN KEY (employeeID) REFERENCES Employees (employeeID)
);

CREATE TABLE Transactions (
    transactionID INTEGER PRIMARY KEY AUTOINCREMENT,
    productID int NOT NULL,
    employeeID int,
    transactionDate date,
    transactionAmount int NOT NULL,
    transactionPaymentMethod varchar(255),
    customerTelephone varchar(255) NOT NULL,
    FOREIGN KEY(productID) REFERENCES Products(productID),
    FOREIGN KEY(employeeID) REFERENCES Employees(employeeID),
    FOREIGN KEY(customerTelephone) REFERENCES Customers(customerTelephone)
);

INSERT INTO Employees (employeeFirst, employeeSurname, employeePosition, employeeTypeOfContract, employeeContractStartDate, employeeContractLength, employeePayFrequency, employeeHourlyRate)
VALUES
('Mike', 'Smith', 'Manager', 'Full-Time', '2016-03-17', '5 Years', 'Monthly', 17.50),
('Robin', 'Turing', 'Staff', 'Part-Time', '2020-05-01', '1 Year', 'Weekly', 10.50),
('Jeff', 'Mills', 'Trainee Manager', 'Part-Time', '2021-09-01', '3 Year', 'Monthly', 14.50),
('Patrick', 'Friedman', 'Staff', 'Full-Time', '2019-09-06', '6 Year', 'Weekly', 12.80),
('Adriyano', 'Murphy', 'Manager', 'Full-Time', '2018-07-23', '5 Year', 'Monthly', 18.00),
('Michael', 'Stevens', 'Staff', 'Part-Time', '2019-10-29', '6 Months', 'Weekly', 10.50),
('Rebecca', 'Kavanagh', 'Staff', 'Full-Time', '2020-12-11', '2 Year', 'Weekly', 11.25),
('Shauna', 'Carrol', 'Manager', 'Full-Time', '2019-02-18', '4 Year', 'Monthly', 18.50),
('Lauren', 'Walsh', 'Trainee Manager', 'Part-Time', '2018-02-19', '1 Year', 'Monthly', 16.10),
('Lee', 'Glynn', 'Staff', 'Part-Time', '2021-09-20', '6 Months', 'Monthly', 10.50);

INSERT INTO Customers
VALUES
('085-111-111', 9, 'James', 'Miller', '121', TRUE),
('086-222-222', 8, 'Betty', 'Browne', '778', FALSE),
('087-333-333', 7, 'Paul', 'Andrews', '528', FALSE),
('089-444-444', 6, 'Donna', 'Carroll', '901', TRUE),
('082-555-555', 5, 'George', 'Garcia', '212', FALSE),
('083-666-666', 4, 'Laura', 'Moore', '484', TRUE),
('084-777-777', 3, 'Timothy', 'Davis', '110', FALSE),
('085-888-888', 2, 'Anna', 'Taylor', '050', TRUE),
('086-999-999', 1, 'Samuel', 'Lopez', '882', FALSE),
('087-121-121', 8, 'Debra', 'Thompson', '191', TRUE),
('087-749-008', 6, 'Mark', 'Reed', '009', TRUE),
('085-173-109', 4, 'Paige', 'Murphy', '820', TRUE);

INSERT INTO Transactions (productID, employeeID, transactionDate, transactionAmount, transactionPaymentMethod, customerTelephone)
VALUES
(10, 2, '2020-06-09', 100, 'CARD', '087-121-121'),
(8, 4, '2019-01-22', 350, 'CASH', '086-999-999'),
(6, 6, '2021-03-17', 20, 'CASH', '085-888-888'),
(4, 8, '2021-12-18', 700, 'CARD', '084-777-777'),
(2, 10, '2019-02-14', 900, 'CARD', '083-666-666'),
(1, 9, '2021-09-13', 1100, 'CASH', '082-555-555'),
(3, 7, '2020-08-01', 820, 'CASH', '089-444-444'),
(5, 5, '2019-12-06', 540, 'CARD', '087-333-333'),
(7, 3, '2021-10-02', 750, 'CASH', '086-222-222'),
(9, 1, '2022-02-05', 350, 'CARD', '085-173-109');

INSERT INTO Products (productBrandName, productModelName, productModelYear, productPrice, currentProductLevels, productAvailability, productCondition,
 productSize, productScreenSize, productProcessor, productRAM, productHasOS, productStorage, productisAccessory, productHasWarranty)
VALUES
('Apple', 'MacBook Pro', 2019, 1000, 'HIGH', TRUE, 'NEW', '35cmx24cm', '14inch', 'INTEL', '8GB', 'Apple', '128GB', FALSE, TRUE),
('Dell', 'Infinity Edge', 2020, 1299, 'LOW', FALSE, 'USED', '30.2cmx19cm', '16inch', 'INTEL', '8GB', 'Windows', '256GB', FALSE, FALSE ),
('Lenovo', 'Yoga Slim 7i', 2021, 919, 'VERY HIGH', TRUE, 'NEW', '35cmx23cm', '15.6inch', 'INTEL', '16GB', 'Windows', '1TB', FALSE, TRUE),
('Samsung', 'Galaxy S21', 2018, 699, 'VERY LOW', TRUE, 'USED', '15.17cmx7.21cm', '6.2inch', 'Exynos 2100', '4GB', 'Android', '128GB', FALSE, FALSE),
('Apple', 'iPhone 12', 2020, 807, 'HIGH', TRUE, 'NEW', '13.5cmx6.2cm', '6.1inch', 'A14 Bionic Chip', '4GB', 'Apple', '128GB', FALSE, TRUE),
('Huawei', 'P40 Pro', 2020, 966, 'VERY LOW', FALSE, 'USED', '18.72cmx7.26cm', '6.58inch', 'Octa Core', '4GB', 'Android', '256GB', FALSE, TRUE), 
('Apple', 'Magic Mouse', 2021, 85, 'VERY HIGH', TRUE, 'NEW', '5.71cmx2.16cm', 'N/A', 'N/A', 'N/A', 'Apple', 'N/A', TRUE, TRUE),
('Logitech', 'MX Master', 2018, 92, 'LOW', FALSE, 'USED', '12cmx8.7cm', 'N/A', 'N/A', 'N/A', 'Other', 'N/A', TRUE, FALSE),
('Dell', 'Inspiron 5510', 2021, 700, 'HIGH', TRUE, 'NEW', '35cmx22cm', '15.6inch', 'INTEL Core i5', '8GB', 'Windows', '256GB', FALSE, TRUE),
('Apple', 'iPhone 13', 2021, 929, 'VERY HIGH', TRUE, 'USED', '14cmx7cm', '6.1inch', 'A15 Bionic Chip', '4GB', 'Apple', '126GB', FALSE, FALSE);

 