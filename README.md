Run docker-compose by opening a cmd-shell and directing it to the folder the "docker-compose.yml"-file is in and run
the following command:

docker-compose up


PostgreSQL [Port: 5432] - Port changeable in "docker-compose.yml" while the container is not running

PostIt-Application database-name: postit
It has only one table - messages

adminer (http://localhost:8080) - Port changeable in "docker-compose.yml" while the container is not running

adminer is used to look into the database by hand. 

Login-process:
1. Change System to PostgreSQL
2. Login using following data

	Username: postgres
	Password: root
	
	
To change the port of the PostIt-application:
1. Open the application.properties file
2. Change the number behind server.port


To test the application open "Google Chrome" and open 

http://localhost:8085/index

If you have changed the port replace "8085" with the given port.




Known Bugs: 
-Errors not handled (No Error-redirect or Error-page)
-No custom limit to message- and name-length
-No delete function
-Missing Tests
-Chat not scrolled down on refresh (due to not using JavaScript)
-Missing Custom Logs 
-Networking between docker-containers not working

Not Tested:
-Manually sending POST-Requests

