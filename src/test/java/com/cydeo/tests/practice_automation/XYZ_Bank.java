package com.cydeo.tests.practice_automation;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class XYZ_Bank {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test
    public void bank_manager_login() throws InterruptedException {

        Thread BrowserUtils = null;
        BrowserUtils.sleep(1);
        WebElement bankManagerButton = driver.findElement(xpath("//button[@ng-click='manager()']"));
        bankManagerButton.click();

        BrowserUtils.sleep(1);
        WebElement addCustomerButton = driver.findElement(xpath("//button[@ng-class='btnClass1']"));
        addCustomerButton.click();

        BrowserUtils.sleep(1);
        WebElement firstName = driver.findElement(xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Tugba");

        BrowserUtils.sleep(1);
        WebElement lastName = driver.findElement(xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Borekci");

        BrowserUtils.sleep(1);
        WebElement postCode = driver.findElement(xpath("//input[@placeholder='Post Code']"));
        postCode.sendKeys("BB2 3HW");

        BrowserUtils.sleep(1);
        WebElement addCustomer = driver.findElement(xpath("//button[@type='submit']"));
        addCustomer.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();

    }


    @Test
    public void openAccount() throws InterruptedException {

        Thread BrowserUtils = null;
        BrowserUtils.sleep(1);
        WebElement bankManagerButton = driver.findElement(xpath("//button[@ng-click='manager()']"));
        bankManagerButton.click();

        WebElement open_account = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
        open_account.click();

        Select customerName = new Select(driver.findElement(By.id("userSelect")));
        customerName.selectByVisibleText("Hermoine Granger");

        Select currency = new Select(driver.findElement(By.id("currency")));
        currency.selectByVisibleText("Pound");

        WebElement processButton = driver.findElement(By.xpath("//button[@type='submit']"));
        processButton.click();

        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();

    }


}
