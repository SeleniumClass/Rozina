package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginfunctionTest {
	
	
	public static void main(String[]args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rozin\\eclipse-workspace\\Project\\Selenium_Automation\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/");
	driver.manage().window().maximize();
	
	
	}

}
