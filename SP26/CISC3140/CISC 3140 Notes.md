Supabase:
	- Database application
	- Provides:
		  1) PostgresSQL database
		  2) Authentication
		  3) Auto generated REST and GraphQL API -> creating a table results in getting API endpoints for it.
			  1) 'health' endpoint for checking server status
		  4) Real time database changes

Project File System Organization: MVC
	- Backend:
		1) config:
			- holds configuration and setup files. Code that initializes or defines settings for your app rather than business logic.
		2) controllers:
			- handles logic for when an endpoint is reached.
		3) db:
			- handles everything interacting with the database
		4) middleware: 
			- holds functions that run between request and controllers. They intercept requests, do something to it, then either pass it along or block it.
			- Request -> Middleware -> Controller -> Response
		5) routes
			- defines which URL exists in your API and what controllers handles them.
		6) seed
			- contains scripts to populate your database with initial or dummy data
		7) services
			- holds reusable business logic that can be shared across multiple controllers. Sits between the controllers and the database.
		8) utils
			- holds small, generic helper functions that don't belong to any specific part of the app. Reusable tools that anything can import.
		9) .env
			- stores environment variables. Environment variables are sensitive config values that your app needs to run but you do not want to hardcode in your source code or commit to git.
		10) package
			- central description of your node.js project. Tells node and npm everything they need to know about the relevant project.
	- Frontend:
		1) public
			- holds static files that are served directly to the browser without and processing.
		2) src
			- contains code pertaining to the frontend. Such code may be responsible for the re-rendering of the UI.