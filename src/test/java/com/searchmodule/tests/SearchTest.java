package com.searchmodule.tests;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test(priority = 1)
    public void searchboxTest(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goTo();
        searchPage.search();
    }

    @Test(priority = 2)
    public void verificationTest(){
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertFalse(searchPage.verification(),"Not found");
    }
}
