package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePOMclass2 
{
private WebDriver driver;
private Select s;

@FindBy(xpath="//button[@id='react-burger-menu-btn']")
private WebElement menubutton;
public void menubutton()
{
	menubutton.click();
}

@FindBy(xpath="//select[@class='product_sort_container']")
private WebElement dropdown;
public String dropdown()
{
	dropdown.click();
	Select s= new Select(dropdown);
	s.selectByValue("lohi");
	String filtertext=dropdown.getText();
	return filtertext;
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")
private WebElement logoutbutton;
public void logoutbutton()
{
	logoutbutton.click();
}

public homePOMclass2( WebDriver driver)
{
   this.driver= driver;
   PageFactory.initElements(driver,this);
   s=new Select(dropdown);
   
   
}






}
