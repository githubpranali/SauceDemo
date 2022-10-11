package TESTclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POMclass.POMalertclassdemoqa;
import TestbaseAndtestclass.testbaseclass_alert;

public class tc_05alertclass extends testbaseclass_alert
{
@Test	
public void alerttestclass () throws InterruptedException 
{
	POMalertclassdemoqa x= new POMalertclassdemoqa(driver);
	x.clickme();
	Alert alt=driver.switchTo().alert();
	alt.accept();
	Thread.sleep(5000);
	
	x.clickme2();
	Thread.sleep(8000);
	Alert alt1=driver.switchTo().alert();
	alt.accept();
	
	
	x.clickme3();
	Alert alt2=driver.switchTo().alert();
	alt.dismiss();
	Thread.sleep(5000);
	
	
	x.clickme4();
	Alert alt3=driver.switchTo().alert();
	alt.sendKeys("pranali");
	Thread.sleep(5000);
}
}
