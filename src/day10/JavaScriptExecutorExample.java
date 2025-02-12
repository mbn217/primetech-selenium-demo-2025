package day10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
    public static void main(String[] args) {
        //scrollToElementExample();
        clickOnElementExample();
    }

    public static void scrollToElementExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");
        WebElement calculatorLink = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        //Using Keys class
        //calculatorLink.sendKeys(Keys.DOWN);

        //Option 2 Using javascriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver ;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", calculatorLink);
        driver.quit();
    }

    public static void clickOnElementExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");

        WebElement aboutLink = driver.findElement(By.xpath("(//a[text()='About'])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()" , aboutLink);

    }

}
