package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BookaFlight {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//        choose the country
        driver.findElement(By.id("autosuggest")).sendKeys("eg");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options){
            if (option.getText().equalsIgnoreCase("Egypt")){
                option.click();
                break;
            }
        }





        //chose the cities and the data
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[30]")).click();


        // chose currency type
        WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropD = new Select(staticdrop);
        dropD.selectByIndex(2);
        dropD.selectByVisibleText("USD");
        dropD.selectByVisibleText("AED");
        dropD.selectByVisibleText("USD");

        //select the passengers' number
        String adult = "hrefIncAdt";
        String child = "hrefIncChd";
        String infant = "hrefIncInf";
        driver.findElement(By.id("divpaxinfo")).click();
        for (int i = 1; i < 4; i ++) {
            driver.findElement(By.id(adult)).click();
        }
        driver.findElement(By.id(child)).click();
        driver.findElement(By.id(child)).click();
        driver.findElement(By.id(infant)).click();


        System.out.println(driver.findElement(By.id(adult)).getText());
        driver.findElement(By.id("btnclosepaxoption")).click(); //click on done
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click(); // click on check box
        driver.findElement(By.xpath("//a[@onclick=\"return ShowModal('SpecialAssistancePopup');\"]")).click(); //click on special assistance
        driver.findElement(By.id("SpecialAssistanceWindow")).click(); //exit


//        driver.quit();


    }
}
