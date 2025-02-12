package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverQuitvsDriverCloseExample {
    public static void main(String[] args) throws InterruptedException {
        driverCloseQuitExample();
    }

    public static void driverCloseQuitExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement link = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        link.click(); //this will open a new tab
        //However the focus of the driver is still on the first tab.

        //If we want to close a tab .close()

        Thread.sleep(6000);
        driver.close();

        System.out.println("The driver instance ---->  " + driver);

        driver.quit();

        System.out.println("The driver instance ---->  " + driver);

        /**
         * close() , if you have more than 1 tab then it will close only the tab where driver
         * is focusing
         *
         * if you have only one tab then it will close that tab
         */

        /**
         * driver.quit() will kill all the running instances of the driver (it will close
         * all the tabs that are open , regardless of the focus) and make the driver null
         */
    }
}
