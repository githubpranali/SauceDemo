package POMclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMalertclassdemoqa 
{

private WebDriver driver;

@FindBy(xpath="//button[@id='alertButton']")
WebElement clickme;
public void clickme()
{
	clickme.click();
}
//------------------------------------------------
@FindBy(xpath="//button[@id='timerAlertButton']")
WebElement clickme2;
public void clickme2()
{
	clickme2.click();
}
//-----------------------------------------------
@FindBy(xpath="//button[@id='confirmButton']")
WebElement clickme3;
public void clickme3()
{
	clickme3.click();
}
//------------------------------------------
@FindBy(xpath="//button[@id='promtButton']")
WebElement clickme4;
public void clickme4()
{
	clickme4.click();
}
//---------------------------------------------
public POMalertclassdemoqa(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
