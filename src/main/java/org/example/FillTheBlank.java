package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;

public class FillTheBlank {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      open the website
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

//      try to log in without any action and print the Error message on the screen
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(1500);

        String errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText();
        System.out.println(errorMessage);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText(),
                "Empty username/password.");
        Thread.sleep(2000);

//      try to log in when email and password fields are empty and print error message on the screen
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(1500);

        String errorMessage1 = driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText();
        System.out.println(errorMessage1);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText(),
                        "Empty username/password.");
        Thread.sleep(1500);

//      try to log in using invalid username and valid password and print error message
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("rahulshettyacade");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(1800);

        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText(),
                "Incorrect username/password.");
        Thread.sleep(1000);

//      try to log in using valid username and invalid password and print error message
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
        Thread.sleep(1800);
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText(),
                "Incorrect username/password.");
        Thread.sleep(1000);


//      try to log in using valid both username and password
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("usertype")).click();
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(500);
//this is the end of log in scenarios

//      open "category 1" section
        driver.findElement(By.xpath("//a[@class='list-group-item'][1]")).click();
        System.out.println(driver.getTitle());

//      fill the blank in valid info
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ahmed Elgebali");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("helloworld");
        driver.findElement(By.id("exampleCheck1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        driver.findElement(By.id("inlineRadio2")).click();

        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("14/7/1999");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//strong[normalize-space()='Success!']")).getText());

//      open "category 2" section
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@class='list-group-item'][2]")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

//       fill the blank in valid info
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elgebalia34@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asdfghjklasdfghjkl");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(1);

        driver.findElement(By.id("inlineRadio2")).click(); //click on the employment status button
        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.xpath("//input[@type='date']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12122020");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click(); //submit

        //check if the checkout section is empty
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        driver.navigate().back(); // back to the shop page to add some items to the card

        //add items to the card
        driver.get("https://rahulshettyacademy.com/angularpractice/shop");
        for (int i=0; i<3; i++)
            {
                driver.findElement(By.xpath("//app-card[1]//div[1]//div[2]//button[1]")).click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,1000)");
                driver.findElement(By.xpath("//app-card[2]//div[1]//div[2]//button[1]")).click();
                driver.findElement(By.xpath("//app-card[3]//div[1]//div[2]//button[1]")).click();
            }

        //open the checkout section to make a purchase
        driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
        driver.findElement(By.id("country")).sendKeys("united"); //write the first name of the country and choose from the given options menu
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='United Arab Emirates']")).click();

//        List<WebElement> countries = driver.findElements(By.cssSelector("div[class='suggestions']"));
//        for (WebElement uae : countries){
//            if (uae.getText().equalsIgnoreCase("United Arab Emirates")) {
//                uae.click();
//                break;
//            }
//        }

        //print the total cost
        Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='checkbox2']")).click(); //agree with terms and conditions
        driver.findElement(By.cssSelector("input[value='Purchase']")).click(); // click on purchase button to finish checkout
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());



//        driver.quit();
    }
}
