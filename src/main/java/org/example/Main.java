package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}

//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close();
//        driver.quit();
//        driver.getPageSource();
//        System.setProperty("webdriver.chrome.driver","C:chromedriver.exe")

//ooppractical op = new ooppractical();
//op.gethello();
//        System.setProperty("webdriver.chrome.driver","C:chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close();
//        driver.quit();


//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
