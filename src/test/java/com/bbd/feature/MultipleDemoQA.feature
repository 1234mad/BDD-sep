
Feature:  multiple data on register form

Background:

      "we will give common information like open the browser and everything we want in every section"

 @sanity @reg
Scenario Outline: Validate reg form with multiple data
Given launch chrome browser
And open the url "https://demo.automationtesting.in/Register.html"
Then user validate the registration form title 
When user click the first name and enter the value "<Firstname>"
Then user click the last name and enter the value "<Lastname>"
And user enter the email "<Email>"

Examples:

|Firstname|Lastname|Email|
|madhubala|R|abcd@gmail.com|
|sanjana|R|sanja@gmail.com|
|vennila|M|vani@gmail.com|

@reg
Scenario: validating registration form 

Given launch chrome browser
And open the url "https://demo.automationtesting.in/Register.html"
Then user validate the registration form title 
When user click the first name and enter the value "madhubala"
Then user click the last name and enter the value "R"
And validate the title
And user enter the email "abcd@gmail.com"

