package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckboxesExamples {
    public static void main(String[] args) {
        //checkboxesAndRadioButtonsExample1();
        //isDisplayedExample();
        isEnabledExample();
    }


    public static void checkboxesAndRadioButtonsExample1(){
        //example of clicking on checkbox
        //example of clicking on radio button
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        //clicking on checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb2']"));
        checkbox2.click();

        //clicking on a radio button
        WebElement radioButton1 = driver.findElement(By.xpath("//input[@type='radio' and @value='rd1']"));
        radioButton1.click();

        //To verify if a checkbox is selected or not we use isSelected()
        boolean isCheckbox1SelectedOrNot  = checkbox1.isSelected();
        System.out.println("The checkbox 1 is selected or not ----> " + isCheckbox1SelectedOrNot);

        WebElement radioButton2 = driver.findElement(By.xpath("//input[@type='radio' and @value='rd2']"));
        boolean isRadioButton2SelectedOrNot = radioButton2.isSelected();
        System.out.println("The radio button 2 is selected or not -----> " + isRadioButton2SelectedOrNot);
        driver.quit();

    }//end of method


    public static void isDisplayedExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        WebElement pageHeader = driver.findElement(By.xpath("//h1[text()='Basic HTML Form Example']"));
        System.out.println("The header is displayed or not ---> " + pageHeader.isDisplayed());

        driver.quit();


    }

    public static void isEnabledExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        WebElement impressiveRadioButton = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
        System.out.println("Is Impressive radio button enabled or not ---> " + impressiveRadioButton.isEnabled());

        WebElement disabledRadioButton = driver.findElement(By.xpath("//input[@id='noRadio']"));
        System.out.println("Disabled radio button is enabled or not ---> " + disabledRadioButton.isEnabled() );

        driver.quit();



    }


}
