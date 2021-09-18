package com.monaygaming.tests;

import com.monaygaming.utilities.web;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    //we must declared insatnace variable object for webdriver=driver
    WebDriver driver;

    @BeforeMethod

    public void setup(){
        driver= web.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }





    @Test
    public void test1() throws InterruptedException {
        WebElement nameBox=driver.findElement(By.cssSelector("#forname"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox=driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();

    }
}
