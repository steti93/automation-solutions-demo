Feature: Exception Handling and how to debug

  Scenario: Assert failed
    Given user prints something
    When and user validate following message "Holla amigos"

  Scenario: NPE
    Given user prints something
    When and user validate following message "Holla amigos"

  Scenario: Implemented step
    Given user prints something
    When and user validate following message "Holla amigos"

  Scenario: Invalid arguments
    When user see following messages
      | string 1 |
      | string 2 |

  Scenario: Testing debug tools
    Given user verify if '10' is odd and positive number