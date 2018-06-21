package com.testing;

import org.testng.annotations.Test;

import pagefactory.PageFactoryLogin;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GCRShop {
	String baseUrl;
	WebDriver driver;
	PageFactoryLogin pge;
	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rozin\\eclipse-workspace\\Project\\Selenium_Automation1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl= "http://www.gcrit.com/build3/login.php";
		driver.get(baseUrl);
	}

	@Test
	public void test1() throws Exception{
		
		pge = new PageFactoryLogin(driver);
		
		//driver.findElement(By.id("tdb3")).click();
		pge.getMyAccountbtn().click();
		pge.getUsername().sendKeys("sarowerny@gmail.com");
		pge.getPassword().sendKeys("student");
		pge.getSignInBtn().click();
		Thread.sleep(5000);
		pge.getCatalog().click();
		pge.getProducts().click();
		pge.getPage1().click();
		//pge.getFirstPage().getText();
		
	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(5000);
		//driver.quit();
	}

}
