SELECT
name
FROM Customer as c
WHERE c.referee_id != 2 OR c.referee_id IS NULL