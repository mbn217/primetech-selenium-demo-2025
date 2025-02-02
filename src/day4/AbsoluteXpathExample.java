package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        WebElement headerTitle = driver.findElement(By.xpath("/html/body/div[1]/h1"));

        System.out.println("The title using absolute xpath is  : " + headerTitle.getText());


    }


}
