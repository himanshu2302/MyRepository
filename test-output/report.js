$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createcontact.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM create new contact feature",
  "description": "",
  "id": "free-crm-create-new-contact-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create new contact test feature",
  "description": "",
  "id": "free-crm-create-new-contact-feature;create-new-contact-test-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters un and pwd",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click log btn",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on new contacts link",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewContacts.user_on_login_page()"
});
formatter.result({
  "duration": 7155295198,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContacts.user_enters_un_pwd()"
});
formatter.result({
  "duration": 174067767,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContacts.user_click_log_btn()"
});
formatter.result({
  "duration": 4551829946,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContacts.click_on_contacts_link()"
});
formatter.result({
  "duration": 5116062509,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContacts.click_on_new_contacts_link()"
});
formatter.result({
  "duration": 2350062526,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 6174503433,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_page_title()"
});
formatter.result({
  "duration": 20452073,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 160953059,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_btn()"
});
formatter.result({
  "duration": 5687383902,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 3496119,
  "status": "passed"
});
});