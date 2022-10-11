package TestbaseAndtestclass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import POMclass.loginPOMclass;

public class __testbaseclassBeforeAndAfter 
{
WebDriver driver;	
@BeforeMethod	
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
     driver =new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("browser is maximised");
	
	driver.get("https://www.saucedemo.com/");
	loginPOMclass x=new loginPOMclass(driver);
	x.username();
	x.password();
	x.clickloginbutton();
}
@AfterMethod
public void tearDown()
{
	driver.quit();
	System.out.println("browse is closed");
	System.out.println("endof program");
}
}
