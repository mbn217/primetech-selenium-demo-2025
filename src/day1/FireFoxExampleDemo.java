package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExampleDemo {

    public static void main(String[] args) {

        WebDriver ff = new FirefoxDriver();

        ff.get("https://www.amazon.com");


    }

}
