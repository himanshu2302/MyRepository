Feature: Free CRM login feature

Scenario: Free CRM login test scenario


 #Without examples keyword -  data driven testing with cucumber.
Given User is already on login page
When title of login page is Free CRM
Then user enters "naveenk" and "test@123"
Then user clicks on login button
Then user is on home page



#Scenario Outline: Free CRM login test scenario
#Given User is already on login page
#When title of login page is Free CRM
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#
#Examples: 
#      | username | password |
#      | naveenk  | test@123 |
##      | tom      | test456  |





