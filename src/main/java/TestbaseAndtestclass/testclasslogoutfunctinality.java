package TestbaseAndtestclass;

import org.testng.annotations.Test;

import POMclass.POMmodelclass;
import POMclass.homePOMclass2;
import POMclass.loginPOMclass;

public class testclasslogoutfunctinality extends TestBaseClass
{
	@Test
	public void validation()
	{
		
	
	homePOMclass2 y=new homePOMclass2(driver);
	y.menubutton();
//	y.dropdown();
	y.logoutbutton();
	
	String expectedresult="https://www.saucedemo.com/";
	String Actualresult=driver.getTitle();
	if(expectedresult.equals(Actualresult))
	{
		System.out.println("logout functionality tc is passes");
	}
	else
	{
		System.out.println("tc is failed");
	}
	       
}
}

