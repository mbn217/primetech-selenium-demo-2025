package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
    public static void main(String[] args) throws InterruptedException {
        alertExamples();
    }


    public static void alertExamples() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

        WebElement btn1 = driver.findElement(By.xpath("//input[@id='alertexamples']"));
        btn1.click();
        Thread.sleep(4000);
        //Handle alert by accepting it ( clicking on OK button )
        driver.switchTo().alert().accept();


        WebElement btn2 = driver.findElement(By.xpath("//input[@id='confirmexample']"));
        btn2.click();
        Thread.sleep(4000);
        //We can dismiss the popup ( clicking on cancel button)
        driver.switchTo().alert().dismiss();


        WebElement btn3 = driver.findElement(By.xpath("//input[@id='promptexample']"));
        btn3.click();
        Thread.sleep(4000);
        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        driver.switchTo().alert().sendKeys("Automation Using Selenium");
        driver.switchTo().alert().accept();

        //You can also create a reference variable of Alert type and then use the Rv (Reference variable/object)
        //to sendkey /accept /dismiss alerts
//        Alert myAlert = driver.switchTo().alert();
//        myAlert.dismiss();
//        myAlert.accept();
//        myAlert.sendKeys("");





    }


}
