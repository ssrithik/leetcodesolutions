SELECT 
p.product_name,
s.year,
s.price
FROM Product as p
 JOIN Sales as s
ON p.product_id = s.product_id;
