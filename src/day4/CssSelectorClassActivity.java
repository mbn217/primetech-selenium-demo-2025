package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorClassActivity {
    public static void main(String[] args) {

        classActivityOne();

    }

    public static void classActivityOne(){
        /**
         * Go to https://testpages.eviltester.com/styled/basic-html-form-test.html
         * Enter username as “primetechuser"
         * Enter password as “automation”
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        WebElement username = driver.findElement(By.cssSelector("input[name=username]"));
        username.sendKeys("primetechuser");

        WebElement password = driver.findElement(By.cssSelector("input[type=password]"));
        password.sendKeys("automation");

        driver.quit();


    }



}
