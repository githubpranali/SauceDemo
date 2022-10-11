package POMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class p2_POMaftercheckout 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
//	WebElement allproduct;
//	-----------------------------------------
	//select multiple itemsfrom saucedemo
	List<WebElement>allproduct;
	public void cart()
	{
		for(WebElement i: allproduct)
		{
			i.click();
		}
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	public void firstname()
	{
		firstname.sendKeys("pranali");
	}

	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	public void lastname()
	{
		lastname.sendKeys("Gore");
	}

	@FindBy(xpath="//input[@id='postal-code']")
	WebElement zipcode;
	public void zipcode()
	{
		zipcode.sendKeys("441804");
	}

	@FindBy(xpath="//input[@id='continue']")
	WebElement contineu;
	public void contineu()
	{
		contineu.click();
	}

	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	public void finish()
	{
		finish.click();
	}

	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backtohome;
	public void backtohome()
	{
		backtohome.click();
	}
	
	public p2_POMaftercheckout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
