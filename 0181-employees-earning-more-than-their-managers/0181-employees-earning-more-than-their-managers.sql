SELECT
emp.name AS Employee
FROM Employee as emp,Employee as Manager
WHERE emp.managerId = Manager.id AND
emp.salary > Manager.salary


