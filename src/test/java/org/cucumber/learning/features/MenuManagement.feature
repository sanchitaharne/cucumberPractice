@SmokeTest
Feature: Menu Management

  @SmokeTest
  Scenario: Add a new menu item
    Given I have a new menu item by name "Cucumber Salad" and price 20
    When I add that menu item
    Then New item in added

  @RegularTest
  Scenario: Add a new menu item 2
    Given I have a new menu item by name "Cucumber Sandwich" and price $20
    When I add that menu item
    Then New item in added

  @RegularTest @NightlyTest
  Scenario: Add another menu item
    Given I have a new menu item by name "Chicken Sandwich" and price $10
    When I add that menu item
    Then New item in added