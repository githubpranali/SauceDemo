package TESTclass;

import java.io.IOException;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Saucedemo.utilityclases.screenshotClass;


import POMclass.POMmodelclass;
import TestbaseAndtestclass.TestBaseClass;


public class tc_01_loginfuncrtionality2 extends TestBaseClass
{
	@Test
	public void validation()
	{
	String expectedurl="Swag Labs";
	String actualurl=driver.getTitle();

	Assert.assertEquals(expectedurl, actualurl);
}

	
}

