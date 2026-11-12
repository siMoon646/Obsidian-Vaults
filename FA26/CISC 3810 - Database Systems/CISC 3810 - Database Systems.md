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
- **Data model:** a simple (usually graphical) representation of complex real-world data structures. Often used interchangeably with "database model."
- **Data modeling:** the iterative process of building a data model for a specific problem domain.
- An **implementation-ready** data model contains at least:
	1. A description of the data structure that stores end-user data.
	2. Enforceable rules to guarantee data integrity (*e.g., each employee ID must be unique*).
	3. A data manipulation methodology for real-world data transformations (*e.g., updating fields in two tables in one transaction*).
## Basic Building Blocks of Data Models
| Block | Definition |
|---|---|
| **Entity** | A person, place, thing, or event about which data is collected. |
| **Attribute** | A characteristic of an entity. |
| **Relationship** | An association between entities: **1:M**, **M:N**, or **1:1**. |
| **Constraint** | A restriction on the data that helps ensure integrity. |
 
## Business Rules
- A brief, precise, unambiguous description of an organization's policy, procedure, or principle; used to identify entities, attributes, relationships, and constraints.
- **Sources:** company managers, policy makers, department managers, written documentation (procedures, standards, manuals), and direct interviews with end users.
- **Why document them:**
	- Standardize the company's view of data.
	- Serve as a communication tool between users and designers.
	- Help designers understand the data and business processes (nature, role, scope), develop relationship participation rules and constraints, and create an accurate data model.
### Translating Business Rules into Data Model Components
- **Nouns** → **entities**; **verbs** associating nouns → **relationships**.
- Relationships are **bidirectional**: ask how many B relate to one A, *and* how many A relate to one B.
	- *Example: a customer generates many invoices; each invoice is generated by one customer → CUSTOMER 1:M INVOICE.*
### Naming Conventions
- **Entity names:** describe business objects using terminology familiar to users.
- **Attribute names:** describe the data; good practice is to prefix with the entity's abbreviation (*e.g., `CUS_CREDIT_LIMIT` = CUSTOMER's credit limit*).
- Good naming aids communication among designer, programmer, and end user, and makes the model **self-documenting**.
## Evolution of Database Models
### Hierarchical Model
- Developed in the 1960s for large manufacturing projects (e.g., the Apollo rocket program).
- An **upside-down tree** of **levels/segments** (a segment ≈ a file system's record type); each parent has many children, each child **only one parent** → a set of **1:M** relationships.
- **Advantages:** promotes data sharing; parent/child relationship promotes conceptual simplicity and data integrity; DBMS-enforced security; efficient with 1:M relationships.
- **Disadvantages:** requires knowledge of physical storage and of the hierarchical path (navigational); structural changes require changing all application programs; implementation limitations, no data definition, lack of standards.
### Network Model
- Represents complex relationships more effectively than the hierarchical model; also improved performance and imposed a database standard.
- A record **can have more than one parent**.
- Rarely used today, but introduced lasting concepts:
	- **Schema:** the conceptual organization of the *entire* database as seen by the DBA (every table, field, relationship). One per database.
	- **Subschema:** the *portion* of the database a specific application "sees," only the data it needs. Many can exist, one per application.
		- *Example: a university schema includes STUDENT, COURSE, PAYROLL; the registration app's subschema sees STUDENT and COURSE, the payroll app's sees PAYROLL.*
		- *Memory hook: schema = the whole building's blueprint; subschema = one tenant's floor plan.*
	- **DML (Data Manipulation Language):** the environment for working with data (insert, update, delete, retrieve).
	- **DDL (Data Definition Language):** lets the DBA define schema components.
- **Advantages:** conceptual simplicity; handles more relationship types (e.g., M:N); flexible data access; owner/member relationship promotes integrity; conforms to standards, includes DDL and DML.
- **Disadvantages:** system complexity limits efficiency; navigational system makes implementation, development, and management complex; structural changes require changing all application programs.
### Relational Model
- Introduced by **E. F. Codd** (IBM) in 1970; largely replaced hierarchical/network models in the 1980s, which had become too cumbersome, lacked ad hoc queries (programmers coded even simple reports), and offered limited data independence (structural changes broke applications).
- Data is stored in **relations** (tables) of rows (**tuples**) and columns (**attributes**). Tables are independent; rows in different tables relate through common values in common attributes.
	- **Table vs. file:** a table is purely logical, giving complete **data and structural independence**; physical storage is of no concern to the user or designer.
- **Relational diagram:** shows the entities, their attributes, and the relationships between them.
	- *Example: AGENT 1:M CUSTOMER via common field `AGENT_CODE` (an agent has many customers; each customer has one agent).*
- Brought **ad hoc query capability**: a one-off question written on the spot, rather than built into a program in advance.
#### Relational Database Management System (RDBMS)
- Keeps data in linked tables, stores each fact once, enforces integrity rules, and supports a structured query language.
- Hides physical storage; the user sees only a collection of tables.
- **SQL (Structured Query Language):** declarative: specify *what* data you want, not *how* to retrieve it.
- An SQL-based application has three parts:
	1. **End-user interface:** lets the user interact with the data.
	2. **Tables in the database:** what the user sees.
	3. **SQL engine:** hidden; executes all queries and data requests (like a compiler/interpreter for SQL).
#### Advantages & Disadvantages
- **Advantages:** structural independence via independent tables; tabular view improves conceptual simplicity; SQL-based ad hoc queries; isolates users from physical details; simpler implementation and management.
- **Disadvantages:** substantial hardware and system software overhead; simplicity lets untrained people use a good system poorly; may promote information problems (e.g., "islands of information" in poorly designed databases).
### Entity Relationship (ER) Model
- Introduced by **Peter Chen** in 1976; popular for high-level design because it is graphical.
- **ERD (Entity Relationship Diagram):** graphical representation of entities, attributes, and relationships.
- **Entity:** the *kind* of thing tracked (e.g., CUSTOMER) → a **table**. Strictly an **entity set** (the collection of all such things).
- **Entity instance/occurrence:** one specific thing → a **row**.
- **Attributes:** characteristics of the entity → **columns**.
- **Relationship:** an association among entities. **Connectivity** labels its type (1:1, 1:M, M:N).
#### Drawing ERDs
![[Pasted image 20260924102329.png]]
 
- Notations: **Chen**, **Crow's Foot**, **UML class diagram**. This semester uses **Crow's Foot**.
#### Advantages & Disadvantages
- **Advantages:** visual modeling gives conceptual simplicity and makes it an effective communication tool; integrated with the dominant relational model.
- **Disadvantages:** limited constraint and relationship representation; no DML; information is lost when attributes are removed to avoid crowded displays.
### Object-Oriented (OO) Data Model
- An **object** is a self-contained structure holding data, their relationships, **and** the operations (methods) on the data. Basis for the **OODBMS**.
#### Components of the OO Model
1. **Object:** abstraction of a real-world entity (≈ ER entity *instance*).
2. **Attributes:** properties of an object.
3. **Methods:** real-world actions (e.g., find, change, or print a PERSON's name/address); define an object's **behavior**.
4. **Class:** similar objects sharing structure (attributes) and behavior (methods) (≈ ER entity *set*).
	- Organized in a **class hierarchy** (upside-down tree, one parent per class). *E.g., CUSTOMER and EMPLOYEE share parent PERSON.*
5. **Inheritance:** an object inherits the attributes and methods of classes above it. *E.g., CUSTOMER and EMPLOYEE inherit PERSON's attributes and methods.*
#### UML (Unified Modeling Language)
- An OO-based language of diagrams and symbols for graphically modeling a system; **UML class diagrams** can model data much like an ERD.
#### Advantages & Disadvantages
- **Advantages:** adds semantic content, including in its visual representation; inheritance promotes data integrity.
- **Disadvantages:** slow standards development led to vendor-specific enhancements; complex navigational system; steep learning curve; high overhead slows transactions.
### Object/Relational Model & XML
- **ERDM (Extended Relational Data Model):** adds OO features (objects, classes, inheritance) to the relational model; its DBMS is an **O/R DBMS**.
- **XML (Extensible Markup Language):** represents and manipulates data in text format; the standard for **exchanging data** between systems (especially over the internet), handling structured, semi-structured, and unstructured data.
	- **XML databases** manage unstructured data in native XML; modern O/R DBMSs support XML documents.
## Big Data
- Data sets too large, fast, or varied for traditional relational databases to handle well.
- **The 3 Vs:**
	- **Volume:** quantity of data stored.
	- **Velocity:** speed at which data grows **and** must be processed into information.
	- **Variety:** variation in formats (structured, semi-structured, unstructured).
	- *Sometimes added: veracity (trustworthiness), value, variability, visualization.*
- **Challenges:** volume rules out conventional structures; expensive; OLAP tools proved inconsistent with unstructured data.
### Big Data Technologies
- **Hadoop:** Java-based, open-source, high-speed, fault-tolerant **distributed storage and computational framework**.
	- Clusters thousands of low-cost nodes to store and process data.
	- Originated from Google's distributed file system and parallel processing work; now supported by Apache.
	- Two main components: **HDFS** and **MapReduce**.
- **HDFS (Hadoop Distributed File System):** highly distributed, fault-tolerant file storage for large amounts of data at high speed.
	- **Write-once, read-many:** written data cannot be modified.
	- Node types: **name node** (file system metadata), **data node** (fixed-size data blocks, replicable to other data nodes), **client node** (interface between user application and HDFS).
- **MapReduce:** open-source API for fast analytics by processing data in parallel across thousands of nodes; works with structured and nonstructured data.
	- **Map:** divides a job into smaller units of work. **Reduce:** integrates the nodes' outputs into a single result set.
	- Fairly limited today, but defined the Big Data processing paradigm.
### NoSQL
- A large-scale distributed database that stores structured and unstructured data in a **nonrelational** way (e.g., key-value, document, column, and graph stores).
	- *Everyday examples: Amazon search, Facebook messaging, YouTube, Google Maps directions.*
- **Hadoop ≠ NoSQL:** both address Big Data, but Hadoop is **neither a database nor a data model** (no Hadoop DBMS); it is distributed file storage and processing. NoSQL databases **are** databases.
- **Characteristics:**
	- Not based on the relational model and SQL (hence the name).
	- Highly distributed architectures with high scalability, availability, and fault tolerance.
	- Support large amounts of **sparse data** (many attributes, few actual instances).
	- Favor **performance over transaction consistency**.
	- A broad umbrella for data storage and manipulation.
- **Advantages:** high scalability, availability, fault tolerance; low-cost commodity hardware; supports Big Data; key-value model improves storage efficiency.
- **Disadvantages:** complex programming; no relationship support; no transaction integrity support; only **eventual consistency**.
## Degrees of Data Abstraction
- Models classified from most abstract (external) to least (physical).
### External Model
- The **end users' view** (people using applications to manipulate data and generate information); represented with ER diagrams.
- **External schema:** a specific representation of an external view.
### Conceptual Model
- A **global view of the entire database** for the whole organization.
- **Conceptual schema:** basis for identifying and describing (at a high level) the main data objects.
- **Logical design:** the task of creating a conceptual model.
- **Advantages:** macro-level view of the data environment; software and hardware independent.
### Internal Model
- The database **as seen by the DBMS**: maps the conceptual model to the chosen DBMS.
- **Internal schema:** a specific representation of the internal model using the chosen database's constructs.
- **Logical independence:** changing the internal model without affecting the conceptual model.
- **Hardware independent** (unaffected by computer type) but software dependent.
### Physical Model
- **Lowest level of abstraction**: how data is saved on storage media (magnetic, solid state, optical); requires defining physical storage and access methods.
- **Software and hardware dependent.**
- The relational model targets the logical level, so it doesn't require physical details.
- **Physical independence:** changing the physical model without affecting the internal model.
### Summary Table (Table 2.4)
| Model          | Degree of Abstraction | Focus                                            | Independent of                |
| -------------- | --------------------- | ------------------------------------------------ | ----------------------------- |
| **External**   | High                  | End-user views                                   | Hardware and software         |
| **Conceptual** | Medium-High           | Global view of data (database model independent) | Hardware and software         |
| **Internal**   | Medium-Low            | Specific database model                          | Hardware                      |
| **Physical**   | Low                   | Storage and access methods                       | Neither hardware nor software |

---

# Chapter 3: The Relational Database Model
 
## Relations (Tables)
- The relational model is based on a logical construct called a **relation**, which you can think of as a **table**.
	- It's called a table because it contains a group of related entity occurrences.
	- A table holds an **entity set**, so the terms *entity set* and *table* are often used interchangeably.
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
	- **Purpose:** ensure each row is uniquely identifiable, establish relationships among tables, and ensure data integrity.
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
 
- *Example (STUDENT table):*
	- `STU_NUM` is a superkey **and** a candidate key.
	- `(STU_NUM, STU_LNAME)` is a superkey but **not** a candidate key: `STU_LNAME` can be removed and it's still unique.
	- Any composite key containing `STU_NUM` is a superkey.
- *FK example: `VEND_CODE`, the PK of VENDOR, placed in PRODUCT, is a foreign key in PRODUCT.*
- A secondary key's usefulness depends on how **restrictive** it is: `CUS_CITY` is a better secondary key than `CUS_COUNTRY`.
## Dependencies
- **Determination:** the state in which knowing the value of one attribute makes it possible to determine the value of another.
	- *Example: if you store `PRODUCTION_COST` and `SALE_PRICE`, then `PROFIT = SALE_PRICE − PRODUCTION_COST`, so PROFIT is determined by those two attributes.*
	- Written `A → B`: "A determines B." **A** is the **determinant** (also called the **key**); **B** is the **dependent**.
	- In a database, determination is normally based on **relationships among attributes**, not formulas.
- **Functional dependence:** the value of one or more attributes determines the value of one or more other attributes.
	- *Example: `STU_NUM → STU_LNAME`. Knowing a student's number tells you their last name.*
	- Usually the determinant is the primary key, which determines all other attributes in the row.
	- Both the determinant and the dependent can have multiple attributes.
- **Full functional dependence:** a functional dependency in which the **entire** collection of attributes in the determinant is needed for the dependency (no subset of it would work).
	- *Example: `(STU_NUM, STU_LNAME) → STU_GPA` is a functional dependency but **not** a full one, since `STU_NUM` alone is enough.*
	- A candidate key is based on a full functional dependency.
- **Partial dependency:** an attribute depends on only **part** of a composite primary key instead of the whole key.
- **Transitive dependency:** an attribute depends on another non-key attribute (`A → B` and `B → C`, so `A → C`).
## Integrity Rules
- RDBMSs enforce integrity rules automatically, but it's safer to also make sure the **application design** conforms to them.
### Entity Integrity
- The condition in which each row (entity instance) in the table has its own unique identity.
- **Requirements:**
	1. All primary key values must be **unique**.
	2. No attribute in the primary key can be **null**.
- **Purpose:** each row has a unique identity, so foreign keys can properly reference primary keys.
	- *Example: no invoice can have a duplicate or null invoice number.*
- **Null:** the absence of any data value. It is **not** zero or a blank space. Nulls should be avoided where possible because they can mean "unknown," "doesn't exist," or "not applicable."
	- Slides' three meanings: an **unknown** value, a **known but missing** value, or **not applicable**.
	- Some nulls can't reasonably be avoided (e.g., not every student has a middle initial), but an **abundance of nulls is often a sign of poor design**.
### Referential Integrity
- Every foreign key value must either be **null** (if allowed) or **match a primary key value** of an existing row in the related table.
	- An FK can be null only if it is **not part of its own table's primary key**.
- Guarantees that every reference points to a valid entity.
- Makes it impossible to **delete** a row whose PK has mandatory matching FK values in another table.
- *Example: a customer might not yet have a sales rep (null `AGENT_CODE`), but can never have an invalid one.*
### Handling Nulls
- **Flags:** special codes used to indicate the absence of a value.
	- *Example: use `AGENT_CODE = -99` for "no agent assigned." The AGENT table must then contain a matching **dummy row** with `AGENT_CODE = -99`.*
- **Constraints:**
	- **NOT NULL:** placed on a column to ensure that every row in the table has a value for that column.
	- **UNIQUE:** placed on a column to ensure that no duplicate values exist in that column.
## Relational Algebra
- A theoretical way of manipulating table contents using **relational operators**.
- **Closure:** every relational operator takes relations (tables) as input and produces a new relation as output. Operators **do not modify** the original tables.
- **Relvar** (relation variable): a variable that holds a relation.
	- *Analogy: a variable `qty` isn't an integer; it's a container for one. Likewise, the table **structure** is the relvar and the **data** in it is the relation.*
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
- Divides a **two-column** table (the **dividend**) by a **one-column** table (the **divisor**) that shares one of its columns.
- **Output:** a single column of the values from the other column that appear with **every** row of the one-column table.
- *Example: (STUDENT, COURSE) ÷ (COURSE: CS1, CS2) → students who took **both** CS1 and CS2.*
## Data Dictionary & System Catalog
- **Data dictionary:** a description of all tables in the database created by the user and designer (metadata: "data about data").
- **System catalog:** a detailed **system** data dictionary that describes **all objects** within the database.
- Avoid **homonyms** and **synonyms** to lessen confusion:
	- **Homonym:** the **same name** is used for **different** attributes (e.g., `C_NAME` for both customer name and consultant name).
	- **Synonym:** **different names** are used for the **same** attribute (e.g., `CAR` and `AUTO`).
## Relationships within the Relational Database
- **1:M:** the norm for relational databases.
- **1:1:** one entity can be related to only one other entity, and vice versa.
- **M:N:** implemented by creating a new entity in 1:M relationships with the original entities (see below).
## Breaking an M:N Relationship into Two 1:M Relationships
![[Pasted image 20261015102802.png]]
 
- M:N relationships can't be implemented directly in a relational database.
- **Fix:** create a **composite (bridge / associative / linking) entity** between the two entities.
	- The bridge table's primary key is usually the combination of the foreign keys pointing to both original tables.
	- *Example: STUDENT M:N CLASS → STUDENT 1:M ENROLL M:1 CLASS.*
## Data Redundancy Revisited
- The relational database **controls** data redundancy through **foreign keys** (common attributes shared by tables).
- Redundancy is sometimes kept **on purpose**:
	1. To make the database serve **crucial information purposes**.
	2. To preserve the **historical accuracy** of data.
		- *Example: storing the price paid on each invoice line, so later price changes don't alter past invoices.*
## Indexes
- **Index:** an orderly arrangement used to logically access rows in a table (like the index at the back of a book).
- **Index key:** the index's reference point; it leads to the data location identified by the key.
	- An index key can have **multiple attributes**.
- **Unique index:** the index key can have only **one** pointer value (one row) associated with it.
	- The DBMS automatically creates a unique index on the primary key.
- A table can have many indexes, but each index is associated with only one table.
## Codd's 12 Relational Database Rules
| # | Rule | Meaning |
|---|---|---|
| 1 | **Information** | All information is represented as column values in rows within tables. |
| 2 | **Guaranteed access** | Every value is reachable by table name + primary key value + column name. |
| 3 | **Systematic treatment of nulls** | Nulls are handled systematically, independent of data type. |
| 4 | **Dynamic online catalog** | Metadata is stored as ordinary data in tables, queryable with the standard relational language. |
| 5 | **Comprehensive data sublanguage** | Must support one declarative language covering data definition, views, manipulation, integrity, authorization, and transactions (begin, commit, rollback). |
| 6 | **View updating** | Any theoretically updatable view must be updatable through the system. |
| 7 | **High-level insert, update, delete** | Supports **set-level** inserts, updates, and deletes. |
| 8 | **Physical data independence** | Apps are unaffected when storage structures or access methods change. |
| 9 | **Logical data independence** | Apps are unaffected by table-structure changes that preserve the original values (e.g., adding or reordering columns). |
| 10 | **Integrity independence** | Integrity constraints are defined in the relational language and stored in the system catalog, not in the apps. |
| 11 | **Distribution independence** | Users and apps are unaware of where the data is located (distributed vs. local). |
| 12 | **Nonsubversion** | Low-level access can't be used to bypass integrity rules. |
| 0 | **Rule zero** | To be relational, a database must use its relational facilities **exclusively** for management. |
 
---
# Chapter 4: Entity Relationship (ER) Modeling
## Components of the ER Model
- The **ERM** forms the basis of an **ERD**, which represents the **conceptual database as viewed by the end user**.
1. **Entities**
2. **Attributes**
3. **Relationships**
## Entities
- An entity is the end user's object of interest.
- In ER modeling, "entity" refers to the **entity set** (the whole collection of objects), not a single occurrence.
	- An entity corresponds to a **table**, not a row. A row is an **entity instance / occurrence**.
- Drawn as a **rectangle** containing the entity's name (in Chen, Crow's Foot, and UML).
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
### Storing Derived Attributes (Table 4.2)
|                   | Stored                                                                                            | Not stored                                                                      |
| ----------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| **Advantages**    | Saves CPU cycles and data access time; value is readily available; can track **historical** data. | Saves storage space; computation always yields the **current** value.           |
| **Disadvantages** | Requires constant maintenance to keep the value current.                                          | Uses CPU cycles; increases data access time; adds coding complexity to queries. |
 
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
	- In implementation terms: the entity has a **mandatory foreign key** (an FK that cannot be null).
	- **Example:**
		- In “EMPLOYEE claims DEPENDENT,” DEPENDENT is existence-dependent on EMPLOYEE. A dependent can’t exist in the database without the employee who claims it for tax-withholding purposes.
- **Existence-Independence** (Strong entity):
	- Can exist apart from all of its related entities
	- Also called a **strong** or **regular** entity.
	- **Example:** in “PART is supplied by VENDOR,” some parts are made in-house, so a PART can exist without a VENDOR.
### Relationship Strength:
- Strength is based on how the primary key of a related entity is defined.
	- To implement a relationship, the **parent's** PK (usually the "1" side) appears as an FK in the **child** (usually the "many" side).
	- Strength decisions affect how primary keys are arranged in the design.
-  Sometimes, the foreign key also is a primary key component in the related entity.
	- *Example: `CAR_VIN` (CAR's PK) is both a PK component and an FK in CAR_COLOR.*

|                  | Weak (non-identifying)                                                       | Strong (identifying)                            |
| ---------------- | ---------------------------------------------------------------------------- | ----------------------------------------------- |
| Child's PK       | Does not contain the parents' PK, parent's PK appears only as a foreign key. | Contains the parent's PK as part of its own PK. |
| Crow's Foot Line | Dashed                                                                       | Solid                                           |
| Example          | CLASS (<u>CLASS_CODE</u>, CRS_CODE, …): `CRS_CODE` is only an FK.            | CLASS (<u>CRS_CODE</u>, <u>CLASS_SECTION</u>, …): `CRS_CODE` is part of the PK **and** the FK. |
### Entity Strength:
- **Weak Entity:**
	- Existence Dependent; cannot exist without the entity with which it has a relationship; a mandatory foreign key; the child cannot exist without the parent.
	- Has a primary key hat is partially or totally derived from the parent entity in the relationship.
	- The **database designer** decides whether an entity is weak, based on **business rules**.
	- **Notation:** Chen uses a **double-walled rectangle**. Crow's Foot uses the relationship line + PK/FK: a **strong (identifying) relationship indicates the related entity is weak**.
	- Use:
		- Deleting parent also deletes existence dependent children.
	- Example:
		- A company insurance policy insures an employee and any dependents.
		  
		  An EMPLOYEE might or might not have a DEPENDENT, but the DEPENDENT must be associated with an EMPLOYEE.
		  
		  The DEPENDENT cannot exist without the EMPLOYEE; that is, a person cannot get insurance coverage as a dependent unless the person is a dependent of an employee.
		  
		  DEPENDENT is the weak entity in the relationship "EMPLOYEE has DEPENDENT."
### Relationship Participation
- **Optional Participation**
	- One entity occurrence does not require a corresponding entity occurrence in a relationship.
	- An optional entity has a **minimum cardinality of 0**. (**Optionality** = any condition with one or more optional relationships.)
	- Example: 
		- "COURSE generates CLASS" relationship:
		  
		  Some COURSEs do not generate a CLASS. In other words, an entity occurrence in the COURSE table does not necessarily require the existence of a corresponding entity occurrence in the CLASS table.
		  
		  Therefore, class is considered to be optional to COURSE entity.
	- In Crow's foot notation, this is denoted:
		- A small circle (**O**) drawn on the side of the **optional** entity.
		- `-o<` for zero or many		  ![[Pasted image 20261103094606.png]]
		- `-o|-` for zero or one
- **Mandatory Participation**
	-  One entity occurrence requires a corresponding entity occurrence in a particular relationship.
	- Existence of a mandatory relationship indicates the minimum cardinality is at least 1 for the mandatory entity.
	- If **no optionality symbol** is shown, the relationship is assumed to be **mandatory**.
- **Further Illustrations:**
	- Suppose that Brooklyn College employs some professors who conduct research without teaching classes.
	  
	  If you examine the "PROFESSOR teaches CLASS" relationship, its possible for PROFESSOR to not teach a CLASS.
	  
	  Therefore, CLASS is optional to PROFESSOR. On the other hand, a CLASS taught by a PROFESSOR. Therefore, PROFESSOR is mandatory to CLASS.
	- In the ERD: `(0,3)` next to **CLASS** (a professor teaches 0 to 3 classes) and `(1,1)` next to **PROFESSOR** (each class has exactly one professor).
### Relationship Degrees:
- **Degree** = the number of entities (participants) associated with a relationship.

| Relationship | Details                                                                                    |
| ------------ | ------------------------------------------------------------------------------------------ |
| Unary        | Association is maintained within a single entity; all unary relationships are recursive(?) |
| Binary       | Two entities are associated                                                                |
| Ternary      | Three entities are associated                                                              |
| Recursive    | Relationship exists within a single entity type.                                           |
- Important!!! think of relationship between something like CUSTOMERS and CARS.
	- Many customers may own many cars
	- A single customer may own many cars 
	- A car can be owned by only one customer.
### Recursive Relationships
- A relationship between occurrences of the **same entity set**, so it is found within a **unary** relationship. (This answers the "(?)" in the table: yes.)
- Common in manufacturing industries (e.g., a part made of other parts).
- **Examples:**
	- **1:M:** "EMPLOYEE manages EMPLOYEE": one employee manages many others.
	- **M:N:** "COURSE is a prerequisite to COURSE": a course can be a prerequisite to many courses and have many prerequisites.
- **Common pitfall:** confusing **participation** with **referential integrity**. They're similar because both are implemented through constraints on the same attributes.
### Associative (Composite) Entities:
- Represents M:N relationships between two or more entities.
- Has 1:M relationship with the parent entities
	- Composed of the primary key attributes of each parent entity.
- May also contain additional attributes that play no role in connective process.
- Example: ![[Pasted image 20261103102908.png]]
	- M:N relationship between STUDENT and CLASS is decomposed into two 1:M relationships through ENROLL, the optionalities must be transferred to ENROLL.
	  
	  This makes it possible for a CLASS to not occur in ENROLL if no STUDENT has signed up for that class.
	  
	  This is because classes are not a _mandatory participants_ of ENROLL. The ENROLL entity becomes optional to CLASS.
	  
	  Also, because the ENROLL entity is created before any STUDENTs have signed up for a class, the ENROLL entity is also optional to STUDENT, at least initially.
	- ENROLL is a **weak entity**: it is existence-dependent, and its composite PK is made of the PKs of STUDENT and CLASS.
### Developing an ER Diagram:
- Create a detailed narrative of org's operations.
- Identify business rules.
- Identify main entities and relationships from business rules.
- Develop initial ERD
- identify the attributes and primary keys that adequately describe entities.
- Revise and review ERD.
	- The process is **iterative**: reviews usually uncover additional objects, attributes, and relationships.
#### Tiny College Example (Table 4.4)
| Entity | Relationship | Connectivity | Entity |
|---|---|---|---|
| SCHOOL | operates | 1:M | DEPARTMENT |
| DEPARTMENT | has | 1:M | STUDENT |
| DEPARTMENT | employs | 1:M | PROFESSOR |
| DEPARTMENT | offers | 1:M | COURSE |
| COURSE | generates | 1:M | CLASS |
| SEMESTER | includes | 1:M | CLASS |
| PROFESSOR | is dean of | 1:1 | SCHOOL |
| PROFESSOR | chairs | 1:1 | DEPARTMENT |
| PROFESSOR | teaches | 1:M | CLASS |
| PROFESSOR | advises | 1:M | STUDENT |
| STUDENT | enrolls in | M:N | CLASS |
| BUILDING | contains | 1:M | ROOM |
| ROOM | is used for | 1:M | CLASS |
- ENROLL is the composite entity that implements "STUDENT enrolls in CLASS."
- Key optionalities from the business rules:
	- A professor isn't required to be a dean: `(1,1)` next to PROFESSOR, `(0,1)` next to SCHOOL.
	- CLASS is optional to COURSE (a course can be in the catalog without being offered).
	- DEPARTMENT is optional to PROFESSOR in "chairs" (no professor must accept the chair).
	- DEPARTMENT is optional to STUDENT (a student may not have declared a major yet).
	- STUDENT is optional to PROFESSOR in "advises" (not all professors advise).
- **Note:**
	- Relationships can be:
		- Strong + Mandatory
		- Weak + Mandatory
		- Strong + Optional
		- Weak + Optional
	- Entities can have more than just one relationship between them.
		- Note that the strength of all relationships between the same pair of entities is the same(?).
			- *Not on the slides, and not necessarily true: strength depends on each relationship's PK/FK arrangement, so each relationship is judged separately.*
	- Denoting cardinality of relationships.
		- "A professor may teach UP TO 4 classes"
			- The **CLASS** side of the relationship should have `(0,4)` beneath it to denote cardinality. *(The cardinality sits next to the entity being counted; see the `(0,3)` PROFESSOR/CLASS example.)*
## Database Design Challenges: Conflicting Goals
- Designers must often make **compromises** between conflicting goals:
	- **Design standards:** the design must conform to them.
	- **Processing speed:** high speed may limit the number and complexity of logically desirable relationships.
	- **Information requirements:** maximum information generation may cost clean design structures and high transaction speed.
## Summary Points
- An M:N relationship is **valid at the conceptual level** (it gets broken up only at implementation).
- **UML class diagrams** represent the **static data structures** in a data model.