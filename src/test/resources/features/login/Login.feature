
Feature: Login with valid credentials

  As a customer I want to be able to login into the app providing valid credentials.

  @Login
    @Start
  Scenario Outline: Login to app
    Given  the app login page is open
    When  the user enters correct <username> and <password>
    Then  the user is logged in

    Examples:
      | username                | password     |
      | boykoalex2211@gmail.com | james221191|


