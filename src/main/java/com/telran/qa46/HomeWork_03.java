package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork_03 {
    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test
    public void findElemetByXpath() {

        driver.findElement(By.xpath("head"));
        driver.findElement(By.xpath("strong"));

        driver.findElement(By.xpath(".head-logo"));
        driver.findElement(By.xpath(".cart-label"));

        driver.findElement(By.xpath("[href='/Content/jquery-ui-themes/smoothness/jquery"));
        driver.findElement(By.xpath("[href*='Content']"));
        driver.findElement(By.xpath("[href^='/Plugins']"));
        driver.findElement(By.xpath("[href$='cart'"));

    }
public void tearDown(){
        driver.close();
}
}

