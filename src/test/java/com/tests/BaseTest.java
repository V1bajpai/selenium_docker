package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;


public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        String host = "localhost";
        ChromeOptions options = new ChromeOptions();
        this.driver = new ChromeDriver(options);

        if(System.getProperty("Browser")!=null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            FirefoxOptions options1 = new FirefoxOptions();
            this.driver = new FirefoxDriver(options1);
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }


        try {
            String completeUrl= "http://" + host + ":4444/wd/hub";
            this.driver = new RemoteWebDriver(new URL(completeUrl), this.driver);
        }
        catch (Exception e){
            System.out.println("kd");
        }

    }

    @AfterTest
    public void quitdriver(){
        this.driver.quit();
    }
}
