package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WindowHandleClassActivity {
    public static void main(String[] args) {
        //testCase1();
        testCase2();
    }

    public static void testCase1(){
        /**
         * Test case 1
         * go to http://practice.primetech-apps.com/practice/browser-windows
         * Click on ‘New Tab’ button.
         * Then get the window handles and print what are they.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/browser-windows");

        WebElement newButton = driver.findElement(By.xpath("//a[@id='newTab']"));
        newButton.click();//this will open a new tab for us

        ArrayList<String> allWindows = new ArrayList<>(driver.getWindowHandles());
        for(String tab : allWindows){
            System.out.println("The Id is : " + tab);
        }
        driver.quit();

    }

    public static void testCase2(){
        /**
         * Test case 2
         * go to http://practice.primetech-apps.com/practice/browser-windows
         * 1. Get the main window ID and store it in a String called mainWindowId,
         * 2. Click on the ‘New Tab’ button
         * 3. Get window IDs and store it into a Set
         * 4. Get the first window ID from the Set and Verify it matches with the main window id in step 1.  Then get the second window id and store it in variable called secondWindowId.
         * 5. Switch to the second window
         *  6. Verify that there is a button called ‘New Tab’
         * 7. Close the window,  Switch back to the main window, Verify you are on the main window.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/browser-windows");
        String mainWindowId = driver.getWindowHandle();

        WebElement newButton = driver.findElement(By.xpath("//a[@id='newTab']"));
        newButton.click();//this will open a new tab for us

        ArrayList<String> listOfWindows = new ArrayList<>(driver.getWindowHandles());
        if(mainWindowId.equals(listOfWindows.get(0))){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }

        //getting second tab id
        String secondTabId = listOfWindows.get(1);
        //switching to second tab
        driver.switchTo().window(secondTabId);

        WebElement secondTabButton = driver.findElement(By.xpath("//a[@id='newTab']"));
        System.out.println(secondTabButton.getText().equals("New Tab")); // if return true mean its found , if false then not found

        driver.close();
        driver.switchTo().window(mainWindowId);

        driver.quit();
    }



}
