//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class ll {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://badrforsales-test.souqalbadr.top/ar/login");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("ahmed");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
//        js.executeScript("window.scrollBy(0, 1000);");
//        driver.findElement(By.cssSelector("button[class='btn btn-primary d-block w-100 btn-xlg rounded-10 auth-submit']")).click();
////        create receipt
//        driver.findElement(By.xpath("//span[contains(text(),'عمليه بيع جديده')]")).click();
//        js.executeScript("window.scrollBy(0, 200);");
//        String productName = "شيبسي";
//        driver.findElement(By.cssSelector("#item_result")).sendKeys(productName);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        Actions ac = new Actions(driver);
//        ac.moveToElement(driver.findElement(By.xpath("//a[text()='" + productName + "']"))).perform();
//        ac.click(driver.findElement(By.xpath("//a[text()='" + productName + "']"))).perform();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        // to fill the amount
//        driver.findElement(By.xpath("//input[@id='amount']")).clear();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1");
//        Thread.sleep(2000);
//
//        String tab = driver.getWindowHandle(); // to save the current tabID
//        driver.findElement(By.xpath("//a[@id='addMe']")).click();
//        js.executeScript("window.scrollBy(0, 600);");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0, 600);");
//        ac.moveToElement(driver.findElement(By.xpath("//a[@id='submit-form']/span"))).perform();
//
//        js.executeScript("window.scrollBy(0, 600);");
//        driver.findElement(By.xpath("//a[@id='submit-form']/span")).click();
//
//        Thread.sleep(6000);
//        driver.switchTo().window(tab); // to go back to the last tab
//        js.executeScript("window.scrollBy(0, 600);");
//        js.executeScript("window.scrollBy(0, 600);");
//        ac.moveToElement(driver.findElement(By.xpath("(//i[@class='fa fa-print'])[1]"))).perform();
//        driver.findElement(By.xpath("(//i[@class='fa fa-print'])[1]")).click();
//    }
//}
