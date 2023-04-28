package org.example;

import org.bouncycastle.crypto.agreement.kdf.ECDHKEKGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

//        driver.findElement(By.xpath("//app-card[1]//div[1]//div[1]//h4[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [4]")).click();
    }
}