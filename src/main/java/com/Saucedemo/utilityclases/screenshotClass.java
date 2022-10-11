package com.Saucedemo.utilityclases;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class screenshotClass
{
	public static void takeScreenshot(WebDriver driver,String Filename) throws IOException
	{
      Date d=new Date();
      DateFormat d1= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
      String date=d1.format(d);

      TakesScreenshot ts= (TakesScreenshot)driver;
      File source=ts.getScreenshotAs(OutputType.FILE);
      File dest= new File("D:\\screenshot\\"+Filename+date+".jpg");
      FileHandler.copy(source, dest);
    }

}

	
