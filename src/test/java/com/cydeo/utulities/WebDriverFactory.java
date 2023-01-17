package com.cydeo.utulities;


//TASK: NEW METHOD CREATION
//Method name: getDriver
//Static method(static belongs to the class. if class have static method then we dont have to create an object of this class
//Accepts String arg: browserType
//  -This arg will determine what type of browser is opened
//  -if "chrome" passed --> it will open Chrome browser
//  -if "Firefox" passed --> it will open firefox browser
//RETURN TYPE: "WebDriver

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }


    }

}