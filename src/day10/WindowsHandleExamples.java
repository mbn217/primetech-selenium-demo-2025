package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowsHandleExamples {
    public static void main(String[] args) {
        //windowHandleExample();
        windowHandleExample2();
    }

    public static void windowHandleExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement linkElement = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        linkElement.click();// this will open a new tab

        //from here we are on the new tab
        WebElement tab2Header = driver.findElement(By.xpath("//h1"));
        System.out.println(tab2Header.getText());

        //Store the main window handle -- the first tab
        String mainWindowHandle = driver.getWindowHandle();

        Set<String> allWindowHandles = driver.getWindowHandles();
        for( String window : allWindowHandles){
            //if the window is not equal to the main handle ( main tab) then go and switch to it
            if(!window.equals(mainWindowHandle)){
                driver.switchTo().window(window);
            }
        }

        WebElement ajaxHeader = driver.findElement(By.xpath("//h1"));
        System.out.println(ajaxHeader.getText());

        //If we want to switch back to main tab
        driver.switchTo().window(mainWindowHandle);

    }



    public static void windowHandleExample2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement linkElement = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        linkElement.click();// this will open a new tab

        //from here we are on the new tab
        WebElement tab2Header = driver.findElement(By.xpath("//h1"));
        System.out.println(tab2Header.getText());

        //Store the main window handle -- the first tab
        String mainWindowHandle = driver.getWindowHandle();

        //Get all windows handles
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(1));

        WebElement ajaxHeader = driver.findElement(By.xpath("//h1"));
        System.out.println(ajaxHeader.getText());

    }



}
