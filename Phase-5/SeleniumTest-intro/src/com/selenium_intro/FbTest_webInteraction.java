package com.selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTest_webInteraction {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\Selenium standalone server jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");// give the url on which u want to perform testing
		
		//WebElement h2= driver.findElement(By.className("_8eso"));// just inspect the data whit u want and take the class name from there
		//System.out.println(h2.getText());
		
		WebElement email= driver.findElement(By.id("email"));
		//System.out.println(email.getAttribute("placeholder"));
		
		WebElement pwd= driver.findElement(By.id("pass"));
		
		email.sendKeys("bhavitha@gmail.com");
		pwd.sendKeys("Bhavitha@123");
		
		WebElement login= driver.findElement(By.name("login"));
		login.submit();
		//driver.close();
	}

}
