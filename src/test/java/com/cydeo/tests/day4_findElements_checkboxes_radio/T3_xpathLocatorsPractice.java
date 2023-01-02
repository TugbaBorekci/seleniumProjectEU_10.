package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_xpathLocatorsPractice {

    public static void main(String[] args) {

        //XPATH Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1
        WebElement clickButton = driver.findElement(By.xpath("//*[@onclick='button1()']"));

        //4. Verify text displayed is as expected:
        System.out.println("clickButton.isDisplayed() = " + clickButton.isDisplayed());


        //Expected: “Clicked on button one!”
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
