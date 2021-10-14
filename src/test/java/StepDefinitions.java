import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class StepDefinitions
{


    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
       BasePage.navigateToUrl(url);
    }


    @Then("i should be navigated to the home page with title {string}")
    public void iShouldBeNavigatedToTheHomePageWithTitle(String title)
    {
        Assertions.assertEquals(title,BasePage.getTitle());
    }

    @When("i click on login link from the nav bar")
    public void i_click_on_login_link_from_the_nav_bar()
    {
        BasePage.homePage.clickLoginLink();
    }


    @Then("i should be navigated to login page with title {string}")
    public void iShouldBeNavigatedToLoginPageWithTitle(String title)
    {
        Assertions.assertEquals(title,BasePage.getTitle());
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
         BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw)
    {
        BasePage.loginPage.enterPassword(pw);
    }

    @When("i click on login button")
    public void i_click_on_login_button()
    {
        BasePage.loginPage.clickLogin();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {

    }


    @When("i click on register link from the nav bar")
    public void i_click_on_register_link_from_the_nav_bar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page with title {string}")
    public void i_should_be_navigated_to_register_page_with_title(String title) {
        Assertions.assertEquals(title,BasePage.getTitle());
    }

    @When("i select gender as male")
    public void i_select_gender_as_male()
    {
        BasePage.registerPage.clickMaleRadioBtn();
    }

    @When("i enter firstName lastName email password confPassword")
    public void i_enter_first_name_last_name_email_password_conf_password(io.cucumber.datatable.DataTable dataTable)
    {
          BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
          BasePage.registerPage.enterLastName(dataTable.cell(1,1));
          BasePage.registerPage.enterEmail(dataTable.cell(1,2));
          BasePage.registerPage.enterPassword(dataTable.cell(1,3));
          BasePage.registerPage.enterConfPassword(dataTable.cell(1,4));
    }

    @When("i click on register button")
    public void i_click_on_register_button() {
          BasePage.registerPage.clickRegisterButton();
    }

    @Then("i should see confirmation message {string}")
    public void i_should_see_confirmation_message(String cm)
    {
        Assertions.assertEquals(cm,BasePage.registerPage.verifyRegisterConfMsg());
    }


    @Then("i should see error message for firstName as {string}")
    public void iShouldSeeErrorMessageForFirstNameAs(String fnErrorMsg)
    {

       Assertions.assertEquals(fnErrorMsg,BasePage.registerPage.verifyFirstNameErrorMsg());
    }
}
