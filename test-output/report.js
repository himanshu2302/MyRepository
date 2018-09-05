$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/himanshu.dubey/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create new deal test feature",
  "description": "",
  "id": "deal-data-creation;create-new-deal-test-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of logn page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user inputs username and password",
  "rows": [
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user creates new deal",
  "rows": [
    {
      "cells": [
        "test deal",
        "exilant",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the broswer",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewDeals.user_on_login_page()"
});
formatter.result({
  "duration": 8549689557,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.login_page_title()"
});
formatter.result({
  "duration": 23108273,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.user_enters_un_pwd(DataTable)"
});
formatter.result({
  "duration": 219180613,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.user_click_log_btn()"
});
formatter.result({
  "duration": 4956282835,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.user_is_on_homepage()"
});
formatter.result({
  "duration": 3604322,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.click_on_contacts_link()"
});
formatter.result({
  "duration": 6284287372,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.create_new_deal(DataTable)"
});
formatter.result({
  "duration": 1911359513,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewDeals.close_browser()"
});
formatter.result({
  "duration": 112859986,
  "status": "passed"
});
});