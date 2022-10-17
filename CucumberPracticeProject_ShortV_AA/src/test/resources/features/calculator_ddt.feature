Feature: Calculator should work for simple math

  As a user I should be able to do simple math

  @ScenarioOutline
  Scenario Outline: User should be able to add two numbers
    Given Calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalNumber>
    Examples:
      | firstNumber | secondNumber | finalNumber |
      | 2           | 3            | 5           |
      | 8           | 7            | 15          |
      | 12          | 13           | 25          |
      | 4           | 6            | 10          |


