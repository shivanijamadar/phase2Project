Feature: Login Feature Scenario

  Background: 
    Given I have launched the application

  Scenario: This scenario is to login successfully
    When I enter the correct username and password
    And I click on the Login button
    Then I should land on the home page

  @sanity
  Scenario: This scenario is to login with incorrect credentails
    When I enter the incorrect username and password
    And I click on the Login button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"
