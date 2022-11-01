Feature: Data table
  @listofstrings
  Scenario: Bill amount generation
    Given I placed an order for the following items
    |Cucumber pizza|2|20|
    When I generate the bill
    Then a bill of $40 should be generated

  @listoflistofstrings
  Scenario: Bill amount generation
    Given I placed an order for the following items
      |Cucumber pizza|2|20|
      |Cucumber Chutney|1|10|
    When I generate the bill
    Then a bill of $50 should be generated

  @listofmaps
  Scenario: Bill amount generation
    Given I placed an order for the following items
      |ItemName|Units|UnitPrice|
      |Cucumber pizza|2|20|
      |Cucumber Chutney|1|10|
    When I generate the bill
    Then a bill of $50 should be generated
