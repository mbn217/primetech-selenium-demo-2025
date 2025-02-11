package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectFunctionExamples {
    public static void main(String[] args) throws InterruptedException {
        //usingSelectExample();
        multiSelectExample();
    }

    public static void usingSelectExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement dropDownSelection = driver.findElement(By.xpath("//select[@name='dropdown']"));
        //Select class is used to handle the Select dropdown (make sure that the tag is 'Select')
        Select selectItem = new Select(dropDownSelection);

        selectItem.selectByIndex(0);// by default options starts from 0

        Thread.sleep(4000);

        selectItem.selectByValue("dd6");

        Thread.sleep(4000);

        selectItem.selectByVisibleText("Drop Down Item 5");

        driver.quit();


    }

    public static void multiSelectExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        WebElement multiSelectElement = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));

        Select multiSelect = new Select(multiSelectElement);

        List<WebElement> listOfSelectedOptions =  multiSelect.getAllSelectedOptions();
        for (WebElement option : listOfSelectedOptions){
            System.out.println(option.getText());
        }
        System.out.println("---------------------------");

        List<WebElement> allOptions = multiSelect.getOptions();
        for (WebElement option : allOptions){
            System.out.println(option.getText());
        }


        multiSelect.deselectAll();

        driver.quit();


    }



}
