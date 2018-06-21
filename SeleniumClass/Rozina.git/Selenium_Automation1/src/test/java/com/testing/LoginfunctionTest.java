/*package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginfunctionTest {
	public WebDriver login(WebDriver driver)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rozin\\eclipse-workspace\\Project\\Selenium_Automation\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.gcrit.com/build3/");
		WebElement myaccountbtn= driver.findElement(By.xpath("(//*[@class='ui-button-text'])[3]"));
		
		//JavascriptExecutor obj= (JavascriptExecutor) driver;
		//obj.executeScript("argument[0].style.border='3px solid green'",myaccountbtn );
		myaccountbtn.click();
		Thread.sleep(3000);
		
		//WebElement LoginpageTitle = 
		WebElement email= driver.findElement(By.xpath("//*[@name='email_address']"));
		email.sendKeys("sarowerny@gmail.com");
		WebElement password= driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("student");
		WebElement loginbtn= driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
		loginbtn.click();
	}
	//validation
	//Assert.assertEquals("GCR Shop", driver.getTitle(), "Test Passed");
	//verification
	//if (driver.getTitle().equalsIgnoreCase("GCR Shop")) {
		//System.out.println("Test Passed>>>Page Title::" + driver.getTitle());
		
	
	//else {
		//System.out.println("Test Failed");
	}


*/