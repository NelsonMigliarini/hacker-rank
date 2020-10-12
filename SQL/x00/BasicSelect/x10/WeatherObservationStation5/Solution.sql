/*
* @Autor Nelson Migliarini
*/
-- Oracle
select * from(select city, length(city) from station order by length(city), city) where rownum = 1;
select * from(select city, length(city) from station order by length(city) desc, city) where rownum = 1;
-- MySQL
select city, length(city) from station order by length(city) asc, city asc limit 1;
select city, length(city) from station order by length(city) desc limit 1;