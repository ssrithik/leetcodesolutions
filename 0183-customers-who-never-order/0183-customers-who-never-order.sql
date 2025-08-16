SELECT 
c.name as Customers
FROM Customers as c
WHERE id NOT IN (
    SELECT 
    c.id
    
    FROM Customers as c
    JOIN Orders as o
    ON c.id = o.customerId
);