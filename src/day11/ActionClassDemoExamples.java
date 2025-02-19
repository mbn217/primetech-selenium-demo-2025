package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemoExamples {
    public static void main(String[] args) {
        //doubleClickExample();
        //onContextExample();
        //onMouseOverExample();
        //onMouseLeaveExample();
        dragAndDropExample();
    }

    public static void doubleClickExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='ondoubleclick']"));

        //we need to double click
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();// it is recommanded to use the build.perform
        driver.quit();
    }

    public static void onContextExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        WebElement onContextButton = driver.findElement(By.xpath("//button[@id='oncontextmenu']"));

        //we need to right click on the button -- context menu
        Actions action = new Actions(driver);
        action.contextClick(onContextButton).build().perform();

        driver.quit();
    }

    public static void onMouseOverExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");

        WebElement onMouseOver = driver.findElement(By.xpath("//button[@id='onmouseover']"));
        Actions action = new Actions(driver);
        action.moveToElement(onMouseOver).build().perform();
        driver.quit();
    }

    public static void onMouseLeaveExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");

        WebElement onMouseLeaveBtn = driver.findElement(By.xpath("//button[@id='onmouseleave']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(onMouseLeaveBtn).build().perform();

        //we need to move away from the element to trigger the event

        WebElement htmlPage = driver.findElement(By.xpath("//html"));
        actions.moveToElement(htmlPage).build().perform();

        driver.quit();

    }

    public static void dragAndDropExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");

        WebElement sourceOne = driver.findElement(By.xpath("//div[@id='draggable1']"));
        WebElement sourceTwo = driver.findElement(By.xpath("//div[@id='draggable2']"));

        WebElement destinationOne = driver.findElement(By.xpath("//div[@id='droppable1']"));
        WebElement destinationTwo = driver.findElement(By.xpath("//div[@id='droppable2']"));

        Actions actions = new Actions(driver);
        //Option 1 we can use dragandDrop method()
        //actions.dragAndDrop(sourceOne, destinationOne).build().perform();
        //actions.dragAndDrop(sourceTwo, destinationTwo).build().perform();

        //option 2 we can use clickAndHold -->movetoElement-->release()

        actions.clickAndHold(sourceOne).moveToElement(destinationOne).release().build().perform();
        actions.clickAndHold(sourceTwo).moveToElement(destinationTwo).release().build().perform();
        driver.quit();

    }




}
