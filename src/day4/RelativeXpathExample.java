package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {

    public static void main(String[] args) throws InterruptedException {
        classActivityRelativeXpath();



    }

    /**
     * Go to https://selectorshub.com/xpath-practice-page/
     * Enter an email address, (jon.dow@gmail.com)
     * Enter password as “automation”.
     * Enter company as “primetech”.
     * Enter phone number as “222-222-2222”.
     * Click on submit button
     *
     */


    public static void classActivityRelativeXpath() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@title='Email' and @class='selectors-input jsSelector']"));
        emailInputBox.sendKeys("jon.dow@gmail.com");

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='pass' and @type='password']"));
        passwordInputBox.sendKeys("automation");

        WebElement companyInputBox = driver.findElement(By.xpath("(//input[@name='company' and @type='text' and @class='form-control'])[1]"));
        companyInputBox.sendKeys("primetech");

        WebElement phoneNumberInputBox = driver.findElement(By.xpath("(//input[@name='mobile number'])[1]"));
        phoneNumberInputBox.sendKeys("222-222-2222");

        WebElement submitButton = driver.findElement(By.xpath("//button[@value='Submit']"));
        submitButton.click();
        Thread.sleep(5000);

        driver.quit();

    }



}
