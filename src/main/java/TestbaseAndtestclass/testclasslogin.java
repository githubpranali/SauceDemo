package TestbaseAndtestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testclasslogin extends TestBaseClass
{
	@Test
	public void validation()
	{
	String expectedtitle="Swag Labs";
	String actualtitle=driver.getTitle();
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("tc of login is passed");
	}
	else
	{
		System.out.println("tc of loginis failed");
	}
}
}
