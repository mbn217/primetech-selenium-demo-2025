package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndManageFunctionsExamples {
    public static void main(String[] args) throws InterruptedException {
        navigateAndManageFunctionsExample();

    }

    public static void navigateAndManageFunctionsExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        //We can use windows.maximize to maximize the browser
        driver.manage().window().maximize();

        //Option 2 to navigate to website using navigate
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        Thread.sleep(2000);

        WebElement aboutLink = driver.findElement(By.xpath("(//a[@href='page?app=testpages&t=About'])[1]"));
        aboutLink.click();
        Thread.sleep(2000);

        driver.navigate().back(); //this will navigate to previous page

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.quit();




    }


}
