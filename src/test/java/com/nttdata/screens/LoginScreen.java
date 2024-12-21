package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement lblErrorMessage;

    public void enterUser(String user){
        txtUsername.sendKeys(user);
    }

    public void enterPassword(String password){

        txtPassword.sendKeys(password);
    }

    public void clickLogin(){

        btnLogin.click();
    }

    public String getErrorMessage(){
        waitFor(ExpectedConditions.visibilityOf(lblErrorMessage));
        return lblErrorMessage.getText();
    }


}
