Feature: Login to nopCommerce

  @ui
  Scenario Outline: Verify login with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to the home page with title "nopCommerce demo store"
    When  i click on login link from the nav bar
    Then  i should be navigated to login page with title "nopCommerce demo store. Login"
    When  i enter email as "<email>"
    And   i enter password as "<password>"
    And   i click on login button
    Then  i should be logged in successfully


    Examples:

      | email         | password |
      | user1@nop.com | Testing  |
      | user2@nop.com | Testing  |
      | user3@nop.com | Testing  |



