package com.bbd.stepdefenition;

import org.openqa.selenium.WebDriver;

import com.bbd.pages.RegisterPage;
import com.bbd.utility.Common;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Common com = new Common();
    
	public static RegisterPage reg = new RegisterPage();


}
