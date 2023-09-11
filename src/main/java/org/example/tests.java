package org.example;

import org.bouncycastle.crypto.agreement.kdf.ECDHKEKGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import java.time.Duration;

import static org.bouncycastle.cms.RecipientId.password;

public class tests {
    public static void main(String[] args) throws InterruptedException {

        int public1 =3;




//        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        WebDriver driver;
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        String uname = "rahulshettyacademy";
//        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//        driver.findElement(By.id("username")).sendKeys(uname);
//        driver.findElement(By.id("usertype")).click();
//        driver.findElement(By.id("password")).sendKeys("learning");
//        driver.findElement(By.id("terms")).click();
//        driver.findElement(By.id("signInBtn")).click();
//
//        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

//        Thread.sleep(2000);

//        driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-shop:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > app-card-list:nth-child(2) > app-card:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h4:nth-child(1) > a:nth-child(1)")).click();
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
//        Thread.sleep(2000);
//        driver.quit();


//        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Ahmed ");
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
//        driver.quit();

//        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText(),
//                "Incorrect username/password.");




//        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]")).getText(), "Incorrect username/password.");

//        driver.findElement(By.xpath("//app-card[1]//div[1]//div[1]//h4[1]")).click();

//        driver.findElement(By.xpath("//button[@class='btn btn-info'] [1]")).click();
//        driver.findElement(By.xpath("//button[@class='btn btn-info'] [2]")).click();
//        driver.findElement(By.xpath("//button[@class='btn btn-info'] [3]")).click();
//        driver.findElement(By.xpath("//button[@class='btn btn-info'] [4]")).click();

    }
}