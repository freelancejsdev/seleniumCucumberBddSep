package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    WebDriver driver;

    @FindBy(id="gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id="FirstName")
    public WebElement firstNameTextBox;


    @FindBy(id = "LastName")
    public WebElement latNameTextBox;

    @FindBy(id="Email")
    public WebElement emailTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(id="ConfirmPassword")
    public WebElement confPasswordTextBox;


    @FindBy(id="register-button")
    public WebElement registerButton;


    @FindBy(className = "result")
    public WebElement registerConfText;


   @FindBy(id = "FirstName-error")
    public WebElement firstNameErrorMsg;



    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


   public void clickMaleRadioBtn()
   {
       maleRadioBtn.click();
   }

   public void enterFirstName(String fn)
   {
       firstNameTextBox.sendKeys(fn);
   }

    public void enterLastName(String ln)
    {
       latNameTextBox.sendKeys(ln);
    }

    public void enterEmail(String em)
    {
      emailTextBox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
      passwordTextBox.sendKeys(pw);
    }

    public void enterConfPassword(String cpw)
    {
       confPasswordTextBox.sendKeys(cpw);
    }

    public void clickRegisterButton()
    {
        registerButton.click();
    }

    public String verifyRegisterConfMsg()
    {
        return registerConfText.getText();
    }

    public String verifyFirstNameErrorMsg()
    {
        return firstNameErrorMsg.getText();
    }
}
