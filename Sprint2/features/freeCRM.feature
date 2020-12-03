Feature: FreeCRM website


Scenario Outline: To check Login funtionality
Given User is on login page
When User enters on Email <emailid> and password <password>
Then Error message should displays as unsuccessful login

Examples:
    |emailid               |password|
    |||
    |saiaravindkumar88@gmail.com      |Aravind8|
    |aravind88.com|Aravind88|
    |saiaravindkumar88@gmail.com      |Aravind88|

Scenario: Successful Login
Given User is on login page
When User enters valid email and password 
Then User logged in succesfully

@smoke
Scenario Outline: Creating a new contact
Given User is on home page
When User clicks on Contacts and add new 
And entes Firstname <fname> and last name <lname>
Then New contact should be created

Examples:
      |fname|lname|
      |||
      |Aravind||
      ||Kumar||
      |Aravind|Kumar|

      
Scenario: Create a new deal
Given User is on home page
When User clicks on Deals and add new and enters title
Then New deal should be created

Scenario: Create a new deal with null
Given User is on home page
When User clicks on Deals and add new and clicks save
Then New deal should not be created


Scenario Outline: Create a new task
Given User is on home page
When User clicks on Tasks 
And add new and enters task <ttl>
Then New task should be created

Examples:
      |ttl|
      ||
      |TASK1|
     


Scenario Outline: Create a new company
Given User is on home page
When User clicks on Companies and add new and enters name <nam>
Then New company should be created

Examples:
       |nam|
       ||
       |company2|




