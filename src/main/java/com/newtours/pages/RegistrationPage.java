package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "firstName")
    private WebElement firstNametxt;

    @FindBy(name = "lastName")
    private WebElement lastNametxt;

    @FindBy(name = "phone")
    private WebElement phonetxt;

    @FindBy(id = "userName")
    private WebElement userNametxt;

    @FindBy(name = "address1")
    private WebElement address1txt;

    @FindBy(name = "city")
    private WebElement citytxt;

    @FindBy(name = "state")
    private WebElement statetxt;

    @FindBy(name = "postalCode")
    private WebElement postalCodetxt;

    @FindBy(name = "country")
    private WebElement countrytxt;

    @FindBy(name = "email")
    private WebElement emailtxt;

    @FindBy(name = "password")
    private WebElement passwordtxt;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordtxt;

    @FindBy(name = "register")
    private WebElement registerbtn;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver,this);
    }

    public void contactInfo(String firstName, String lastName, String phone, String email){
        this.firstNametxt.sendKeys(firstName);
        this.lastNametxt.sendKeys(lastName);
        this.phonetxt.sendKeys(phone);
        this.userNametxt.sendKeys(email);
    }

    public void mailinginformation(String address, String city, String state, String postal, String country){
        this.address1txt.sendKeys(address);
        this.citytxt.sendKeys(city);
        this.statetxt.sendKeys(state);
        this.postalCodetxt.sendKeys(postal);
        Select select = new Select(countrytxt);
        select.selectByValue(country);
    }

    public void userinformation(String username, String pwd, String confirmpwd){
        this.emailtxt.sendKeys(username);
        this.passwordtxt.sendKeys(pwd);
        this.confirmPasswordtxt.sendKeys(confirmpwd);
    }

    public void submit(){
        this.registerbtn.click();
    }




}
