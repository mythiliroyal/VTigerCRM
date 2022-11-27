package com.qa.crm.pages;

import com.qa.crm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase
{
//PageFatory
    //Declaring page objects using pageFactory
   @FindBy(id="twotabsearchtextbox")
   WebElement textbox;
   @FindBy(xpath="//*[@id='nav-search-submit-button']")
   WebElement searchicon;
   ////div[@class='nav-search-submit nav-sprite']
    // //span[@id='nav-search-submit-text']//input
   /*
    @FindBy(name="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    WebElement loginbutton;

    */
    //Intializing page objects

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    //Actions
/*
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
    */

    public void enterValue(String val)
    {
        textbox.sendKeys(val);
    }
    public void searchBox()
    {
        searchicon.click();
    }

}
