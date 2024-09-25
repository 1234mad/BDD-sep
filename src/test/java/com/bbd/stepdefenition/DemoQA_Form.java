package com.bbd.stepdefenition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_Form extends BaseClass {
	
	@Given("launch chrome browser")
	public void launchBrowser() 
	{
			
		WebDriverManager.chromedriver().setup();
					
		driver = new ChromeDriver();
				
		driver.manage().window().maximize();
	}

	@Given("open the url {string}")
	public void openurl(String url)
	{
		driver.get(url);
	    
	}

	@Then("user validate the registration form title")
	public void user_validate_the_registration_form_title() 
	{
	   com.pagetitle("Register");
	}

	@When("user click the first name and enter the value {string}")
	public void user_click_the_first_name_and_enter_the_value(String fname)
	{
	   reg.firstname(fname);
	}

	@Then("user click the last name and enter the value {string}")
	public void user_click_the_last_name_and_enter_the_value(String lname) 
	{
	reg.lastname(lname);
	}

	@Then("user enter the email {string}")
	public void user_enter_the_email(String mail) 
	{
		 reg.emaill(mail);
	    
	}
	
	@Then("close the browser")
	public void close_the_browser() 
	{
	   driver.quit();

	}
}
