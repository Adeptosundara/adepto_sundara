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

public class adepto_login {
    WebDriver driver = new ChromeDriver ();
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer VerificationErrors = new StringBuffer ();
    boolean present;


    @Before

    public void setUp() throws Exception {
        baseUrl = "https://sandbox.adep.to/adepto/#/portal";
        driver.manage ().timeouts ().implicitlyWait ( 30, TimeUnit.SECONDS );
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
        driver.findElement ( By.className ( "ng-binding ng-scope" ) ).click ();
        driver.findElement ( By.className ( "ng-binding ng-scope" ) ).sendKeys ( "specialising”" );
        Boolean assertTrue = driver.findElements ( By.className ( "ng-binding ng-scope" ).contains ( "“Luke Skywalker" ) );

        if (assertTrue == true) {
            System.out.print ( "Yes" );
        } else {
            System.out.print ( "No" );
        }
    }
}


