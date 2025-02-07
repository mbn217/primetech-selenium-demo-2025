package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassActivityForFindElements {
    public static void main(String[] args) {
        //testcase1();
        testcase2();
    }


    public static void testcase1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Login
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();


        List<WebElement> productLabels = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));

        System.out.println("The number of the products is : " + productLabels.size());

        for (WebElement product : productLabels){
            System.out.println("The product is : " + product.getText());
            System.out.println("-------------------------------");
        }

        driver.close();



    }


    public static void testcase2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Login
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();


        List<WebElement> listOfPrices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        for (WebElement priceElement : listOfPrices){
            System.out.println("The price is :" + priceElement.getText());
            System.out.println("--------------------");
        }

        driver.close();

    }










}
