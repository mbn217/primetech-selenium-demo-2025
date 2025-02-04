package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

    public static void main(String[] args) {
        exampleOne();
    }

    public static void exampleOne(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");
        /**
         * //p[@id='para1']  -- Using xpath
         * p[id=para1]  -- Using long cssSelector
         * #para1 -- using short cssSelector
         */
        WebElement para1UsingLongCssSelectorById = driver.findElement(By.cssSelector("p[id=para1]"));
        System.out.println("Using long css selector by id, the text is: " + para1UsingLongCssSelectorById.getText());

        WebElement para1UsingShortCssSelectorById = driver.findElement(By.cssSelector("#para1"));
        System.out.println("Using short css selector by id, the text is: " + para1UsingShortCssSelectorById.getText());

        //------------------------Using class for css ----------------------
        System.out.println("***************************");
        WebElement para2ByClassLong = driver.findElement(By.cssSelector("p[class=sub]"));
        System.out.println("Using long class css syntax: " + para2ByClassLong.getText() );

        WebElement para2ByClassShort = driver.findElement(By.cssSelector(".sub"));
        System.out.println("Using short class css syntax: " + para2ByClassShort.getText());

        driver.quit();






    }


}
