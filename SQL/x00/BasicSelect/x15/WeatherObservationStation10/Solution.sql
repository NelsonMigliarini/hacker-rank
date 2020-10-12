/*
* @Autor Nelson Migliarini
*/
-- Oracle
select distinct city from station where regexp_like(city, '.*[^aeiouAEIOU]$');
-- MySQL
select distinct city from station where city rlike '.*[^aeiouAEIOU]$';