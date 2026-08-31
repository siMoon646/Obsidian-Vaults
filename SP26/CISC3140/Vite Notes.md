Frontend build tool

Initialization:
- run:
	- npm create vite@latest
		- configure:
			- project name:
				- '.' to create project in current dir

Anatomy of a Vite project:
- index.html:
	- entrypoint
- public dir:
	- unoptimized assets
- src dir:
	- assets dir:
		- optimized assets
	- components dir:
		- code 'templates' for html injections
		- 'templates' must export to 
- package.json:
	- all dependencies & npm scripts
- vite.config.js:
	- vite config and plugins

Using environment variables:
- import.meta: 
	- web standard
- .env:
	- a vite object -> environment
	- built-in constants from vite:
		- BASE_URL:
			- String -> base URL the app is being served from
		- MODE
			- String -> mode that app is running in:
		- DEV
			- Boolean -> app is running in dev
		- PROD
			- Boolean -> app is running in prod
		- SSR
			- Boolean -> app is running in the server
	- custom env var:
		- additional env vars go in the .env dir at the root of proj
		- syntax for creation:
			- VITE_ALL_CAPITAL
			- The custom env vars have to be 'VITE_' + (name of env var in all caps)
		- syntax for use:
			- const dbURL = import.meta.env.VITE_DB_URL