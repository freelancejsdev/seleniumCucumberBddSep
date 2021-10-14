package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    @FindBy(id="Email")
    public WebElement emailTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;

    @FindBy(className = "login-button")
    public WebElement loginButton;




    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void enterEmail(String em)
    {
        emailTextBox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
       passwordTextBox.sendKeys(pw);
    }

    public void clickLogin()
    {
       loginButton.click();
    }


   /* public boolean verifyLogin()
    {
       return loginButton.isDisplayed();
    }

    */

}
