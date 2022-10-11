package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class p1addtocartPOMclass
{
WebDriver driver;

@FindBy(xpath="(//div[@class='inventory_item_name'])[3]")
WebElement product;
public void product()
{
	product.click();
}

@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cart;
public void cart()
{
	cart.click();
}

@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")
WebElement remove;
public void remove()
{
	remove.click();
}

@FindBy(xpath="//button[@id='checkout']")
WebElement checkout;
public void checkout()
{
	checkout.click();
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

public p1addtocartPOMclass(WebDriver driver)
{
    this.driver=driver;
	PageFactory.initElements(driver,this);
}


}
