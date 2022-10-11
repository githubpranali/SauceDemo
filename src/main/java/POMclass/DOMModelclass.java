package POMclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DOMModelclass 
{
public static void main(String[] args) throws IOException
{
System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
System.out.println("browser is open");

driver.get("https://www.saucedemo.com/");
System.out.println("url is open");

WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
username.sendKeys("standard_user");

WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("secret_sauce");

WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
login.click();

TakesScreenshot ts= (TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\screenshot\\saucdemohome.jpg");
FileHandler.copy(source, dest);

String actualutitle=driver.getTitle();
String expectedTitle=("Swag Labs");
if(actualutitle.equals(expectedTitle))
{
	System.out.println("login functionality tc is paased");
}
else
{
	System.out.println("login functionality tc is failed");
	
}
System.out.println("end of program");
driver.close();
}
}
