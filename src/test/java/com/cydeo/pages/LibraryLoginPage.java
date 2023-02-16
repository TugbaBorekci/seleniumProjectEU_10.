package com.cydeo.pages;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#- initialize the driver instance and object of thr class
    public LibraryLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
}
