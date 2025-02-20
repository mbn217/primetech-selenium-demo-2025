package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.SeleniumUtils;

public class UtilitiesExample {
    public static void main(String[] args) {
        fillAForm();
    }

    public static void fillAForm(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        //Need to select from the first dropDown
        WebElement multiSelectElement = driver.findElement(By.xpath("//select[@multiple='multiple']"));
        //Select select = new Select(multiSelectElement);
        //select.selectByValue("ms2");
        SeleniumUtils.selectFromDropDownByValue(multiSelectElement , "ms2");


        //Need to select from the second dropdown
        WebElement singleSelectElement = driver.findElement(By.xpath("//select[@name='dropdown']"));
        //Select select2 = new Select(singleSelectElement);
        //select2.selectByValue("dd1");
        SeleniumUtils.selectFromDropDownByValue(singleSelectElement , "dd1");



    }



}
