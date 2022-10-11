package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOMclass
{
private WebDriver driver;
//Actions act;

@FindBy(xpath="//input[@id='user-name']")
private WebElement username;
public void username()
{
	username.sendKeys("standard_user");
}

@FindBy(xpath="//input[@id='password']")
private WebElement password;
public void password()
{
	password.sendKeys("secret_sauce");
}

@FindBy(xpath="//input[@id='login-button']")
private WebElement loginbutton;
public void clickloginbutton()
{
	loginbutton.click();
//	act.click().perform();
	
}

public loginPOMclass (WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
//	act= new Actions(driver);
}


}

