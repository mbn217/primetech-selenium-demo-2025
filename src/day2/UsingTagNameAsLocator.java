package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagNameAsLocator {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //navigate to facebook
        driver.get("https://www.facebook.com");

        //Tell selenium to find an element that has a tagName = h2
        WebElement heading = driver.findElement(By.tagName("h2"));
        String headingText = heading.getText();
        System.out.println("The heading of the Facebook is ----> " + headingText);

    }

}
