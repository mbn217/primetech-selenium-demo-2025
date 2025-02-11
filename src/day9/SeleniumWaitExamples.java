package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitExamples {
    public static void main(String[] args) {
        //implicitWaitExample();
        //explicitWaitExample();
        fluentWaitExample();
    }

    public static void implicitWaitExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Selenium default wait time is 0
        WebElement userNameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameField.sendKeys("standard_user");
        System.out.println("-----------------------");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("secret_sauce");

        driver.quit();
    }

    public static void explicitWaitExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");


        WebElement logoText = driver.findElement(By.xpath("//div[@class='login_logo']"));
        //System.out.println(logoText.getText());

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(logoText));

        driver.quit();
    }

    public static void fluentWaitExample(){
        System.out.println("We are inside fluent wait method");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement logoText = driver.findElement(By.xpath("//div[@class='login_logo']"));

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(logoText));

        driver.quit();


    }





}
