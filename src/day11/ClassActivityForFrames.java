package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassActivityForFrames {
    public static void main(String[] args) throws InterruptedException {
        testCase1();
    }

    public static void testCase1() throws InterruptedException {
        /**
         * Test case 1:
         * go to http://practice.primetech-apps.com/practice/frames
         * Verify that there is a page header text as “Frames”.
         * Find the iFrame element and switch into it
         * Find firstname, lastname, address, city, state, and zipcode, and type relative information.
         * Click on submit button.
         * Verify you see “You have submitted below information:” message.
         * Switch back to main frame
         * Verify that there is a page header text as “Frames”.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/frames");
        driver.manage().window().maximize();

        WebElement header = driver.findElement(By.xpath("//h3[text()='Frames']"));
        System.out.println(header.getText().equals("Frames"));

        driver.switchTo().frame("iframe1");

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("PrimeTech");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Bootcamp");

        WebElement address = driver.findElement(By.xpath("//input[@id='address']"));
        address.sendKeys("2222 A lane drive ");

        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("la");

        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select option = new Select(state);
        option.selectByIndex(2);

        WebElement zip = driver.findElement(By.xpath("//input[@id='zipCode']"));
        zip.sendKeys("22205");



        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        //We need to scroll to the submit button so it can be visible
        submitButton.sendKeys(Keys.DOWN);//should scroll to the button
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(4000);

        //expected result is to see following message --> You have submited below information:

        WebElement confirmationMessage = driver.findElement(By.xpath("//h3[text()='You have submited below information:']"));
        System.out.println("is message matching expected? "+confirmationMessage.getText().equals("You have submited below information:"));
        System.out.println("is message displayed ? "+confirmationMessage.isDisplayed());


        //switch back to  main frame
        driver.switchTo().defaultContent();

        System.out.println("Is Main html match with expected? "+header.getText().equals("Frames"));

        driver.quit();

    }

}
