#Author: Olabisi
Feature: BBC Register New User

  Scenario Outline: As a new user i want to create an account.
    Given I am on the BBC HomePage
    And I click sign in
    When I click Register now
    And I verify that am above the standard age
    And I choose the option that i am over the standard age
    When I type my email " <email>" address
    Then I type password "<password>" in the password field
    Then I type postcode "<postcode>" in the postcode field
    And I select No email personification
    When I click Register button
    And I verify that i am registered successfully
    

    Examples: 
      | email               | password | postcode |
      | olaola247@gmail.com | tajud77n | se18 3nr |
      |                     |          |          |
