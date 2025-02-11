package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsClassActivity {
    public static void main(String[] args) throws InterruptedException {
        testCase1();
    }

    public static void testCase1() throws InterruptedException {
        /**
         * Test case 1
         * go to https://demoqa.com/alerts
         * Click on the first ‘Click me’  button and Accept the alert.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        WebElement btn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        btn1.click();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();


        /**
         * Test case 2
         * go to https://demoqa.com/alerts
         * Click on the second ‘Click me’ button and get the text of it.
         * Then verify if the text equals to “This alert appeared after 5 seconds” then Accept the alert.
         *
         */
        WebElement btn2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        btn2.click();
        //Thread.sleep(7000); //This is one option
        //Explicit wait will solve this
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        Thread.sleep(4000);
        driver.quit();




    }


}
