Feature: This feature is for login functionalities



Scenario: Verify user can login with valid credential  
Given MetaLaunch "<URL>" 
Then Click Login Link
Then Enter Username and Enter Pasword and Click Login button 
Then Verify user can login with valid credential
