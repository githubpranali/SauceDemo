package TestbaseAndtestclass;

import java.io.IOException;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucedemo.utilityclases.screenshotClass;

import POMclass.POMmodelclass;
import POMclass.loginPOMclass;

public class TestBaseClass 
{
	public WebDriver driver;
	Logger log=Logger.getLogger("Sauc");
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
    		if(browserName.equals("chrome"))
    		{
    			System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
    		    driver= new ChromeDriver();
    		}
    		else
    		{
    			System.setProperty("webdriver.chrome.driver","./driver\\geckodriver.exe");
    		    driver= new FirefoxDriver();
    		}
    		PropertyConfigurator.configure("log4j.properties");
            log.info("browser is open");
		
		
		driver.manage().window().maximize();
		log.info("bowser is maximised");
		
		driver.get("https://www.saucedemo.com/");
		screenshotClass.takeScreenshot(driver,"screenshot");
		
		loginPOMclass x= new loginPOMclass(driver);
		x.username();
		log.info("username is entered");
		x.password();
		log.info("password is entered");
		x.clickloginbutton();
		log.info("clicked on login button");
		screenshotClass.takeScreenshot(driver,"screenshot");
	}
      
      @AfterMethod
      public void tearDown()
         {
    	  driver.quit();
  		  System.out.println("browser is closed");
  	      System.out.println("end of program");
         }
		
    }

