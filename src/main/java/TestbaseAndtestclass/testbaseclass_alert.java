package TestbaseAndtestclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testbaseclass_alert 
{
public WebDriver driver;	

@BeforeMethod	
public void setUp()
{
System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
driver= new ChromeDriver();

System.out.println("browser isopen");

driver.manage().window().maximize();



driver.get("https://demoqa.com/alerts");
System.out.println("url is open");
}
@AfterMethod
public void tearDown()
{
driver.quit();
System.out.println("browser is close");
System.out.println("ed of program");
}
}
