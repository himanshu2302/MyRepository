Feature: Free CRM create new contact feature

Scenario Outline: Create new contact test feature

Given user on login page

Then user inputs "<username>" and "<password>"
Then user click log btn
Then user click on contacts link
Then user click on new contacts link
Then user enter "<first name>" and "<last name>" and "<company>"

Examples: 
      | username | password | first name | last name | company |
      | naveenk  | test@123 | Santosh    | Tarai     | Exilant |
      | naveenk  | test@123 | Nasir      | Md        | Exilant |
      | naveenk  | test@123 | Pradeep    | Kumar     | Infosys |
      | naveenk  | test@123 | Ravi       | Prakash   | Nokia   |
      | naveenk  | test@123 | Himanshu	| Dubey     | Exilant |
      | naveenk  | test@123 | Madhav 	| Singh     | Accenture |
     