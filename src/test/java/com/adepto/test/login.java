package com.adepto.test;
import com.adepto.webpages.loginpage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import junit.framework.TestCase;


import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


public class login {
    protected static WebDriver driver = new ChromeDriver();
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer VerificationErrors= new StringBuffer();
    boolean present;


      @Before

      public void setUp() throws Exception{
        baseUrl= "https://sandbox.adep.to/adepto/#/portal";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       }
 @Test
    public void login() throws Exception {
     driver.get(baseUrl);
     loginpage loginpage = new loginpage();
     loginpage.loinpage(driver);
     driver.manage().window().maximize();
     System.out.println("Successful Login");
     if(driver.findElement( By.className("md-subhead ng-binding")).equals ( "0434343434" ))
     {
         System.out.println ( "Phone nUmber 0434343434 - Exists" );
     }
     else
     {
         System.out.println ( "not present" );
     }

     driver.findElement ( By.className ( "_md-nav-button-text ng-scope" )).click ();
     //if (isP(driver.findElement ( By.className ( "md-headline ng-binding flex" ) )

 }


    }





