package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_byxpath {
	
	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium java jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://m.facebook.com/login/?ref=dbl&fl");
		
		WebElement email= driver.findElement(By.xpath("//*[@id=\"m_login_email\"]"));
		System.out.println(email.getAttribute("placeholder"));
		
		WebElement pass= driver.findElement(By.cssSelector("#m_login_password"));
		System.out.println(pass.getAttribute("placeholder"));
		
		WebElement button= driver.findElement(By.cssSelector("button[value='Log In'][type='button']"));
		//By.xpath(//button[@value='log In'][@type='button'])
		
		System.out.println(button.getAttribute("data-sigil"));
		
//		WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
//		System.out.println(pass.getAttribute("placeholder"));
		
		
		//driver.close();
	}

}
