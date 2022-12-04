package com.qa.crm.testcases;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase
        {
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp()
    {
        initializer();

        loginPage =new LoginPage();

       // Thread.sleep(6000);
        //WebDriverWait wait = new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img")));

    }
   @Test(priority = 1)
   public void loginPageTitleTest()
    {
      // String title= loginPage.validateLoginPageTitle();
      // Assert.assertEquals(title,"Login - Vtiger");


      homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));

   }


 //Amazon code start
/*@Test
public void senKeysTest()
{
    loginPage.enterValue("Iphone X");
    loginPage.searchBox();
}*/
//Amazon code end


  /* @Test(priority = 2)
    public void loginTest()
    {
        homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }*/

   /* @AfterMethod()
    public void tearDown()
    {
        driver.quit();

    }*/


}
