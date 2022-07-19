package com.contentsquare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "username")
    private WebElement usernameField;

    @FindBy (name = "password")
    private WebElement passwordField;

    @FindBy (id = "loginBtn")
    private WebElement submitButton;

    @FindBy(id = "error_text")
    private WebElement errorText;

    public void setUsernameField(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton(){
       submitButton.click();
    }

    public String getErrorText(){
        String errorTextFromForm = errorText.getText();
        return errorTextFromForm;
    }


}
