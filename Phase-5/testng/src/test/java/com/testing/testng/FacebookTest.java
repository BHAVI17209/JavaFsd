package com.testing.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium standalone server jars\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver=null;
	}

	@Test(groups = "FB")
	public void launchFb() {
		driver.get("https://www.facebook.com/");
		//if u give wrong link here u can't run the login test case,as login completely depends on launchFb
	}
	@Test(groups = "FB", dependsOnMethods = {"launchFb"})
	public void login() {
		//driver.get("https://www.facebook.com/");
		//if u don't give the url then the test case will fail
		// test cases:2, passes:1, failed:1
		driver.findElement(By.id("email")).sendKeys("bhavitha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bhvitha@123");
		driver.findElement(By.name("login")).submit();
		driver.close();
	}

}
