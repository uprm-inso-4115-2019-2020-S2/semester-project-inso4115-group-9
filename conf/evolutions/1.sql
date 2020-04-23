-- Users schema

-- !Ups

CREATE TABLE User (
    uid SERIAL PRIMARY KEY,
    uFirstName varchar(20),
    uLastName varchar(40),
    uEmail varchar(20),
    uPhone varchar(10),
    uDOB DATE,
    uAddress varchar(100),
    uCity varchar(30),
    uZipCode varchar(10),
    uCountry varchar(20)
);