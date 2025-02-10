package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingWebElementsExamples {

    public static void main(String[] args) {
        //example1();
        example2();
    }


    public static void example1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        List<WebElement> listOfParagraghs = driver.findElements(By.xpath("//div[@class='centered']/p"));

        for( WebElement element    : listOfParagraghs    ){
            System.out.println("The paragraph is : " + element.getText());
            System.out.println("---------------------");
        }

        driver.quit();

    }


    public static void example2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//a"));

        System.out.println("The number of links in this page is :" + listOfLinks.size());

        for (WebElement link : listOfLinks){
            System.out.println("The link is : " + link.getAttribute("href"));
            System.out.println("-----------------------------------");
        }

        driver.quit();

    }

}
