Feature: Data table
  @listofstrings
  Scenario: Bill amount generation
    Given I placed an order for the following items
    |Cucumber pizza|2|20|
    When I generate the bill
    Then a bill of $40 should be generated