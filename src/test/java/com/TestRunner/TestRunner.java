package com.TestRunner;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pojo.Pojo;
import com.report.Jvmreport;

public class TestRunner extends BaseClass { 
	
	
	@BeforeSuite
	private void lunchbrowser() {
		// TODO Auto-generated method stub
		getdriver();
	}
	
	@BeforeTest
	private void geturl() {
		// TODO Auto-generated method stub
		geturl("http://adactinhotelapp.com/");
	}
	
	@BeforeClass
	private void max() {
		// TODO Auto-generated method stub
		maxwin	();
	}
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		Pojo p = new Pojo();
		sendkey("dorababu5424", p.getUsername());
	}
	
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		Pojo p = new Pojo();
		sendkey("Dora@1997", p.getPassword());
	}
	
	@Test
	private void tc3() {
		// TODO Auto-generated method stub
		Pojo p = new Pojo();
		click(p.getLogin());
	}
	@AfterTest
	private void testcom() {
		// TODO Auto-generated method stub
		System.out.println("testcomplted");
	}	
	@AfterClass
	private void jvm() {
		// TODO Auto-generated method stub
		Jvmreport.generatejvmreport("C:\\Users\\DORABABU\\eclipse-workspace\\Testngpr\\src\\test\\resources\\Reports\\cucumber.json");
	}

	@AfterSuite
	private void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}
}
