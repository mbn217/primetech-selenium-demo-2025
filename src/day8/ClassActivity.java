package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity {
    public static void main(String[] args) {
        testCase1();
    }


    public static void testCase1(){
        /**
         *     go to amazon.com    click on sign in
         *      verify that you are on sign in page (either by sign-in text or email field).
         *      navigate back, and navigate forward
         *      verify that you are on sign in page (either by sign-in text or email field).
         *      click on create new account, verify you are on new account create page.
         *      navigate back, verify you are on the sign-in page.
         *      navigate forward, verify you are on the create account page.
         *      click on the Continue button without filling the form
         *      verify error messages displayed and get text to verify:
         *       Enter your name
         *        Enter your email or mobile phone number
         *       Minimum 6 characters required
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        //click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
        signInButton.click();

        //verify that we are on the sign in page
        WebElement signInLabel = driver.findElement(By.xpath("//h1"));

        if(signInLabel.isDisplayed() == true ){//will return true if label is displayed and false if its not
            System.out.println("We are on the sign in page successfully");
        }else {
            System.out.println("We are NOT on the sign in page");
        }



    }

}
