package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemoExamples {
    public static void main(String[] args) {
        frameExample();
    }

    public static void frameExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");

        //We need to tell Webdriver to focus on the proper frame
        driver.switchTo().frame("top");

        WebElement mainHeader = driver.findElement(By.xpath("//h1[text()='Nested Frames Example']"));
        System.out.println(mainHeader.getText());

        //We have to tell the driver to switch to original/default html so later it can find the rest of frames with the default one
        driver.switchTo().defaultContent();//this should switch back to original html root

        //we need to swtich to the middle frame so we can apply automation on that specific html elements
        //Option We will use WebElement to switch to new frame
        WebElement middleFrameElement = driver.findElement(By.xpath("//frame[@name='middle']"));
        driver.switchTo().frame(middleFrameElement);


        WebElement middleFrameHeader = driver.findElement(By.xpath("//h1[text()='Middle']"));
        System.out.println(middleFrameHeader.getText());

        driver.switchTo().defaultContent();//this should switch back to original html root
        driver.switchTo().frame(1);
        WebElement leftHeaderLabel = driver.findElement(By.xpath("//h1"));
        System.out.println(leftHeaderLabel.getText());

    }



}
