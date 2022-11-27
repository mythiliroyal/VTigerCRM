package com.qa.crm.testcases;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase
{
    LoginPage loginPage;
    //HomePage homePage;
    public LoginPageTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp()
    {
        initializer();
        loginPage =new LoginPage();
    }
   // @Test(priority = 1)
  //  public void loginPageTitleTest()
    //{
      // String title= loginPage.validateLoginPageTitle();
       // Assert.assertEquals(title,"Login - Vtiger");
        // https://crmaccess.vtiger.com/log-in/
        //Login - Vtiger
  //  }
@Test
public void senKeysTest()
{
    loginPage.enterValue("Iphone X");
}
@Test
 public void SearchboxTest()
 {
     loginPage.searchBox();
 }

  /*  @Test(priority = 1)
    public void loginTest()
    {
        homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }
*/
    @AfterMethod()
    public void tearDown()
    {
        driver.quit();

    }



}
