package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork {
    WebDriver driver;

    @BeforeMethod

public void setUp(){
driver = new ChromeDriver();
   //driver.get("https://www.youtube.com/");

   driver.manage().window().maximize();


    driver .navigate().to("https://www.youtube.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver .navigate().to("https://www.btl.gov.il/Pages/default.aspx");
    driver .navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    }
    @Test
    public void  openYoutube(){
        System.out.println("Youtubeopened");
}
@AfterMethod(enabled = false)
public void TernDown(){
        //driver .quit();
         driver.close();
}

}
