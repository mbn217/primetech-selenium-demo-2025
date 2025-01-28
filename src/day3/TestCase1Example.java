package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //getTitle of the page
        String title = driver.getTitle();
        System.out.println("The title is ----> " + title);

        //identify email/phone number field
        WebElement emailInputBox = driver.findElement(By.id("email"));
        //insert a value into the email inputbox
        emailInputBox.sendKeys("Automation");

        Thread.sleep(2000);

        //identify the password inputbox
        WebElement password = driver.findElement(By.name("pass"));
        //insert a value into the pass field
        password.sendKeys("Automation");

        Thread.sleep(2000);

        //click on login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        Thread.sleep(10000);
        //quit the browser
        driver.quit();


    }

}
