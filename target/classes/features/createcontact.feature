Feature: Free CRM create new contact feature

Scenario Outline: Create new contact test feature

Given user on login page

Then user enters un and pwd
Then user click log btn
Then user click on contacts link
Then user click on new contacts link
Then user enter "<first name>" and "<last name>" and "<company>"

Examples: 
      | first name | last name | company |
      | Santosh    | Tarai     | Exilant |
      | Nasir      | Md        | Exilant |
      | Rahul      | Jain      | Infosys |
      | Ravi       | Prakash   | Nokia   |