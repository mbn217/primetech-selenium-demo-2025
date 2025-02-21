package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {



    //We need a constructor
    //What this line is telling us : Hey pagefactory, initialize all the elements in this class with the driver
    //instance whenever an object of this class is created
    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement productPageMainLabel;

}
