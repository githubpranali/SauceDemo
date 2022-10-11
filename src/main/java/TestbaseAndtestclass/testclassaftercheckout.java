package TestbaseAndtestclass;

import org.testng.annotations.Test;

import POMclass.p1addtocartPOMclass;

public class testclassaftercheckout extends TestBaseClass
{
	@Test
	 public void validation() throws InterruptedException
	 {
	p1addtocartPOMclass z=new p1addtocartPOMclass(driver);
	z.product(); //single product
	Thread.sleep(3000);
	System.out.println("product is selected");
	
	 z.cart();
	 Thread.sleep(3000);
	 System.out.println("product is added to the cart");
	 
//	 z.remove();
//	 Thread.sleep(3000);
//	 System.out.println("product is removed from the cart");
//	 
	 z.checkout();
	 Thread.sleep(3000);
	 System.out.println("product is ready for checkout");
	 
	 z.firstname();
	 Thread.sleep(3000);
	 System.out.println("firstname is entered");
	 
	 z.lastname();
	 Thread.sleep(3000);
	 System.out.println("lastname is entered");
	 
	 z.zipcode();
	 Thread.sleep(3000);
	 System.out.println("zipcode is entered");
	 
	 z.contineu();
	 Thread.sleep(3000);
	 System.out.println("contineu");
	 
	 z.finish();
	 Thread.sleep(3000);
	 System.out.println("finish succesfully");

	  z.backtohome();
	 Thread.sleep(3000);
	 System.out.println("bck to home ");

	 String expectedurl ="https://www.saucedemo.com/inventory.html";
    String actualurl=driver.getCurrentUrl();
if(expectedurl.equals(actualurl))
{
	System.out.println("tc is pass");
}
else
{
	System.out.println("tc is failed");
}
}
}
