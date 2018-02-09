package com.adepto.webpages;
import com.adepto.objects.loginobjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class loginpage {
    public void loinpage( WebDriver Driver)
    {
       Driver.findElement(loginobjects.USER_NAME).clear();
       Driver.findElement(loginobjects.USER_NAME).sendKeys("testchallenge@maildrop.cc");;
       Driver.findElement(loginobjects.PASS_WORD).clear();
       Driver.findElement(loginobjects.PASS_WORD).sendKeys("TestChallenge1");
       Driver.findElement(loginobjects.LOGIN).click();
    }

}

