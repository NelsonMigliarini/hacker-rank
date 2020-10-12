/*
* @Autor Nelson Migliarini
*/
-- Oracle
select distinct city from station where regexp_like(city, '^[aeiouAEIOU].*[aeiouAEIOU]$');
-- MySQL
select distinct city from station where city rlike '^[aeiouAEIOU].*[aeiouAEIOU]$';