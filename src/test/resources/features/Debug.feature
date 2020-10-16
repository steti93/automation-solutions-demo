Feature: Exception Handling and how to debug

  Scenario: Assert failed
    Given user prints something
    When and user validate following message "Correct message"

  Scenario: NPE
    When and user validate following message "Correct message"

  Scenario: Implemented step
    When and user validate following message ffa

  Scenario: Invalid arguments
    When user see following messages