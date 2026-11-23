![[Pasted image 20261116142924.png]]
# Business Rules:
## PRODUCTLINES $\leftrightarrow$ PRODUCTS
- a PRODUCTLINE may have many PRODUCTs
- each PRODUCT is from a PRODUCTLINE
## PRODUCTS $\leftrightarrow$ ORDERDETAILS
- a PRODUCT may appear in many ORDERDETAILS
- each ORDERDETAIL describes a PRODUCT
## ORDERDETAILS $\leftrightarrow$ ORDERS
- each ORDERDETAIL is listed in an ORDER
- an ORDER lists at least one ORDERDETAIL
## ORDERS $\leftrightarrow$ CUSTOMERS
- each ORDER is placed by a CUSTOMER
- a CUSTOMER may place many ORDERs.
## CUSTOMERS $\leftrightarrow$ PAYMENTS
- a CUSTOMER may make many PAYMENTS
- each PAYMENT is made by a CUSTOMER
## CUSTOMERS $\leftrightarrow$ EMPLOYEES
- each CUSTOMER may be addressed by an EMPLOYEE
- an EMPLOYEE may address many CUSTOMERS
## EMPLOYEES $\leftrightarrow$ EMPLOYEES
- There may be an EMPLOYEE that may manage many EMPLOYEES
- each EMPLOYEE may be managed by another EMPLOYEE
## EMPLOYEES $\leftrightarrow$ OFFICES
- each EMPLOYEE has an OFFICE
- An OFFICE may host many EMPLOYEES