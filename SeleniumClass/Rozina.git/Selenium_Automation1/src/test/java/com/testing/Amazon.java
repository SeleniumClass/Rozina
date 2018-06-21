package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rozin\\eclipse-workspace\\Project\\Selenium_Automation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	WebElement Departments = driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]"));
	Departments.click();
	WebElement urrecomend = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
	urrecomend.click();
	WebElement todaysdeal = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
	todaysdeal.click();
	WebElement giftcards = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
	giftcards.click();
	WebElement registry = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
	registry.click();
	WebElement sell = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
	sell.click();
	WebElement acclis = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	acclis.click();
	WebElement orders = driver.findElement(By.xpath("//*[@id=\"nav-orders\"]"));
	orders.click();
	WebElement tryprime = driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]"));
	tryprime.click();
	WebElement cart = driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
	cart.click();
}
	
	
	
	
	

}
