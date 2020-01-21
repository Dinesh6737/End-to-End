$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Sample.feature");
formatter.feature({
  "name": "To validate the functionality of the FabAlley Application.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To validate the FabAlley application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click the login button and enter the valid credentials",
  "rows": [
    {
      "cells": [
        "dineshraina2803@gmail.com",
        "raina2803",
        "32565"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition.click_the_login_button_and_enter_the_valid_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to dresses and click Bodycon Dresses",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenition.go_to_dresses_and_click_Bodycon_Dresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll down and click any product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.scroll_down_and_click_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select size and add to bag and click",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.select_size_and_add_to_bag_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to bag and place the order and click deliver to this address",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.go_to_bag_and_place_the_order_and_click_deliver_to_this_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the credit card details and screenshot and click Faballey and log out your acc",
  "rows": [
    {
      "cells": [
        "1234567891236549",
        "Dinesh Kumar",
        "0122",
        "746"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.enter_the_credit_card_details_and_screenshot_and_click_Faballey_and_log_out_your_acc(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});