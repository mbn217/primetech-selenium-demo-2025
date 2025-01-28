package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoWithoutDriverPathExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");



    }



}
