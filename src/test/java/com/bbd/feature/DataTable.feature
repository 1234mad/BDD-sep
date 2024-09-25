Feature: This feature file is about datatable 

Scenario: validating the register form using datatable 

Given launch chrome browser
And open the url "https://demo.automationtesting.in/Register.html"
Then user validate the registration form title 
When user click the fname and enter the value in firstname
|Firstname|
|Tname1|
Then user enter the value in last name and email
|lname||email|
|laname||abcdef@gmail.com|
 
