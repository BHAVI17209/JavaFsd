package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_byXpath {
	
	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium java jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webmail.au.syrahost.com/");
		
		WebElement email= driver.findElement(By.xpath("//*[@id=\"login\"]"));
		System.out.println(email.getAttribute("placeholder"));
		
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		System.out.println(pass.getAttribute("placeholder"));
		
		WebElement submit= driver.findElement(By.xpath("//*[@id=\"sign_in\"]"));
		//By.xpath(//button[@value='log In'][@type='button'])
		
		System.out.println(submit.getAttribute("value"));
		
//		WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
//		System.out.println(pass.getAttribute("placeholder"));
		
		
		//driver.close();
	}

}
