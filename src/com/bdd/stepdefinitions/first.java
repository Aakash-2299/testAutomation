package com.bdd.stepdefinitions;

import java.io.File;
import java.text.SimpleDateFormat;

import io.cucumber.java.en.When;

public class first {

	
	@When("^print welcome \"(.*)\"$")
	public void print(String a) {
		System.out.println(a+"\n"+"welcome to the BDD world" +"\n"+ "Welcome to the BDD world");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		File f = new File("D:/Appium_workspace/BDDFramework/sample"+timeStamp);
		f.mkdir();
		//============
//		int x=400;
//		int y=x;
//		--x;
//		System.out.println(x);
//		x++;
//		System.out.println(x==y);
////		System.out.println(x.equals());
				
	}
}
