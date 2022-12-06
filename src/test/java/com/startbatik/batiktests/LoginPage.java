package com.startbatik.batiktests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "email")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement buttonLogin;

   

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String enterEmail(String email){
        inputEmail.sendKeys(email);
        return email;
    }
    public String enterPassword(String password){
        inputPassword.sendKeys(password);
        return password;
    }
    public void clickLoginbtn(){
        buttonLogin.click();
    }
}
