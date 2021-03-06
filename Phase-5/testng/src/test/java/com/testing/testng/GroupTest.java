package com.testing.testng;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GroupTest {
	

	WebDriver driver=null;

	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium standalone server jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups = "Chrome", dependsOnMethods = {"launchChrome"})
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("bhavitha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavitha@123");
		driver.findElement(By.name("login")).submit();
		driver.close();
	}
	
	@Test(groups = "firefox" )
	public void launchFireFox() {
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\Selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups = "firefox", dependsOnMethods = {"launchFireFox"})
	public void loginWithFirefox() {
		
		driver.findElement(By.id("email")).sendKeys("bhavitha1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bhavitha@123");
		driver.findElement(By.name("login")).submit();
		driver.close();
	}

}
