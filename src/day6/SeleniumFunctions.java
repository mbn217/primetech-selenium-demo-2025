package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class SeleniumFunctions {
    public static void main(String[] args) throws InterruptedException {
        //keysFunctionsExample();
        keysFunctionsExample2();
    }


    public static void keysFunctionsExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");

        WebElement htmlPage = driver.findElement(By.xpath("//html"));



        for (int i = 0; i < 15; i++) {
            htmlPage.sendKeys(Keys.DOWN);
            Thread.sleep(2000);
        }

        driver.quit();
    }
    public static void keysFunctionsExample2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));

        //You can also use Keys.chord to send a text
        //searchBox.sendKeys(Keys.chord("Selenium"));


        searchBox.sendKeys("Selenium");
        //Control+ A  , Control + X   ( If you are on Mac then use COMMAND instead of control)

        searchBox.sendKeys(Keys.chord(Keys.COMMAND , "a")); //to copy a text

        Thread.sleep(3000);

        searchBox.sendKeys(Keys.chord(Keys.COMMAND , "x"));

        Thread.sleep(3000);

        driver.quit();




    }





}
