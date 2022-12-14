Feature: Calculator should work for simple math

  As a user I should be able to do simple math

  Background:
    Given Calculator is open

  Scenario: User should be able to add two numbers
    // Given Calculator is open // --> Background
    When I add 2 with 3
    Then I should get 5

  @Add2
  Scenario: User should be able to add two numbers 2
    // Given Calculator is open // --> Background
    When I add 10 with 5
    Then I should get 15

  Scenario: User should be able to add two numbers 3
    // Given Calculator is open // --> Background
    When I add 20 with 25
    Then I should get 45