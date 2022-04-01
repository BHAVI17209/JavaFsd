package com.testng.testngWebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver driver;

	@Test
	public void cart() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\Selenium java jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ASUS-i7-1165G7-Dual-Screen-Celestial-UX482EA-HY777TS/dp/B08CKQ9LRP/ref=sr_1_2_sspa?keywords=Thinkpad+Laptops&qid=1648727470&sr=8-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzRkhOTVg0OUdCWUxJJmVuY3J5cHRlZElkPUEwNTM3MjExMzQ5TThMVzFQOFlGMSZlbmNyeXB0ZWRBZElkPUEwNjU4ODMyOTE4RDNRRlJBTDlRJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.submit();

	}
}
