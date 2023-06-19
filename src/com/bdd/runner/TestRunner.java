package com.bdd.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
				,dryRun=false
				,monochrome=true
//				,tags= {}
				,features={"./BDDFeatures"}
				,glue={"com.bdd.stepdefinitions"}
				)
public class TestRunner {

	
	
}
