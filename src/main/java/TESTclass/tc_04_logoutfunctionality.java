
package TESTclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMclass.homePOMclass2;
import POMclass.loginPOMclass;
import TestbaseAndtestclass.TestBaseClass;
import TestbaseAndtestclass.testclasslogoutfunctinality;

public class tc_04_logoutfunctionality extends TestBaseClass
{
@Test

public void validation()
{
	homePOMclass2 x= new homePOMclass2(driver);
	x.menubutton();
	x.logoutbutton();
	
	 String expectedresult="Swag Labs";
	String Actualresult=driver.getTitle();
	Assert.assertEquals(expectedresult, Actualresult);
	       
}

}
