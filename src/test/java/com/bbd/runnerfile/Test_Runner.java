package com.bbd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\madhu\\eclipse-workspace\\BDD_Framework\\src\\test\\java\\com\\bbd\\feature",
glue="com.bbd.stepdefenition",tags= {"@reg","@sanity"},monochrome=true )
public class Test_Runner
{
   
}
