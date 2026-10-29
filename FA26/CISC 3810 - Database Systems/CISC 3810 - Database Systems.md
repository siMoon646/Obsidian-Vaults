# Chapter 1: Database Systems

## Why Databases Matter
- The real world produces huge amounts of data that need to be organized.
- Storing the **relationships** between pieces of data lets us infer new information and support modern business needs.

## Data vs. Information
- **Data**
	- Raw facts that have not yet been processed to reveal their meaning to the end user.
	- The building blocks of information.
- **Information**
	- The result of processing raw data to reveal its meaning in some context.
	- Accurate, relevant, timely information is the key to good decision making.

## Introducing the Database
- **Database (DB):** a shared, integrated computer structure that stores:
	1. **End-user data:** raw facts of interest to the end user.
	2. **Metadata:** "data about data." Describes the characteristics of the data and the relationships that link it, which is how end-user data is integrated and managed.
		- *Example: the metadata for a `CUSTOMER_ID` column says it is a 36-character string (UUID), is required, and must be unique.*
- **Database Management System (DBMS):** a collection of programs that:
	- Manages the database structure.
	- Controls access to the data stored in the database.
	- Acts as the intermediary between users/applications and the database.

### Types of Databases
| Classified by | Type | Description |
|---|---|---|
| **Number of users** | **Single-user** | Supports one user at a time. A **desktop database** is a single-user DB running on a personal computer. |
| | **Multiuser** | Supports multiple users at the same time. A **workgroup database** serves a small group (usually < 50 users); an **enterprise database** serves a whole organization (> 50 users). |
| **Location** | **Centralized** | Data is located at a single site. |
| | **Distributed** | Data is spread across several different sites. |
| | **Cloud** | Created and maintained using cloud data services (e.g., AWS, Azure) that provide defined performance measures for the database. |
| **Type of data** | **General-purpose** | Contains a wide variety of data used in multiple disciplines (e.g., a census database). |
| | **Discipline-specific** | Contains data focused on specific subject areas (e.g., medical or academic research data). |
| **How data is used** | **Operational** (OLTP / transactional) | Designed to support a company's day-to-day operations. |
| | **Analytical** | Stores historical data and business metrics used exclusively for tactical or strategic decision making. Usually a **data warehouse** plus an **OLAP** front end. |

### Types of Data
- **Unstructured data:** exists in its original (raw) state, in the format in which it was collected (e.g., emails, images, video).
- **Structured data:** the result of formatting unstructured data to facilitate storage, use, and the generation of **information** (e.g., rows in a table).
- **Semi-structured data:** processed to some extent (e.g., JSON, XML, a web page). Most data you encounter is best classified as semi-structured.

### Extensible Markup Language (XML)
- A special language used to represent and manipulate data elements in a textual format.
- Commonly used to store and exchange semi-structured data. *(See also Chapter 2.)*

## Why Not Just Use File Systems?
### Structural and Data Dependence
| Term | Meaning | Example |
|---|---|---|
| **Structural dependence** | Access to a file depends on the file's structure. Changing the structure forces every program that uses the file to change. (File systems have this.) | Adding a field to a file breaks every program that reads it. |
| **Structural independence** | The file structure can change without affecting an application's ability to access the data. | Adding a new column to a table does not break programs that read the existing columns. |
| **Data dependence** | A program is tied to the exact way its data is physically stored (data storage characteristics). | A program must be rewritten if a field changes from integer to decimal. |
| **Data independence** | Data storage characteristics can change without affecting a program's ability to access the data. | Changing a field from integer to decimal does not stop the program from accessing it. |

### Data Redundancy
- **Data redundancy:** the same data is stored unnecessarily in different places. Common when organizations keep "islands of information" (separate files per department).
- **Consequences:**
	- **Hard to combine data** from multiple sources.
	- **Poor data security:** more copies of the same data means more chances for unauthorized access.
	- **Data inconsistency:** different, conflicting versions of the same data appear in different places.
	- **Data-entry errors:** likely when complex entries (long, detailed, hard to read) must be typed in repeatedly.
	- **Data integrity problems:** data can be entered without being checked against a single source of truth, so inaccurate data gets in and the data becomes less reliable.

### Data Anomalies
- Develop when not all of the required changes to redundant data are made successfully.

| Anomaly | When it occurs | What goes wrong |
|---|---|---|
| **Update anomaly** | Updating existing data | The same fact is stored in many places, so one change must be made in every place. Miss one and the data becomes inconsistent. |
| **Insertion anomaly** | Inserting new data | You can't add a new fact because some other, unrelated fact isn't available yet. |
| **Deletion anomaly** | Deleting existing data | Deleting one fact accidentally wipes out other facts you wanted to keep, because they were stored together. |

## The Database System
- An organization of components that defines and regulates the collection, storage, management, and use of data within a database environment.

### Components
1. **Hardware:** all the system's physical devices (computers, storage devices, network devices, etc.).
2. **Software:** three types:
	1. **Operating system:** manages all hardware components and makes it possible for all other software to run (e.g., Windows, Linux, macOS).
	2. **DBMS software:** manages the database within the database system (e.g., Microsoft SQL Server, Oracle, MySQL, PostgreSQL).
	3. **Application programs and utility software:**
		- **Application programs** access and manipulate data in the DBMS (e.g., reports, forms, web apps).
		- **Utilities** are tools that help manage the database system's computer components (e.g., a GUI for database management, tools for controlling database access, tools for monitoring database operations).
3. **People:** all users of the database system. Five types:
	1. **System administrators:** oversee the database system's general operations.
	2. **Database administrators (DBAs):** manage the DBMS and make sure the database is working properly.
	3. **Database designers (data architects):** design the database structure.
	4. **System analysts & programmers:** design and implement the application programs.
	5. **End users:** use the application programs to run the organization's daily operations.
4. **Procedures:** the instructions and rules that govern the design and use of the database system.
5. **Data:** the collection of facts stored in the database.

## DBMS Functions
- These are performed by the DBMS; most are **transparent** to end users (they happen without the user seeing them).

1. **Data dictionary management**
	- The **data dictionary** stores the definitions of the data elements and their relationships (the metadata).
2. **Data storage management**
	- Creates and manages the complex structures needed for data storage.
	- Includes **performance tuning**: activities that make the database perform efficiently.
3. **Data transformation and presentation**
	- Transforms entered data to fit the required data structures, and presents stored data in the format users expect, without changing its meaning (e.g., date formats, currency).
4. **Security management**
	- Enforces user security and data privacy (who can access what, and what they can do with it).
5. **Multiuser access control**
	- Lets multiple users access the database concurrently without compromising its integrity.
6. **Backup and recovery management**
	- Provides backups and enables recovery of the database after a failure.
7. **Data integrity management**
	- Enforces integrity rules, minimizing data redundancy and maximizing data consistency.
8. **Database access languages and application programming interfaces (APIs)**
	- Provides data access through a **query language**: a nonprocedural (**declarative**) language that lets the user specify *what* must be done without specifying *how*. **SQL** is the standard.
	- APIs let programs in languages like Java, Python, or C# talk to the DBMS.
9. **Database communication interfaces**
	- Accept end-user requests over different network environments (local network, the internet, web browsers).

## Managing the Database System
### Disadvantages of Database Systems
1. Increased costs (hardware, software, and trained staff).
2. Management complexity.
3. Maintaining currency (keeping the system up to date).
4. Vendor dependence.
5. Frequent upgrade/replacement cycles.

---

# Chapter 2: Data Models

## Data Modeling & Data Models
- **Data model:** a relatively simple representation, usually graphical, of more complex real-world data structures.
- **Data modeling:** the iterative process of creating a data model for a specific problem domain.
- "Data model" and "database model" are often used interchangeably.
- An **implementation-ready** data model should contain at least:
	1. A description of the data structure that will store the end-user data.
	2. A set of enforceable rules to guarantee the integrity of the data.
		- *Example: a rule that each employee ID must be unique.*
	3. A data manipulation methodology to support real-world data transformations.
		- *Example: fields from two different tables might need to be updated in a single transaction.*

## Basic Building Blocks of Data Models
| Block | Definition |
|---|---|
| **Entity** | A person, place, thing, or event about which data is collected (the object of interest). |
| **Attribute** | A characteristic of an entity (data about the entity). |
| **Relationship** | An association between entities. Types: one-to-many (**1:M**), many-to-many (**M:N**), one-to-one (**1:1**). |
| **Constraint** | A restriction placed on the data; helps ensure data integrity. |

## Business Rules
- A brief, precise, and unambiguous description of a policy, procedure, or principle within an organization.
- Used to identify entities, attributes, relationships, and constraints.
- **Sources:**
	- Company managers
	- Policy makers
	- Department managers
	- Written documentation (procedures, standards, manuals)
	- Direct interviews with end users

### Translating Business Rules into Data Model Components
- **Nouns** usually become **entities**.
- **Verbs** (associating nouns) usually become **relationships**.
- Relationships are **bidirectional**, so ask both questions:
	- "How many instances of B relate to one instance of A?"
	- "How many instances of A relate to one instance of B?"
	- *Example: a customer can generate many invoices, and each invoice is generated by only one customer → CUSTOMER 1:M INVOICE.*

## Evolution of Database Models
### Hierarchical Model
- Developed in the 1960s to manage large amounts of data for complex manufacturing projects (e.g., the Apollo rocket program).
- Represented by an **upside-down tree** made of **levels** or **segments**.
	- Each parent can have many children, but each child has **only one parent**.
- Depicts a set of one-to-many (**1:M**) relationships.

### Network Model
- Created to represent complex data relationships more effectively than the hierarchical model.
- Unlike the hierarchical model (one parent per child), a record in the network model **can have more than one parent**.
- Introduced standard database concepts still used today:
	- **Schema:** the conceptual organization of the *entire* database as seen by the DBA: every table, field, and relationship.
		- One schema per database.
	- **Subschema:** the *portion* of the database that a specific application program "sees."
		- Many subschemas can exist, one per application. Each shows the application only the data it needs to produce its output.
	- *Example: a university database's schema includes STUDENT, COURSE, and PAYROLL. The registration app's subschema sees STUDENT and COURSE; the payroll app's subschema sees PAYROLL.*
	- *Memory hook: schema = the whole building's blueprint; subschema = one tenant's floor plan.*
	- **Data Manipulation Language (DML):** defines the environment in which data can be managed; used to work with (insert, update, delete, retrieve) the data in the database.
	- **Data Definition Language (DDL):** enables the DBA to define the schema components.

### Relational Model
- Introduced by **E. F. Codd** (IBM) in 1970.
- Data is stored in **relations** (tables) made of rows and columns. Tables are linked through common attributes.
- Brought **ad hoc query capability**.
	- **Ad hoc query:** a one-off question, written on the spot, that needs an answer right now, instead of one built into a program in advance.

#### Relational Database Management System (RDBMS)
- Keeps data in linked tables, stores each fact once, enforces rules to keep it correct, and lets you ask questions in a structured language.
- Hides the complexity of the physical storage from the user, who sees the database as a collection of tables.
- **Structured Query Language (SQL):** a declarative language: the user specifies *what* data they want, not *how* to retrieve it.
- An SQL-based relational database application involves three parts:
	1. **End-user interface:** lets the user interact with the data.
	2. **Tables stored in the database:** what the user sees.
	3. **SQL engine:** hidden from the user; executes all queries and data requests (works like a compiler/interpreter for SQL).

### Entity Relationship (ER) Model
- Introduced by **Peter Chen** in 1976. Popular for high-level database design because it is graphical.
- **Entity Relationship Diagram (ERD):** a graphical representation of the database's entities, attributes, and relationships.
- **Entity:** the *kind* of thing you track (e.g., CUSTOMER). Corresponds to a whole **table**.
	- Strictly, an entity in an ERD is an **entity set**: the collection of all such things.
- **Entity instance / entity occurrence:** one specific thing; corresponds to a **row** in the table.
- **Attributes:** describe particular characteristics of the entity; correspond to **columns**.
- **Relationship:** describes an association among entities.
- **Connectivity:** labels the *type* of relationship between two entities (1:1, 1:M, M:N).

#### Drawing ERDs
![[Pasted image 20260924102329.png]]

- Common notations: **Chen**, **Crow's Foot**, and **UML class diagram**.
- This semester we use **Crow's Foot** notation.

### Object-Oriented (OO) Data Model
- Data **and** their relationships are contained in a single structure called an **object**.
- **Object:** contains data, their relationships, **and** the operations (methods) that can be performed on the data. The object is self-contained.
- Basis for the **Object-Oriented DBMS (OODBMS)**.

#### Components of the OO Model
1. **Object:** an abstraction of a real-world entity. Roughly equivalent to the ER model's entity *instance*.
2. **Attributes:** describe the properties of an object.
3. **Methods:** represent real-world actions, such as finding a selected PERSON's name, changing a PERSON's name, or printing a PERSON's address. Methods define an object's **behavior**.
4. **Class:** a collection of similar objects with a shared structure (attributes) and behavior (methods). Roughly equivalent to the ER model's entity *set*.
	- Classes are organized in a **class hierarchy** (an upside-down tree).
5. **Inheritance:** the ability of an object within a class hierarchy to inherit the attributes and methods of the classes above it.

#### UML (Unified Modeling Language)
- A language based on OO concepts that describes a set of diagrams and symbols used to graphically model a system.
- **UML class diagrams** can be used to model data, much like an ERD.

### Object/Relational Model & XML
- **Extended Relational Data Model (ERDM):** adds many OO features (objects, classes, inheritance) to the relational model. A DBMS based on it is called an **Object/Relational DBMS (O/R DBMS)**.
- **XML (Extensible Markup Language):**
	- Represents and manipulates data elements in a textual format.
	- Became the standard for **exchanging data** between systems, especially over the internet.
	- Modern O/R DBMSs support XML-based documents.

## Big Data
- Data sets that are too large, too fast, or too varied for traditional relational databases to handle well.
- **Characteristics (the 3 Vs):**
	- **Volume:** the quantity of data being stored.
	- **Velocity:** the speed at which data grows, **and** the speed at which it must be processed to generate information.
	- **Variety:** the variation in data formats (structured, semi-structured, unstructured).
	- *Other Vs sometimes added: veracity (trustworthiness), value, variability, visualization.*

### Problems Big Data Created for Relational Databases
- Not all types of data fit the relational (table) model.
- The volume makes conventional storage solutions impractical.
- Scaling relational databases to that size is expensive.
- OLAP (analysis) tools proved insufficient for unstructured data.

### NoSQL Databases
- A newer generation of databases that address the specific challenges of the **Big Data** era.
- Common characteristics:
	- **Not based on the relational model** (e.g., key-value, document, column, and graph stores).
	- Support **distributed** database architectures.
	- Provide **high scalability, high availability, and fault tolerance**.
	- Handle very large amounts of sparse and unstructured data.
	- Often favor **performance over strict consistency** (eventual consistency).
- Related technologies: **Hadoop** (distributed storage/processing) and **MapReduce**.

---

# Chapter 3: The Relational Database Model

## Relations (Tables)
- The relational model is based on a logical construct called a **relation**, which you can think of as a **table**.
	- It's called a table because it contains a group of related entity occurrences.

### Characteristics of a Relational Table
1. A table is a two-dimensional structure made of **rows** and **columns**.
2. Each **row (tuple)** represents a single entity occurrence (instance) in the entity set.
3. Each **column** represents an **attribute** and has a distinct name.
4. Each intersection of a row and column contains a **single data value** about an entity.
5. All values in a column must conform to the same data format (same **domain**).
6. Each column has a specific range of values called the **attribute domain**.
7. The order of rows and columns is **unimportant** to the DBMS.
8. Each table must have an attribute or combination of attributes that **uniquely identifies each row** (the primary key).

## Keys
- **Key:** one or more attributes that determine other attributes.
- **Composite key:** a key made up of more than one attribute.
- **Key attribute:** any attribute that is part of a key.

| Key type | Definition |
|---|---|
| **Superkey** | An attribute or combination of attributes that uniquely identifies each row in the table. May contain extra, unnecessary attributes. |
| **Candidate key** | A **minimal** superkey: a superkey with no unnecessary attributes (removing any attribute would make it no longer unique). A table can have several. Called "candidate" because the designer picks the primary key from among them. |
| **Primary key (PK)** | The candidate key chosen to uniquely identify all other attribute values in any given row. Cannot contain nulls. |
| **Foreign key (FK)** | An attribute (or attributes) in one table whose values must match the primary key of another table, or be null. Creates the common attribute that links two tables. |
| **Secondary key** | An attribute (or attributes) used strictly for **data retrieval** purposes; does not have to be unique (e.g., searching customers by last name). |

> **Hierarchy:** every primary key is a candidate key, and every candidate key is a superkey, but not the other way around.

## Dependencies
- **Determination:** the state in which knowing the value of one attribute makes it possible to determine the value of another.
	- *Example: if you store `PRODUCTION_COST` and `SALE_PRICE`, then `PROFIT = SALE_PRICE − PRODUCTION_COST`, so PROFIT is determined by those two attributes.*
	- Written `A → B`: "A determines B." **A** is the **determinant**; **B** is the **dependent**.
- **Functional dependence:** the value of one or more attributes determines the value of one or more other attributes.
	- *Example: `STU_NUM → STU_LNAME`. Knowing a student's number tells you their last name.*
	- Usually the determinant is the primary key, which determines all other attributes in the row.
- **Full functional dependence:** a functional dependency in which the **entire** collection of attributes in the determinant is needed for the dependency (no subset of it would work).
- **Partial dependency:** an attribute depends on only **part** of a composite primary key instead of the whole key.
- **Transitive dependency:** an attribute depends on another non-key attribute (`A → B` and `B → C`, so `A → C`).

## Integrity Rules
### Entity Integrity
- The condition in which each row (entity instance) in the table has its own unique identity.
- **Requirements:**
	1. All primary key values must be **unique**.
	2. No attribute in the primary key can be **null**.
- **Null:** the absence of any data value. It is **not** zero or a blank space. Nulls should be avoided where possible because they can mean "unknown," "doesn't exist," or "not applicable."

### Referential Integrity
- Every foreign key value must either be **null** (if allowed) or **match a primary key value** of an existing row in the related table.
- Guarantees that every reference points to a valid entity.

### Other Constraints
- **NOT NULL:** placed on a column to ensure that every row in the table has a value for that column.
- **UNIQUE:** placed on a column to ensure that no duplicate values exist in that column.

## Relational Algebra
- A theoretical way of manipulating table contents using **relational operators**.
- **Closure:** every relational operator takes relations (tables) as input and produces a new relation as output. Operators **do not modify** the original tables.
- **Relvar** (relation variable): a variable that holds a relation.
	- Has two parts:
		- **Heading:** the names of the attributes.
		- **Body:** the relation itself (the rows/tuples of data).

### Relational Set Operators
| Operator | Type | Result |
|---|---|---|
| **SELECT** (a.k.a. RESTRICT) | Unary | A **horizontal** subset of a table: only the **rows** that meet a condition. |
| **PROJECT** | Unary | A **vertical** subset of a table: only the chosen **columns**. |
| **UNION** | Binary | All rows from both tables, with **duplicate rows removed**. Tables must be union-compatible. |
| **INTERSECT** | Binary | Only the rows that appear in **both** tables. Tables must be union-compatible. |
| **DIFFERENCE** (MINUS) | Binary | All rows in the first table that are **not** in the second. Tables must be union-compatible. |
| **PRODUCT** (Cartesian product) | Binary | Every possible pair of rows from the two tables. If table A has *m* rows and B has *n* rows, the result has *m × n* rows. |
| **JOIN** | Binary | Combines rows from two or more tables based on related columns (see below). |
| **DIVIDE** | Binary | See below. |

- **Union-compatible:** both tables have the same number of columns, and their corresponding columns have the same (or compatible) domains.
	
### Joins
- **Natural join:** links tables by selecting only the rows with common values in their common attribute(s).
	- Performed in three steps: **PRODUCT → SELECT** (rows where the common attribute values match) **→ PROJECT** (remove the duplicate common column).
- **Equijoin:** links tables based on an **equality** condition (`=`) comparing specified columns of each table. Unlike a natural join, it keeps both copies of the compared column.
- **Theta join:** links tables using any **other comparison operator** (`<`, `>`, `≤`, `≥`, `≠`).
- **Inner join:** returns only the **matched** rows from the tables being joined. (Natural join, equijoin, and theta join are all inner joins.)
- **Outer join:** matched pairs are kept, **and** unmatched rows from one table are also kept, with the missing values from the other table left **null**.
	- **Left outer join:** all rows from the **first (left)** table, including those with no matching value in the second table.
	- **Right outer join:** all rows from the **second (right)** table, including those with no matching value in the first table.
	- **Full outer join:** all rows from **both** tables, matched where possible.

### DIVIDE
- Divides a **two-column** table by a **one-column** table that shares one of its columns.
- **Output:** the values from the other column that appear with **every** row of the one-column table.
- *Example: (STUDENT, COURSE) ÷ (COURSE: CS1, CS2) → students who took **both** CS1 and CS2.*

## Breaking an M:N Relationship into Two 1:M Relationships
![[Pasted image 20261015102802.png]]

- M:N relationships can't be implemented directly in a relational database.
- **Fix:** create a **composite (bridge / associative / linking) entity** between the two entities.
	- The bridge table's primary key is usually the combination of the foreign keys pointing to both original tables.
	- *Example: STUDENT M:N CLASS → STUDENT 1:M ENROLL M:1 CLASS.*

## Indexes
- **Index:** an orderly arrangement used to logically access rows in a table (like the index at the back of a book).
- **Index key:** the index's reference point; it leads to the data location identified by the key.
- **Unique index:** the index key can have only **one** pointer value (one row) associated with it.
	- The DBMS automatically creates a unique index on the primary key.
- A table can have many indexes, but each index is associated with only one table.

---

# Chapter 4: Entity Relationship (ER) Modeling

## Components of the ER Model
1. **Entities**
2. **Attributes**
3. **Relationships**

## Entities
- An entity is the end user's object of interest.
- In ER modeling, "entity" refers to the **entity set** (the whole collection of objects), not a single occurrence.
- **Convention:** entity names are written in **ALL UPPERCASE** and are usually singular nouns (e.g., `CUSTOMER`, `INVOICE`).

## Attributes
- Characteristics of entities.

| Attribute type | Definition |
|---|---|
| **Required attribute** | Must have a value; cannot be null. |
| **Optional attribute** | Can be left empty (null allowed). |
| **Domain** | The set of possible values for an attribute (e.g., GPA: 0.0–4.0). |
| **Identifier** | One or more attributes that uniquely identify each entity instance. Becomes the primary key. *Identifiers are **underlined** in ERDs.* |
| **Composite identifier** | A primary key made of more than one attribute. |
| **Composite attribute** | Can be split into more attributes (e.g., `ADDRESS` → street, city, state, zip). |
| **Simple attribute** | Cannot be split further (e.g., age, gender). |
| **Single-valued attribute** | Can have only one value per instance (e.g., SSN). Not necessarily simple. |
| **Multivalued attribute** | Can have many values per instance (e.g., a person's phone numbers or college degrees). |
| **Derived attribute** | Its value is calculated from other attributes (e.g., age from date of birth). Doesn't need to be physically stored. |

### Handling Multivalued Attributes
- A relational table can't store multiple values in one cell, so choose one of two fixes:
	1. Within the original entity, create **several new attributes**, one for each component of the multivalued attribute (e.g., `HOME_PHONE`, `WORK_PHONE`, `CELL_PHONE`).
	2. Create a **new entity** made of the multivalued attribute's components, related 1:M to the original entity (e.g., `PHONE`). This is more flexible.

## Relationships, Connectivity, and Cardinality
- **Relationship:** an association between entities. Relationships always operate in **both directions**.
	- The entities in a relationship are called **participants**.
	- Relationships are named with a verb (e.g., a CUSTOMER *generates* an INVOICE).
- **Connectivity:** describes the relationship classification: **1:1**, **1:M**, or **M:N**.
- **Cardinality:** the **minimum** and **maximum** number of entity occurrences associated with one occurrence of the related entity.
	- In an ERD, cardinality is shown by placing numbers beside the entities in the format **(x, y)**: x = minimum, y = maximum.
	- Example:
		![[Pasted image 20261029095211.png]]
	- Cardinalities are usually set by **business rules**.
- **Existence-Dependent**:
	- Can apply independently to an occurrence of an entity
	- Exist in the database only when it is associated with another related entity occurrence.
	- **Example:**
		- In “EMPLOYEE claims DEPENDENT,” DEPENDENT is existence-dependent on EMPLOYEE. A dependent can’t exist in the database without the employee who claims it for tax-withholding purposes.
- **Existence-Independence** (Strong entity):
	- Can exist apart from all of its related entities

### Relationship Strength:
- Strength is based on how the primary key of a related entity is defined.
-  Sometimes, the foreign key also is a pimary key component in the related entity.


|                  | Weak (non-identifying)                                                       | Strong (identifying)                            |
| ---------------- | ---------------------------------------------------------------------------- | ----------------------------------------------- |
| Child's PK       | Does not contain the parents' PK, parent's PK appears only as a foreign key. | Contains the parent's PK as part of its own PK. |
| Crow's Foot Line | Dashed                                                                       | Solid                                           |
