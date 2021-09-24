package com.searchmodule.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "search_form_input_homepage")
    private WebElement searchTxt;

    @FindBy(id = "search_button_homepage")
    private WebElement searchbtn;

    @FindBy(className = "no-results__title")
    private WebElement result;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        this.driver.get("https://duckduckgo.com/");
    }

    public void search(){
        this.wait.until(ExpectedConditions.visibilityOf(this.searchTxt));
        this.searchTxt.sendKeys("aldfhkxl;lahsadlahdf");
        this.searchbtn.click();
    }

    public boolean verification(){
        boolean resultstatus=this.result.isDisplayed();
        return resultstatus;
    }

}
