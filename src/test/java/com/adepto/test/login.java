package com.adepto.test;
import com.adepto.webpages.loginpage;
import org.apache.bcel.generic.Select;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;


import java.util.concurrent.TimeUnit;


import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


public class login {

    WebDriver driver = new ChromeDriver();
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
 // To login to the portal
    public void login() throws Exception {
     driver.get ( baseUrl );
     loginpage loginpage = new loginpage ();
     loginpage.loinpage ( driver );
     driver.manage ().window ().maximize ();
     System.out.println ( "Successful Login" );
     // Check for the Phone Number existance
     if (driver.findElement ( By.className ( "md-subhead ng-binding" ) ).equals ( "0434343434" )) {
         System.out.println ( "Phone nUmber 0434343434 - Exists" );
     } else {
         System.out.println ( "not present" );
     }

     driver.findElement ( By.className ( "_md-nav-button-text ng-scope" ) ).click ();
     if (driver.findElement ( By.className ( "md-headline ng-binding flex" ) ).equals ( "Ms Paint" )) {
         System.out.println ( "Mspaint Software present" );
     } else {
         System.out.println ( "not present" );
     }
     driver.findElement ( By.className ( "md-headline ng-binding flex" ) ).click ();
     if (driver.findElement ( By.className ( "md-headline ng-binding flex" ) ).equals ( "“Mop and Bucket”" )) {
         System.out.println ( "“Mop and Bucket”t" );
     } else
         System.out.println ( "not present" );
 }
}







