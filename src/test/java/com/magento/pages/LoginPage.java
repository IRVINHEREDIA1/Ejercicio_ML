package com.magento.pages;

import com.magento.utils.Base;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends Base {

    /*
    WebElements
    * */
    protected By inputuser = By.name("login[username]");
    protected By inputpass = By.name("login[password]");
    protected By bntlogin = By.id("send2");

    /*
    Constructor
    * */

    /*
    Methods / functions
    * */
    @Step("This step fill out credentials and submit")
    public  void fillLoginForm(String user, String pass){
        driver.findElement(inputuser).sendKeys(user);
        driver.findElement(inputpass).sendKeys(pass);
    }

    @Step
    public void clickOnLogin(){
        driver.findElement(bntlogin).submit();
    }
}

