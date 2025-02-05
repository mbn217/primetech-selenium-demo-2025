package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreElementFunctionsExample {

    public static void main(String[] args) {
        elementFunctionsExamples();

    }


    public static void elementFunctionsExamples(){
        //getAttribute() , getCssValue(), getTagName()

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement facebookLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
        System.out.println(" The text of the logo is : " + facebookLogo.getText());

        System.out.println("The text of the logo using alt is: " + facebookLogo.getAttribute("alt"));

        System.out.println("The the logo src value is : " + facebookLogo.getAttribute("src"));


        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("The height is : " + emailInput.getCssValue("height"));

        System.out.println("The line height is : " + emailInput.getCssValue("line-height"));


        //--------- use getTagName()
        System.out.println("The tag name for the logo is : " + facebookLogo.getTagName() );
        System.out.println("The tage name for the email box is :" + emailInput.getTagName());

        driver.quit();
    }


}
