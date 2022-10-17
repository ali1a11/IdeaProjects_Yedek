@eating
Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of anything may not be good for you

  @eating1
  Scenario: Eating a few is no problem
    Given John is hungry
    When he eats some cucumber
    Then he will be full

  @eating2
  Scenario: Eating a few is no problem
    Given "John" is hungry
    When he eats 3 cucumber
    Then he will be full

    # parametirazition
    # John is hungry        --> "John" is hungry
    # he eats some cucumber --> he eats 3 cucumber