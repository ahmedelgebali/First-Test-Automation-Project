package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

    public class LoginTests {
        private WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterMethod
        public void teardown() {
            driver.quit();
        }

        @Test(description = "Verify error message when logging in without any action")
        public void testLoginWithoutAction() {
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            driver.findElement(By.id("signInBtn")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[1]")));

            String errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]"))
                    .getText();
            System.out.println(errorMessage);

            // Add assertion for error message if needed
        }

        @Test(description = "Verify error message when logging in with empty email and password fields")
        public void testLoginWithEmptyFields() {
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");

            driver.findElement(By.id("usertype")).click();
            driver.findElement(By.id("terms")).click();
            driver.findElement(By.id("signInBtn")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[1]")));

            String errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]"))
                    .getText();
            System.out.println(errorMessage);

            // Add assertion for error message if needed
        }

        // Add more test methods using the same structure

    }

