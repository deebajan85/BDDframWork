$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Retail Product Feature",
  "description": "",
  "id": "retail-product-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14558394900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login to see the Desktop page",
  "description": "",
  "id": "retail-product-feature;login-to-see-the-desktop-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@DeskTopLogin"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should see all items are present in Desktop page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4601292400,
  "status": "passed"
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
formatter.after({
  "duration": 1010299300,
  "status": "passed"
});
});