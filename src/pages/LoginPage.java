package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    //First thing : we need to make sure the the element are initialized
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver() , this ); //selenium 4.19.0 you should use this
    }



    //Second thing : we need to identify the elements
    //Find the elements that are part of the login page (login html page)

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username; //Declaring the element object for the username


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;


    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;


    @FindBy(xpath = "//h3")
    public WebElement errorMessageLabel;
}
