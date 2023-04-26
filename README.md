# JobsRUs
Make a job application management program.

Objective: 
Make a job application management program. You want to make an application that allows a user to create an account, or sign into an already created account. They should also be able to search the app and see available job listings. They should be able to filter jobs by location, pay range, and field. Users should be able to see jobs without being signed in, but they can only apply to a job after signing in. Users should be able to make and save an application for their account, and when they apply to a job it should be saved to their account.

Technical:
-	Application is written in java 8
-	Resume’s are output as a .txt file, or a .md file if you are doing the bonus
-	Must be runnable entirely in the console or through the command line
-	Obtain user input through the Scanner class
-	Must store data for User’s and Listings in .csv files or in mySQL if doing the bonus
-	Code must compile and run
-	All necessary files should be present on a public GitHub repository by the due date

Specifications:
-	Users should have:
o	An Id
o	A name
o	An email
o	A phone number
o	A resume as a .txt file
-	Users need to be able to create a new account
-	Your application should allow multiple user accounts and should persist information on the users and their resume across application runs
o	User information needs to be persisted to and read from a csv file called “Users.csv”
o	The Users.csv file needs to live in a folder called “Users”
o	User resumes should be their own file on the file system inside of a folder called “Users/<user name>” (Take them through the prompts every time they want to create a resume and overwrite the file)
o	Users should have a password, and users should not be able to “sign in” to an account if their password is entered incorrectly
o	Users should not be able to access other user’s information
-	Users should be able to edit their information
-	Jobs should have:
o	An Id
o	A title
o	A description
o	A street address
o	A city
o	A state
o	A zipcode
o	A salary
o	A field
o	A contact email
-	Users need to be able to filter the job listings
-	Jobs need to be read from a file on the user’s file system, and job listings need to be in a csv file called “Listings.csv” under a “Listings” folder.

