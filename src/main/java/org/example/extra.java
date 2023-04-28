package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class extra {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//try to log in using invalid both email/Num. or password
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("elgebalia33@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("dshefkhdncb");
        driver.findElement(By.id("loginbutton")).click();
//check from the error message
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




    }
}

////////////
//        WebDriver driver = new FirefoxDriver();
////
//        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//        System.out.println(driver.getTitle());
//        driver.findElement(By.id("username")).sendKeys("rahulshettyacadem");
//        driver.findElement(By.id("usertype")).click();
//        driver.findElement(By.id("password")).sendKeys("learning");
//        driver.findElement(By.id("terms")).click();
//        driver.findElement(By.id("signInBtn")).click();
///////////////
//
//        System.out.println(driver.findElement(By.linkText(" username/password.")).getText());
//        driver.findElement(By.className("customradio")).click();
//        driver.findElement(By.className("form-control"))
