SELECT C.name AS Customers
FROM Customers C
LEFT JOIN Orders O ON C.id=O.customerID
WHERE O.id IS NULL OR O.customerID IS NULL;