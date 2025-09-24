SELECT
user_id,
(
    SELECT
    CONCAT(UPPER(SUBSTRING(UPPER(name),1,1)),SUBSTRING(LOWER(name),2,LENGTH(name)))
) AS name

FROM Users
ORDER BY user_id ASC;
