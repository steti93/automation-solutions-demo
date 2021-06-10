Feature: Sending Property name from step and use value base on profile


  Scenario: Prints Username from step implementation
    Given prints username
@Run
  Scenario: Prints value that is send in step argument
    Given following property is printed env("data.users.userName")