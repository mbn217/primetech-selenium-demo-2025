package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2Example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //1 - Click on create a new account button
        WebElement createnewAccountButton = driver.findElement(By.className("_6lti"));
        createnewAccountButton.click();
        Thread.sleep(2000);

        //2- Get title and current url
        System.out.println(driver.getCurrentUrl());

        //3- enter automation in FirstName lastName, email , password fields
        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        firstNameInput.sendKeys("Automation");

        Thread.sleep(2000);

        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        lastNameInput.sendKeys("Automation");

        Thread.sleep(2000);

        WebElement emailInput = driver.findElement(By.name("reg_email__"));
        emailInput.sendKeys("Automation@primetech.com");

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(By.name("reg_passwd__"));
        passwordInput.sendKeys("Automation");

        Thread.sleep(2000);

        //4- click on signup button
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

        Thread.sleep(2000);

        driver.quit();






    }
}
