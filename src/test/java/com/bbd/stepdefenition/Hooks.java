package com.bbd.stepdefenition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass

{
	@Before(order=2)
	public void precondition()
	{
		System.out.println("precondition two");
	}
	
	@After(order=2)
	public void closebrowser()
	{
		driver.close();
	}
	
	@Before(order=1)
	public void precondition1()
	{
		System.out.println("precondition");
	}
	
	@After("@Test")
	public void postcondition()
	{
		System.out.println("postcondition");;
	}

}
