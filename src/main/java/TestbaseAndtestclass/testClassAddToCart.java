package TestbaseAndtestclass;

import org.testng.annotations.Test;

import POMclass.p1addtocartPOMclass;

public class testClassAddToCart extends TestBaseClass
{
	 @Test
	 public void validation() throws InterruptedException
	 {
	 p1addtocartPOMclass b=new p1addtocartPOMclass(driver);
	 b.product();
	 Thread.sleep(3000);
	 System.out.println("product is selected");
	 
	 b.cart();
	 Thread.sleep(3000);
	 System.out.println("product is added to the cart");
	 
//	 b.remove();
//	 Thread.sleep(3000);
//	 System.out.println("product is removed from the cart");
	 
	 b.checkout();
	 Thread.sleep(3000);
	 System.out.println("product is ready for checkout");
	 
	 b.firstname();
	 Thread.sleep(3000);
	 System.out.println("firstname is entered");
	 
	 b.lastname();
	 Thread.sleep(3000);
	 System.out.println("lastname is entered");
	 
	 b.zipcode();
	 Thread.sleep(3000);
	 System.out.println("zipcode is entered");
	 
	 b.contineu();
	 Thread.sleep(3000);
	 System.out.println("contineu");
	 
	 b.finish();
	 Thread.sleep(3000);
	 System.out.println("finish succesfully");
	 
	 b.backtohome();
	 Thread.sleep(3000);
	 System.out.println("bck to home ");
	 
			String expectedurl="https://www.saucedemo.com/checkout-complete.html";
			String actualurl=driver.getCurrentUrl();
	       if(expectedurl.equals(actualurl))
	       {
	    	   System.out.println("tc is pased");
	       }
	       else
	       {
	    	   System.out.println("TC IS FAILED");
	       }
	   }
   }
