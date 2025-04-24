@Account
  Feature: Register new user on Luma Ecommerce

    Scenario: Create new account with valid data
    Given user is on register page "/customer/account/create/"
    When user fill out form with his information
    And user clicks on register button
    Then message diplayed "Account Information"

    Scenario: Create new account with invalid email
      Given user is on register page "/customer/account/create/"
      When user fill out form with his information with invalid email
      And user clicks on register button
      Then message diplayed "Please enter a valid email address (Ex: johndoe@domain.com)"

