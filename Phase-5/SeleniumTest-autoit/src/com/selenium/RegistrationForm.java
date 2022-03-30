package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium java jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Bhavitha");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("bhavitha1@gmail.com");
		
		WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("6789012345");
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Bhavitha@123");
		
		WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
		if(!check.isSelected())
		{
			check.click();
		}
		
		WebElement button= driver.findElement(By.cssSelector("#registerButton"));
		//button.submit();
	}

}
