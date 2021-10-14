Feature: Register user

  Background: navigate to url and goto register page

    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigated to the home page with title "nopCommerce demo store"
    When  i click on register link from the nav bar
    Then  i should be navigated to register page with title "nopCommerce demo store. Register"

    @sanity
  Scenario: verify user registration by filling the data in all mandatory fields

    When  i select gender as male
    And   i enter firstName lastName email password confPassword
      | firstName | lastName | email       | password | confPassword |
      | user      | qa       | qa1@nop.com | Testing  | Testing      |
    And   i click on register button
    Then  i should see confirmation message "Your registration completed"

@regression    @ui
 Scenario: verify error messages when user don't provide data into mandatory fields
   When   i click on register button
   Then   i should see error message for firstName as "First name is required."


