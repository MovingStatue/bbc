#Author: Olabisi
Feature: BBC Sign in
@signin
  Scenario Outline: As a register user i want to sign in successfully.
    Given I am on the BBC HomePage
    And I click sign in
    When I type my email address " <email>" in the email field
    Then I type password account "<password>" in the password text field
    When I click Signin button
    And I verify that i am logged in successfully
    And I log out from my account
    

    Examples: 
      | email               | password | postcode |
      | olaola247@gmail.com | tajud77n | se18 3nr |
      |                     |          |          |