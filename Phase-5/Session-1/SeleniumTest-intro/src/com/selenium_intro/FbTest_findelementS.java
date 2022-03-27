package com.selenium_intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTest_findelementS {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\Selenium standalone server jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");// give the url on which u want to perform testing
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		for(WebElement w:list) {
			System.out.println(w.getAttribute("aria-label"));
			System.out.println(w.getAttribute("name"));
		}
		//driver.close();
	}

}
