package com.bbd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bbd.stepdefenition.BaseClass;

public class Common extends BaseClass{
	
	
		public static void enter (By locator,String value)
		
		{
			 WebElement lastname = driver.findElement(locator);
			 lastname.click();
			 lastname.clear();
			 lastname.sendKeys(value);
		}
		
		public static void pagetitle (String expectedtitle)
		{
		    String actualtitle = driver.getTitle();
			   
			   if(actualtitle.equalsIgnoreCase(expectedtitle))
			   {
				   System.out.print("Landed in expected title page");
			   }
			   else 
			   {
				   System.out.print("Not Landed in expected title page");
			   }
			
		}
	

}
