Feature: Deal data creation

Scenario: Create new deal test feature

Given user is on login page
When title of logn page is Free CRM
Then user inputs username and password

| naveenk | test@123 |

Then user click on login button
Then user on home page
Then user moves to new deal page
Then user creates new deal
| test deal | exilant | 1000 | 50 | 10 |
Then close the broswer