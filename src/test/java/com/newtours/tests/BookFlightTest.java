package com.newtours.tests;

import com.newtours.pages.RegistrationConfirmationPage;
import com.newtours.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlightTest {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    @Test
    public void registrationPageTest(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.contactInfo("Neeraj", "Chopra", "9988998899", "neeraj@gmail.com");
        registrationPage.mailinginformation("Hariyana 118", "Chandigarh", "Hariyana", "208017", "INDIA");
        registrationPage.userinformation("Neeraj", "password123", "password123");
        registrationPage.submit();
    }

    @Test
    public void confirmationPageTest(){
        RegistrationConfirmationPage registrationConfirmationPage =new  RegistrationConfirmationPage(driver);
        registrationConfirmationPage.registrationverification();
    }
}
