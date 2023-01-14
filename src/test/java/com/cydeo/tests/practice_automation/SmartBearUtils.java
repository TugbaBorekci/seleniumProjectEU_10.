package com.cydeo.tests.practice_automation;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SmartBearUtils {


    public static void logInSmartBear(WebDriver driver){
       //Mini-Task: CREATE A CLASS à SmartBearUtils
        //• Create a method called loginToSmartBear
        //• This method simply logs in to SmartBear when you call it.
        //• Accepts WebDriver type as parameter
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userInputBox.sendKeys("Tester");
        WebElement passInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passInputBox.sendKeys("test");
        WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logInButton.click();





    }

}
