package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorsExample {

    public static void main(String[] args) {

        //This is creating an object/instance of chromedriver class
        WebDriver driver = new ChromeDriver();

        //Navigate to the page
        driver.get("https://selectorshub.com/xpath-practice-page/");

        //Tell selenium where/how to find the element
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //Once the element is found , then we can interact with it
        emailInputBox.sendKeys("fake@email.com");

        //Entering a value into the password field
        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        passwordInputBox.sendKeys("fakepassword");

        //Entering a value into the company field
        WebElement companyField = driver.findElement(By.name("company"));
        companyField.sendKeys("primetech-bootcamp");

        //Entering a value into the phone number field
        WebElement phoneNumber = driver.findElement(By.name("mobile number"));
        phoneNumber.sendKeys("202-444-6666");

        //LinkText & partialLinkText

        WebElement titleLink = driver.findElement(By.linkText("Find out how to automate these controls without XPath"));
        String titleText =  titleLink.getText();
        System.out.println( "*************" + titleText + "**************");

        WebElement donationLink = driver.findElement(By.partialLinkText("Consider a small Donation"));
        String donationText = donationLink.getText();
        System.out.println("****************" + donationText + "***************");


        //Using the click() method
        titleLink.click();

    }

}
