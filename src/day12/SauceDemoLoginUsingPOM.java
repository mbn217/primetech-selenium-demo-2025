package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SauceDemoLoginUsingPOM {
    static LoginPage loginPage = new LoginPage();
    static ProductPage productPage = new ProductPage();

    public static void main(String[] args) throws InterruptedException {
        verifyMainLabel();
        verifyLockedOutUser();
    }

    public static void verifyMainLabel() throws InterruptedException {
        /**
         *     Test Case 1:
         *     Navigate to https://www.saucedemo.com/
         *     Enter “standard_user” into username and “secret_sauce” into passwords and login
         *     Verify that “Swag Labs” label is displayed
         */
        //WebDriver driver = new ChromeDriver(); // we will replace it with singleton Driver class
        Driver.getDriver().get(ConfigurationReader.getPropertyValue("saucedemoUrl"));
        //WebElement username = Driver.getDriver().findElement(By.xpath("//input[@id='user-name']"));
        //WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
        //WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='login-button']"));
        Thread.sleep(2000);
        loginPage.username.sendKeys("standard_user");
        Thread.sleep(2000);
        loginPage.password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        loginPage.loginButton.click();
        Thread.sleep(2000);

        //WebElement mainPageLabel = Driver.getDriver().findElement(By.xpath("//div[@class='app_logo']"));
        if (productPage.productPageMainLabel.isDisplayed()){
            System.out.println("The Label is displayed!!!!");
        }else {
            System.out.println("The label is not Displayed!!!!");

        }

        Driver.closeDriver();

    }
    public static void verifyLockedOutUser() throws InterruptedException {
        /**
         *     Test Case 2:
         *     Navigate to https://www.saucedemo.com/
         *     Enter “locked_out_user” into username and “secret_sauce” into passwords and login
         *     Verify that The Error message is equal to“ Epic sadface: Sorry, this user has been locked out.”
         */

        //WebDriver driver = new ChromeDriver();
        Driver.getDriver().get(ConfigurationReader.getPropertyValue("saucedemoUrl"));
        //WebElement username = Driver.getDriver().findElement(By.xpath("//input[@id='user-name']"));
       //WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
        //WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='login-button']"));
        Thread.sleep(2000);
        loginPage.username.sendKeys("locked_out_user");
        Thread.sleep(2000);
        loginPage.password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        loginPage.loginButton.click();
        Thread.sleep(2000);

        //WebElement errorLockedOutUserMessage = Driver.getDriver().findElement(By.xpath("//h3"));
        String lockedOutText = loginPage.errorMessageLabel.getText();
        if(lockedOutText.equals("Epic sadface: Sorry, this user has been locked out.")){
            System.out.println("The errors message is matching with requirement");
        }else{
            System.out.println("The error message is NOT matching with requirement");
        }

        Driver.closeDriver();


    }


}
