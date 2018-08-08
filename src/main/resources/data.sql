create table trade
(
tradeId varchar (255) not null,
stockName varchar (255),
brokerCode varchar (255),
brokerName varchar (255),
quantity integer ,
tradeDate date,
settlementDate date ,
buySellIndicator varchar(1)
);

insert into trade 
values ('234','IBM','MS','Morgan Stanley',300,TO_DATE('05/15/2018','MM/DD/YYYY'),TO_DATE('05/12/2018','MM/DD/YYYY'),'B');