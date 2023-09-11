package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;



public class extra {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://abacusoncloud.tech/kaaf/ar/home-ar/");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
















/*


        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //back
        driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("ui-state-default")).click();
/*

        /* facebook
//try to log in using invalid both email/Num. or password
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("elgebalia33@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("dshefkhdncb");
        driver.findElement(By.id("loginbutton")).click();

//check from the error message facebook
        System.out.println(driver.findElement(By.className("_9ay7")).getText());

//try to log in using invalid email/Num. and valid password
        driver.findElement(By.id("email")).sendKeys("01210053236");
        driver.findElement(By.id("pass")).sendKeys("dsidhbadh");
        driver.findElement(By.id("loginbutton")).click();
//check from the error message
        System.out.println(driver.findElement(By.className("_9ay7")).getText());

//try to log in using valid both email/Num. and password
//        driver.findElement(By.id("email")).sendKeys("01210053236");
        driver.findElement(By.id("pass")).sendKeys("facebook070809");
        driver.findElement(By.id("loginbutton")).click();
//click on Watch button
        driver.findElement(By.xpath("a[role='link']")).click();
//scroll down
//        js.executeScript("window.scrollBy(0,600");

*/




    }
}
