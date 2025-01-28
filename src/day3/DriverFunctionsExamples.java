package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFunctionsExamples {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selectorshub.com/xpath-practice-page/");

        //getTitle() --> It returns the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("The current title of the page is : " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is : " + currentUrl);

        Thread.sleep(5000);//this will stop the running of java code (stopping the thread) for 5 seconds

        //Quit() method will close entire browser( all tabs)
        driver.quit();



    }

}
