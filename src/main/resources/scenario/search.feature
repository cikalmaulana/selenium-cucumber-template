@LoginTest

Feature: Open a website and login

  Scenario: Open a Website, login, and then logout
    Given I'm on the login page
    And I fill username with 'tomsmith' and password with 'SuperSecretPassword!'
    And I click login
    Then I logged in to secure area
    And I click logout