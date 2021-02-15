$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium_workspace/mvnetsyBDD/src/main/java/Features/SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "sign up feature",
  "description": "",
  "id": "sign-up-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "sign up scenario",
  "description": "",
  "id": "sign-up-feature;sign-up-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is aleady on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on sign in button and register button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the valid details of sign up",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "kachadiyajaimin",
        "jaimin",
        "jaimin123"
      ],
      "line": 9
    },
    {
      "cells": [
        "sfkakbfsaowe",
        "viswadsafa",
        "jasijfia"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "browser close",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpstepDeefinition.user_is_aleady_on_homepage()"
});
formatter.result({
  "duration": 11432641900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpstepDeefinition.user_click_on_sign_in_button_and_register_button()"
});
formatter.result({
  "duration": 4435249800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpstepDeefinition.user_enter_the_valid_details_of_sign_up(DataTable)"
});
formatter.result({
  "duration": 699580200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpstepDeefinition.browser_close()"
});
formatter.result({
  "duration": 41600,
  "status": "passed"
});
});