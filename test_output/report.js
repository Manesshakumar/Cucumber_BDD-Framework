$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/Desktop/Training/BDDFramework/src/main/java/Features/datatable.feature");
formatter.feature({
  "line": 1,
  "name": "Parameterization Datatable Concept",
  "description": "",
  "id": "parameterization-datatable-concept",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Validation",
  "description": "",
  "id": "parameterization-datatable-concept;login-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The User enters UserName and Password",
  "rows": [
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Datatable_stepdef.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 27657504002,
  "status": "passed"
});
formatter.match({
  "location": "Datatable_stepdef.the_User_enters_UserName_and_Password(DataTable)"
});
formatter.result({
  "duration": 1067078704,
  "status": "passed"
});
formatter.match({
  "location": "Datatable_stepdef.click_Login_button()"
});
formatter.result({
  "duration": 10945152002,
  "status": "passed"
});
});