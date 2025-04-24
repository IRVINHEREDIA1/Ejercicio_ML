package com.magento.factory;

import com.magento.utils.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory extends Base {

    @FindBy (how= How.NAME, using = "login[username]")
    protected WebElement username;

    @FindBy (name="login[password]")
    protected WebElement password;

    @FindBy (id="send2")
    @CacheLookup
    protected WebElement btnLogin;


    public LoginFactory(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void doLoginWithPageFactory(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
    }

    public void clickLoginPF(){
        btnLogin.submit();
    }

}
