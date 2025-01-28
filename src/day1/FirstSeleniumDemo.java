package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {

    public static void main(String[] args) {

        //System.out.println("Hellow world!");

        //Step 1: Set the path to the chromeDriver executable file
        System.setProperty("webdriver.chrome.driver", "browsers/chromedriver");

        //Step 2: Create a ChromeDriver Instance
        WebDriver chromeDriver = new ChromeDriver();

        //Step 3: Open a website
        chromeDriver.get("https://www.amazon.com");



    }

}
