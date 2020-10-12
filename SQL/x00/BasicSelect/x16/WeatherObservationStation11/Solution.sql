/*
* @Autor Nelson Migliarini
*/
-- Oracle
select distinct city from station where regexp_like(city, '^[^AEIOU]|[^aeiou]$');
-- MySQL
select distinct city from station where city rlike '^[^AEIOU]|.*[^aeiou]$';