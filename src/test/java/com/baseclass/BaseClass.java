package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	
	public static void geturl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	public static void sendkey(String data, WebElement e1) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	
	public static void click(WebElement e2) {
		// TODO Auto-generated method stub
		e2.click();
	}
	public static void excelread() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
}
