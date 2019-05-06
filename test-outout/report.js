$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/App.feature");
formatter.feature({
  "line": 1,
  "name": "Create Application",
  "description": "",
  "id": "create-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "create-application;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter fromDate \"\u003cfromDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter toDate \"\u003ctoDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Calculate Instrumentwise traded volume and List of instrument not traded between the daterange",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "create-application;;",
  "rows": [
    {
      "cells": [
        "fromDate",
        "toDate"
      ],
      "line": 9,
      "id": "create-application;;;1"
    },
    {
      "cells": [
        "28/12/2017",
        "08/03/2018"
      ],
      "line": 10,
      "id": "create-application;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "create-application;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter fromDate \"28/12/2017\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter toDate \"08/03/2018\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Calculate Instrumentwise traded volume and List of instrument not traded between the daterange",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "28/12/2017",
      "offset": 21
    }
  ],
  "location": "AppStepDefinition.User_enter_fromDate(String)"
});
formatter.result({
  "duration": 211318543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "08/03/2018",
      "offset": 19
    }
  ],
  "location": "AppStepDefinition.User_enter_toDate(String)"
});
formatter.result({
  "duration": 64145,
  "status": "passed"
});
formatter.match({
  "location": "AppStepDefinition.Calculate_Instrumentwise_traded_volume_and_List_of_instrument_not_traded_between_the_daterange()"
});
formatter.result({
  "duration": 3510450,
  "status": "passed"
});
});