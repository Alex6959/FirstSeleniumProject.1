package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork02 {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
   @Test
public void findElementBysimpleLocator(){
        driver.findElement(By.id("dialog-notifications-success"));
        System.out.println("By Simple locators \n1.dialog-notifications-success");
        driver.findElement(By.id("bar-notification"));
        System.out.println("2.bar-notification");
        driver.findElement(By.id("dialog-notifications-error"));
        System.out.println("3.dialog-notifications-error");


        driver.findElement(By.className("close"));
        System.out.println("4. Class name 1");
        driver.findElement(By.className("ajax-loading-block-window"));
        System.out.println("5.Class name 2");
        driver.findElement(By.className("header-links-wrapper"));
        System.out.println("6.header-links-wrapper");


       WebElement log = driver.findElement(By.linkText("Log in"));
       System.out.println("7." + log.getText());
       WebElement w = driver.findElement(By.linkText("Wishlist"));
       System.out.println("8." + w.getText());

       driver.findElement(By.partialLinkText("Books"));
       System.out.println("9. partial link text  1 ");
       driver.findElement(By.partialLinkText("Computers"));

   }

@Test
    public void findElementByCssSelectorText(){
        driver.findElement(By.tagName("strong"));
        driver.findElement(By.tagName("head"));


        driver.findElement(By.cssSelector(" #mob-menu-button"));
        driver.findElement(By.cssSelector("dialog-notifications-success"));

        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".cart-label"));

        driver.findElement(By.cssSelector("[href='/Content/jquery-ui-themes/smoothness/jquery"));

        driver.findElement(By.cssSelector("[href*='Content']"));

        driver.findElement(By.cssSelector("[href^='/Plugins']"));

        driver.findElement(By.cssSelector("[href$='cart'"));
}
@AfterMethod
    public void tearDown(){
        driver.quit();
}
}
