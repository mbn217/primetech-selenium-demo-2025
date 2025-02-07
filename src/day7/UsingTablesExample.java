package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingTablesExample {
    public static void main(String[] args) {
        tableExample();
    }


    public static void tableExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/tag/table.html");

        //Getting specific table data "Alan"
        WebElement td = driver.findElement(By.xpath("(//td)[1]"));
        System.out.println("The value is : " + td.getText());

        System.out.println("---------------------------------");
        //Getting the table headers
        List<WebElement> listOfTableHeaders = driver.findElements(By.xpath("//th"));
        for (WebElement header : listOfTableHeaders){
            System.out.println("The header is :" + header.getText());
        }

        System.out.println("---------------------------------");
        //Loops through entire table
        // table header ----> th
        // table data ----> td
        // table rows -----> tr

        List<WebElement> listOfRows = driver.findElements(By.tagName("tr"));
        for (WebElement row : listOfRows){
            //To retrieve all the text in the entire row
            //System.out.println(row.getText());

            List<WebElement> listOfCells = row.findElements(By.tagName("td"));
            for (WebElement cell : listOfCells){
                System.out.println("The table data is :" + cell.getText() );
            }


        }

        driver.quit();

    }


}
