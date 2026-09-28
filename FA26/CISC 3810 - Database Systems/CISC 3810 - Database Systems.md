# 09.17.2026
## Data Modeling & Data Models:
- Data model $\leftrightarrow$ Database model
- An implementation ready data model should contain at least the following components:
	1) Description of the data structure that will store the end user data.
	2) A set of enforceable rules to guarantee the integrity of the data.
		- For example, a rule dictating uniqueness of data.
	3) A set of manipulation methodology to support the real world data transformations.
		- For example, fields from two different tables might need to be updated in a single transaction.

## Data Model Basic Building Blocks:
Constraints help ensure data integrity.
# Chapter 1:
## Importance of Databases:
- Lots of data in real world that needs organizing.
- Relationships between data for inferring modern needs.

## Data vs. Information:
- **Data**: 
	- Raw facts; not yet processed to reveal meaning to the end user.
	- Building blocks of information.
- Information:
	- Results from processing raw data with respect to some context.

## Introducing the Database (DB):
- **Database (DB)**:
	1) Shared, data-structure that may contain:
		1) **End-user data**: raw facts of interest of end user.
		2) **Metadata**: data about data, through which then end-user data is integrated and managed; describes data characteristics and relationships.
			- Metadata of a UUID is that a UUID is a String.
- **Database Management System: (DBMS)** 
	- Collection of programs
	- Manages database structure
	- Control access to data stored in the DB.

### Types of Databases:
- **Single user database:** Supports one user at a time.
	- **Desktop database:** Single-user database on a personal computer.
- **Multi-user database:** Supports multiple users at the same time.
- **Classification by location**:
	- **Centralized database**: Data located at a single site.
	- **Distributed database:** data distributed across different sites.
- **Cloud database:** Created and maintained using cloud data services that provide defined performance measures for the database.
- **Classification by data type:**
	- **General-purpose database**: Contains a wide variety of data used in multiple disciplines.
	- **Discipline-specific database**: contains data focused on specific subject areas. (e.g: The data in this type of database is used mainly for academic or research purposes within a small set of disciplines)
- **Operational database**: Designed to support a company's day-to-day operations.
- **Analytical database**: Stores historical data and business metrics used exclusively for tactical or strategic decision making.
#### Types of Data in Databases:
- **Unstructured data:** Raw data; unprocessed.
- **Structured data**: Results from formatting unstructured data to facilitate storage, use, and generation of **information**.
- **Semi-structured data:** Processed to some extent. Most data you encounter is classified as semi-structured data.

### Extensible Markup Language (XML):
- Represents and manipulates data elements in textual format.

## Structural and Data Dependence:
- **Structural dependence:** 
	- File systems exhibit structural dependence; access to a file is dependent on its own structure.
- **Structural independence:** 
	- Exists when file structure is changed without affecting the application's ability to access data.
	- *Example: changing data metadata such as integer to decimal, will not hinder the program's access to  data*
- **Data dependence:** A program is tied to the exact way that its data is stored in a file.

## Data Redundancy:
- Consequences:
	- Difficult to combine data from multiple sources.
	- Promotes repetitions of the same basic data in different locations.
	- **Poor Data Security:** 
		- Results from having multiple copies of the same data. A copy can be easier obtained if many of them exist.
	- **Data inconsistency:** 
		- Exists when different and conflicting versions of the same data appear in different places.
	- **Data-entry errors:** 
		- Likely to occur for complex (long, detailed, hard to read) entries when they need to be repeatedly entered.
	- **Data integrity problems**: 
		- Because data can be entered without being validated with a source of truth. It is possible to enter inaccurate data, making the data less reliable.

## Data Anomalies:
- Develop when not all of the required changes in redundant data are made successfully. 

### Types:
1) **Update anomalies**:
	- Changing information forces you to make the same change in multiple places, because it was stored redundantly. If you miss even one, the data becomes inconsistent.
	- Occurs while updating existing data.
2) **Insertion anomalies**:
	- Unable to add a new piece of information because some other, unrelated piece of information isn't available yet.
	- Occurs while inserting new data.
3) **Deletion anomalies**:
	- Deleting one piece of information accidentally wipes out other information you wanted to keep, because they were stored together.
	- Occurs when deleting existing data.
## Database System:
- Organization of components that define and regulate the collection, storage, management, and use of data within a database environment.
### Components:
1) Hardware
2) **Software**: 
	- Three types:
		1) Operating system:
			- Manages all hardware components and makes it possible for all other software to run on the computers.
		2) DBMS software:
			- Manages database within the database system (e.g: Microsoft SQL server, MySQL).
		3) Application programs and utilities software:
			- To access and manipulate data in the DBMS and manage the computers environment in which data access and manipulation takes place.
			- Utilities:
				- Software tools used to help manage the database system's computer components (e.g: GUI for database management, tools for controlling database access, tools for monitoring database operations).
3) **People**:
	- All users of the database system.
	- Five types:
		1) System admins
		2) Database admins
		3) Database designers
		4) System analyst & programmers
		5) End users
4) **Procedures**: 
	- Instructions and rules that govern design and use of db systems.
5) **Data**:
	- Collection of facts stored in the database.

## Database Functions:
- Most DB functions are transparent to end users.
- Types:
	1) **Data dictionary management**:
		- **Data dictionary:**
			- Stores definition of data elements and their relationships.
	2) **Data storage management (/optimization)**:
		- Performance tuning ensures efficient performance.
	3) **Data transformation and presentation**:
		- Stored data is converted into a syntactic format that people can expect and understand, without changing its meaning.
	4) **Security management**: 
		- Enforces user security and data privacy
	5) **Multi-user access control**:
		- Multiple users can access the DB concurrently without compromising its integrity.
	6) **Backup & recovery management**:
		- Enables recovery of the database after a failure.
	7) **Data integrity management**:
		- Minimizes redundancy and maximizes consistency.
	8) DB access langs & Application programming interfaces:
		- **Declarative programming language/Query language**:
			- Lets the user specify what must be done without specifying how.
	9) Database communication interfaces:
		- Accept end-user requests in a network (local or foreign).

## Managing DBS:
### Cons of DBS:
1) Increased cost
2) Management complexity
3) Maintaining currency
4) Vendor dependence
5) Frequent upgrade/replacement cycles.
# Chapter 2: 
## Business Rules:
- Company managers 
- Policy makers
- Department managers
- Written Docs
- Direct interview with end users

## Translating Business Rules
- Bidirectional relationships: "How does entity A relate to entity B, and how dos B relate to A?"

## Naming Conventions:

## Database Model Types:
- **Hierarchical Data Models:**
	- Manage large amounts of data for complex manufacturing projects.
	- Represented by upside-down tree. $\rightarrow$
		- Levels or segments.
	- Depicts a set of one-to-many (1:M) relationships.
- **Network Models:**
	- Network model. Instead of the tree-style of the hierarchical data model, that allows only one parent of each child record, the network model allows records to have more than one parent.
	- **Schema & Subschema:
		- **Schema:** Conceptual organization of the entire database.
		- **Subschema:** Defines the portion of the database "seen" by the application programs that actually produce the desired data. 
	- **Data Manipulation Language (DML):**
		- Defines env in which data can be managed.
		- Used to modify data in DB.
	- **Data Definition Language (DDL):**
		- Enables DB admin to define schema components.
- **Relational Models:**
	- Brings **ad hoc query capability** 
		- **ad hoc query:**
			- A one-off question, written on the spot, needing an answer right now, rather than one built into a program in advance.
### Relational Database Management Systems (RDBMS):
- Keeps your data in linked models(tables), stores each fact once, enforces rules to keep it correct, and lets you ask questions in plain, structured language.
		- **Structured Query Language (SQL):** A programming language of the logical nature; allows the user to query the database without specifying how.
		- SQL-based Relational DB application involves:
			- User interface
			- Tables stored in the database
			- SQL "egine" - like a compiler/interpreter for SQL.

### Entity Relationship Model:
- **Entity relationship diagram (ERD):**
	- Uses graphic representation to model database components.
- Entity: 
	- the _kind_ of thing you track (Customer) and corresponds to the whole table
- **Entity instance or entity occurrence:**
	- Rows in the relational table
- **Attributes**: Columns in the table; describe particular characteristics
- **Connectivity:** labels the _type_ of relationship between two entities (1:1, 1:M, etc)

### Drawing ERD: 

![[Pasted image 20260924102329.png]]
For this semester, we will be using the crow's foot notation.