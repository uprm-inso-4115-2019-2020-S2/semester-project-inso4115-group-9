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

CREATE TABLE Login (
    lid INTEGER REFERENCES User (uid) ON DELETE CASCADE,
    luserName varchar(20),
    lpassword varchar(256),
    PRIMARY KEY (lid)
);

CREATE TABLE Request (
    rid SERIAL PRIMARY KEY,
    rSupplyName varchar(100),
    rTime TIMESTAMP,
    rStatus BOOLEAN,
    rDescription varchar(500),
    uid INTEGER REFERENCES User (uid)
)

CREATE TABLE Donation(
    did SERIAL PRIMARY KEY,
    sSupplyName varchar(100),
    dQuantity INTEGER,
    dTime TIMESTAMP,
    uid INTEGER REFERENCES User (uid)
)