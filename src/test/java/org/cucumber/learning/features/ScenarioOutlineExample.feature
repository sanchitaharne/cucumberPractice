Feature: Final Bill Generation

  @ScenarioOutlineExample
  Scenario Outline: Customer Bill amount calculation
    Given I have a Customer
    And user enters an initial bill amount as <InitialBillAmt>
    And sales tax rate is <taxRate>
    Then final bill amount calculated as <finalBillAmt>
    Examples:
    |InitialBillAmt|taxRate|finalBillAmt|
    |100           |10     |110         |
    |200           |8      |216         |
    |100           |1.55   |101.55      |
