package com.cydeo.tests.day6_alerts_iframes_windows.Tasks;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Confirmation_Alert_Practice {

    WebDriver driver;

    //TC #2: Confirmation alert practice
    //1. Open browser
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alert() {
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Confirm” button
        WebElement clickJSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickJSConfirm.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement resultTest = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedTest = "You clicked: Ok";
        String actualTest = resultTest.getText();

        //5. Verify “You clicked: Ok” text is displayed.
        Assert.assertEquals(actualTest, expectedTest);

        //Assert.assertEquals("You clicked: Ok", resultTest.getText()); yada bu sekilde yazabiliriz


    }

    @Test
    public void promptAlertTest() {

        //TC #3: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement clickJSPropt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));

        //3. Click to “Click for JS Prompt” button
        clickJSPropt.click();

        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();

        WebElement text = driver.findElement(By.xpath("//p[.='You entered: hello']"));
        String expectedText = "You entered: hello";
        String actualText = text.getText();
        Assert.assertEquals(actualText, expectedText);
        //6. Verify “You entered: hello” text is displayed.



    }
}