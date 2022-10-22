Feature: Adding products to cart

  Background: 
    Given I have launched the application
    When I enter the correct username and password
    And I click on the Login button

  Scenario: Adding a product to cart
    And I select the product "Sauce Labs Backpack"
    Then items in the cart should be 1

	@regression
  Scenario: Adding multiple products to cart
    And I select the below products
      | Sauce Labs Onesie       |
      | Sauce Labs Bolt T-Shirt |
    Then items in the cart should be 2
