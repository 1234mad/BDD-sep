Feature: practice registration form 


@sanity
Scenario: validating registration form 

Given launch chrome browser
And open the url "https://demo.automationtesting.in/Register.html"
Then user validate the registration form title 
When user click the first name and enter the value "madhubala"
Then user click the last name and enter the value "R"
And user enter the email "abcd@gmail.com"





