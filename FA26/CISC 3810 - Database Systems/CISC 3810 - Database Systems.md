# 09.08.2026
"databases are useful ahh class" - literally spending 30 minutes giving examples.

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
	- This type of database requires extensive data manipulation.
#### Types of Data in Databases:
- **Unstructured data:** Raw data; unprocessed.
- **Structured data**: Results from formatting unstructured data to facilitate storage, use, and generation of **information**.
- **Semi-structured data:** Processed to some extent. Most data you encounter is classified as semi-structured data.

### Extensible Markup Language (XML):
- Represents and manipulates data elements in textual format.

## Structural and Data Dependence:
- **Structural dependence:** File systems exhibit structural dependence; access to a file is dependent on its own structure.
- **Structural independence:** Exists when file structure is changed without affecting the application's ability to access data.
	- *Example: changing data metadata such as integer to decimal, will not hinder the program's access to  data*
- **Data dependnce:** A program is tied to the exact way that its data is stored in a file.

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