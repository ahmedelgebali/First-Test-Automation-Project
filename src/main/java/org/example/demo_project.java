package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class demo_project {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//try to log in without any action and print the Error message on the screen
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]")).getText());

//try to log in when email and password fields are empty and print error message on the screen
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]")).getText());

//try to log in using invalid username and valid password and print error message
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("rahulshettyacade");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());

//try to log in using valid username and invalid password and print error message
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("sjhkkkkkkkafvasjhklskjlahvdsdkjsdklj");
        driver.findElement(By.id("password")).sendKeys("learninj");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("learninj");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());

//try to log in using valid both username and password
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

//open "category 1" section
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        System.out.println(driver.getTitle());

//fill the blank in valid info
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ahmed Elgebali");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("helloworld");
        driver.findElement(By.id("exampleCheck1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("14");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//strong[normalize-space()='Success!']")).getText());
//open "category 2" section
        driver.get("https://rahulshettyacademy.com/angularpractice/shop");
        driver.findElement(By.xpath("//a[normalize-space()='Category 2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
        driver.findElement(By.id("#exampleInputPassword1")).sendKeys("asdfghjklasdfghjkl");
        driver.findElement(By.id("#exampleCheck1")).click();
        driver.findElement(By.id("#exampleFormControlSelect1")).click();
        driver.findElement(By.id("#inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("4 28 2023");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

//        driver.findElement(By.xpath("//app-card[1]//div[1]//div[1]//h4[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [3]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info'] [4]")).click();
    }
}
