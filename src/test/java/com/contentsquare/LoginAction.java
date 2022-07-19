package com.contentsquare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/** @noinspection deprecation*/
public class LoginAction {
    LoginPage loginPage;

    public LoginAction(WebDriver driver){
       this.loginPage = new LoginPage(driver);
    }

    public void performLoginFlow(){
        loginPage.setUsernameField("test@test.com");
        loginPage.setPasswordField("ThisIs@T3st");
        loginPage.clickSubmitButton();
    }

    public String getErrorTextFlow(){
        return loginPage.getErrorText();
    }

}
