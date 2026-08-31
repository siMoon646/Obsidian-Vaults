<h1>Section 1</h1>

1) Describe in own words purpose of each: 
	1) HTML:
		- "skeleton" of a project. Provides the structure of the project.
	2) CSS:
		- Acronym for Cascading Style Sheets. Provides aesthetic value for an html application.
	3) JavaScript:
		- Provides functionality to an html application -> makes it interactive.

2) There are 3 ways to apply CSS to an HTML document. Name and briefly describe each method:
	1) JavaScript injection. You can use the DOM of a document to access the properties of an html document. Some of these fields pertain to the styling of elements in the html document.
	2) In-line styling: Within the tag (e.g: '\<body>', one can add a field/property for styling.
	3) linking a stylesheet: A CSS document exists that contains the rules for styling a document that links it. This file is linked in the head of an HTML document.

3) Given the variable below, write a function called getItem that accepts both as arguments and returns the element at that index from the array.		
		
		const get_item = 58
		const arr = \[n] -> array with n elements.
		function (itemNum, array){
			return array[itemNum-1];
		}

4) What is asynchronicity in JavaScript? Why is it important? Give an example use case.
	1) In JavaScript, asynchronicity is the concept of executing remaining code while waiting for a request. This is important, because it simulates concurrency, allowing the program to address other processes while one process is pending a response. A use case is doing some other process after making a request for an API fetch, but the program doesn't waste time waiting for the API fetch to complete and will run some other process while waiting instead.
	2) Callback hell describes the problem of hard-to-read code, resulting from code involving many layers of nested callback functions. Callbacks led to the creation of modern async/await by bringing attention to the limitations of old asynchronys tools.

5) Study the HTML structure below. Each \[LETTER] is a blank. Match the correct answer from the options provided.
   
   `<!DOCTYPE html>
	`<html>`
	`<head>`
	`< [A] >My Webpage</ [A] >`
	`<link [B]="stylesheet" href=[C]>`
	`</head>`
	`<body>`
	`<h1>Welcome!</h1>`
	`<a [D]="https://example.com">Click Here</a>`
	`<img src="photo.jpg" [E]="A photo">`
	`< [F] src="app.js"></ [F] >`
	`</body>`
	`</html>`

	A : title
	B : link
	C : styles.css
	D : rel
	E : alt
	F : script

6) What is \<a> tag? What goes inside it and what does it link to? Where does it go in the document? True or False: it must always open a new tab. Explain.
	1) Called the 'anchor' tag. A URL goes inside of anchor tag, clicking the element representing the anchor tag will take you to wherever the URL links to. The anchor tag goes inside the body of the document. False, the anchor tag may load its linked URL in the current tab.

7) What is \<script> tag? Where in the HTML should it be placed, and why?
	1) The script tag allows developers to link a file responsible for a webpage's logic. The script tag should be placed at the bottom of the body of the in the HTML document -> loads the script after all HTML elements have been loaded -> all elements that rely on the logic within the script tag will work properly.

<h1>Section 2</h2>

1) When naming variables in your code, what guidelines should you follow? What makes a variable name good vs. bad? Give one example each.
	1) Variable names should suggest what they represent. A good variable name would concisely represent the information that it holds, a bad one would obscure the information that it holds.
		1) Example of good variable name: 'price'
			This suggests that the variable likely stores a number that represents the price of something.
		2) Example of bad variable name: '0ahwiuagwifhawvn'
			This variable name doesn't clearly suggest what it stores.

2) Below is a monolithic project where frontend and backend files are all mixed in the same folder. How would you reorganize it? Write your new structure below and explain your reasoning:
	![[Pasted image 20260328214407.png|188]]
	frontend folder:
		index.html
		about.html
		style.css 
		package.json
	backend folder:
		app.js
		db.js
		server.js
		routes.js
		userModel.js
		package.json

3) You are on a team project. Before writing new code, what should you do first when working with a shared GitHub repository? Be as specific as possible.
	   1) Before I start working with a shared  GitHub repository, I would tell my teammates what I will be working on, so that we do not work on the same feature at the same time which will lead to merge conflicts. Then, I will pull the repository to get an up-to-date version of it -> make my changes on my copy of the repo -> merge with the latest version of the github repository.

4) During development you try to start your server and get an error: port already in use. Describe two ways to resolve this.

	1) Manually change the PORT that the server uses to something else.
	2) Kill the server that is using the occupied PORT.

<h1>Section 3</h1>

1) What is the difference between a devDependency and a regular (production) dependency in a Node.js project? Provide two examples of each.
	1) devDependency is something that the developers of something require for continued development of a program. Two examples are: Nodemon, and morgan.
	2) production dependencies are dependencies that are required for a product to function. Two examples are: Express.js and CORS middleware.

2) placeholder

3) What is the difference between **REST** and a standard HTTP request? Name at least **two** core principles of a RESTful API. Then match each HTTP verb to its CRUD operation.
	- REST is a convention for how to use HTTP requests and standard HTTP requests are the tools through which computers communicate. Two core principles of a RESTful API are:
	  1) Intuitive endpoints, endpoints are named using the HTTP request followed by resource names to describe what is being done.
	  2) Predictability. Because REST is a convention, it promotes a specific development structure, which makes working with other REST APIs easier.
	Matching HTTP Verb -> CRUD operation:
	- GET -> read
	- POST -> create
	- PUT/PATCH -> update
	- DELETE -> delete

4) Look at both code block below. What is the output of each? Explain the scoping differences between var, let , and const.
    Block A output:
	    10
	Block B output:
		y is not defined
	The scoping differences:
		Var: function scoped--accessible from anywhere within the function it is declared.
		Let: Mutable and accessible from within the scope that it is declared.
		Const: Immutable and accessible from within the scope that it is declared.

<h1>Section 4</h1>
blackjack mini project: 

