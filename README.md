Instructions

I have used Spring Boot and Angular 11 for this application, so you will need to have Maven and Angular CLI installed to run. I have included the backend code in the folder "Authenticator" 
and the frontend code in the folder "ngauthentication". To run the code you can start the Spring Boot app (backend code) by importing it to an IDE as an existing maven project, building the maven project (right click on
Authenticator directory and run as maven install), and runnning AuthenticatorApplication.java as a java application from the directory Authenticator/src/main/java/com.authenticator.authentication. This will run the backend on port 8080. 
Then, the frontend code can be run from the ngauthentication directory. This can be done by first installing nodejs (can do this online), then installing Angular CLI through the command "npm install -g @angular/cli". 
Next, run "npm install" to get the node_modules. I have used bootstrap and jquery for styling, so these can be obtained through the following commands: "npm install bootstrap" and "npm install jquery". Finally run the 
frontend using the command "ng serve" from the ngauthentication directory. The frontend will run on port 4200. Now, both the frontend and backend will be running and you can navigate to "http://localhost:4200/" to begin 
Authenticating.     



Improvements

There are several improvements as this project has a large scope and could be implemented with many features:

1. JWT (JSON Web Token) Authentication could be implemented for a more secure application.

2. The passwords should not be stored in plaintext in the database. Thus, the passwords could be encoded using BCrypt, which is an ideal hashing function for passwords. 

3. Duplicate usernames could be disallowed.

4. Email verification could be implemented to make sure the email was valid.

5. The remember me functionality could be added since right now it is just a placeholder.

6. The UI could be improved to be more aesthetic.

7. Password strength requirements. 

8. Unit Tests/Integration tests.
 


