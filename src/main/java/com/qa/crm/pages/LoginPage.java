package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import com.qa.crm.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends TestBase
{
//PageFatory
    //Declaring page objects using pageFactory
    //Amazon Code
   /*
   @FindBy(id="twotabsearchtextbox")
   WebElement textbox;
   @FindBy(xpath="//*[@id='nav-search-submit-button']")
   WebElement searchicon;
   ////div[@class='nav-search-submit nav-sprite']
    // //span[@id='nav-search-submit-text']//input
    */
    //Vtiger CRM code

    @FindBy(name="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    WebElement loginbutton;


    //Intializing page objects

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    //Actions

    public String validateLoginPageTitle()
    {
        return driver.getTitle();
    }
    public HomePage login(String un,String pwd)
    {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginbutton.click();
        return new HomePage();
    }

//Amazon Code actions
    /*public void enterValue(String val)
    {
        textbox.sendKeys(val);
    }
    public void searchBox()
    {
        searchicon.click();
    }*/

}
