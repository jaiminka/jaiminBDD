$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium_workspace/mvnetsyBDD/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Etasy login feature",
  "description": "",
  "id": "etasy-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Etasy login scenario",
  "description": "",
  "id": "etasy-login-feature;etasy-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Etsay",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Then user enters \"jaimin\" and \"jaimin@123\"  for with out examples keyword and with Scenario ."
    },
    {
      "line": 8,
      "value": "#Then user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" for Scenario Outline with Examples keyword."
    }
  ],
  "line": 9,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "jaimin",
        "jaimin@123"
      ],
      "line": 10
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
  "name": "user is on homepage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});