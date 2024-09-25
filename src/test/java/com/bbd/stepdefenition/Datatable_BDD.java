package com.bbd.stepdefenition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatable_BDD extends BaseClass {
	
	@When("user click the fname and enter the value in firstname")
	public void user_click_the_fname_and_enter_the_value_in_firstname(io.cucumber.datatable.DataTable dataTable) 
	{   
		// List<String> asList = dataTable.asList();               single colum without header 
		//reg.firstname(asList.get(0));
		
		Map<String,String>asMap = dataTable.asMap(String.class, String.class);
		reg.firstname(asMap.get("Firstname"));
	}

	@Then("user enter the value in last name and email")
	public void user_enter_the_value_in_last_name_and_email(io.cucumber.datatable.DataTable dataTable) 
	{
		// List<String> asList = dataTable.asList();
		// reg.lastname(asList.get(0));
		// reg.emaill(asList.get(0));
		
		List<Map<String,String>>asMaps = dataTable.asMaps(String.class, String.class);
		reg.lastname(asMaps.get(0).get("lname"));
		reg.emaill(asMaps.get(0).get("email"));
	}



}
