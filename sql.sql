--querying
select * from "Employee"  ;
select * from "Employee"  where "LastName"  = 'King';
select * from "Employee"  where "FirstName" = 'Andrew' and "ReportsTo" = NULL;
select * from "Album"  order by "Title"  desc  ;
select "FirstName", "City"  from "Customer" order by "City" asc ; 
select * from "Invoice" where "BillingAddress" like 'T%';
select * from "Invoice" where "Total" between 15 and 50;
select * from "Employee" where "HireDate" between '06-01-2003' and '03-01-2004';

--insert
insert into "Genre" values (26,'jazz');
insert into "Genre" values (27,'jazz');
insert into "Employee" values (10, 'Talballa', 'Mosaab', 'Dr', 1, '1990-09-09', 
'2022-08-01', '14692 Endsely turn', 'Fairfax', 'VA', 'Fairfax', '22193', 
5712284746,5555555555, 'mosaab@gmail.com');
insert into "Employee" values (15, 'Kimmah', 'ken', 'IT', 4, '1997-09-09', 
'2022-08-01', '14692 Endsely turn', 'Montogomery', 'MD', 'Fairfax', '22193', 
5712284733,7777777777, 'kim@gmail.com');
insert into "Customer" values (200, 'Mohsin','khalid','Amazon','122 Little', 
'Woodbridge', 'VA','USA','22003','5712284746','5716627777',
'tyggh@amazon.net', 1);
insert into "Customer" values (203, 'Zein','Razi','Revature','122 Bigger', 
'Woodbridge', 'VA','USA','22003','5712284746','5716627777',
'tyrrrr@yahoo.net', 3);

--update
update "Customer" set "FirstName"  = 'Robert' where "FirstName" = 'Aaron';
update "Customer" set "LastName"  = 'Walter' where "LastName" = 'Mitchell';
update "Artist" set "Name" = 'CCR' where "Name" like  'Creedence%';



