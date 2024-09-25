package com.bbd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bbd.stepdefenition.BaseClass;

public class RegisterPage extends BaseClass {
	
	public static By firname = By.xpath("//input[@ng-model='FirstName']");
	public static By lasname = By.xpath("//input[@ng-model='LastName']");
	public static By ema     = By.xpath("//input[@ng-model='EmailAdress']");
	
	public void firstname(String fname)
	{     
		com.enter(firname , fname);
	} 
	
	
	public void lastname (String lname)
	{    
		com.enter(lasname, lname);
	}
	
	
	public void emaill(String mail)
	{    
		com.enter(ema, mail);
	}

}
