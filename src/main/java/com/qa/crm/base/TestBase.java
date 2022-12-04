package com.qa.crm.base;
import com.qa.crm.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.io.*;
//import com.sun.deploy.panel.SecurityProperties.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {
  public static WebDriver driver;

  public static Properties prop;

    public TestBase() {
        try {
            prop= new Properties();
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
                    "/src/main/java/com/qa/crm/config/config.properties");
            prop.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void initializer()
    {
      String browsername=  prop.getProperty("browser");
      if(browsername.equalsIgnoreCase("chrome"))
      {
          WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
      }
      else if (browsername.equalsIgnoreCase("firefox"))
      {
          WebDriverManager.chromiumdriver().setup();
           driver=new FirefoxDriver();
      }
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_Load_Timeout,TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
      driver.get(prop.getProperty("url"));






    }
}
