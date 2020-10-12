/*
* @Autor Nelson Migliarini
*/
-- Oracle
select distinct city from station where mod(id, 2) = 0;
-- MySQL
select distinct city from station where id % 2 = 0;