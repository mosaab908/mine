--1
update table1 set value = value *-1;
--2
select division_id, revenue  from "Revenue" where revenue > 0;
--3
select year from calender where year/100 + 1;
--4
select value,
case 
when value%2=0
then 'even'
when value %2=1 
then 'odd' 
end as even_odd from Value;
--5
select count(name)as count,age from table5 group by age; 
--6
select id,name, 'Hello, ' || name || ' how are you doing today?'
AS greeting
FROM table6;
--7
select * from table7 ORDER BY Amount_sold desc limit 5;
--8
select name from table8 where country != 'United States';
--9
select distinct age from table9;
--10
select sum(age) from table10;