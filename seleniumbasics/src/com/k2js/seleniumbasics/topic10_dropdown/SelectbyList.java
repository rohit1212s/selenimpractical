package com.k2js.seleniumbasics.topic10_dropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectbyList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement bm = driver.findElement(By.name("birthday_day"));
		
		List<WebElement> alldays = bm.findElements(By.tagName("option"));
		alldays.stream().filter(X->X.getAttribute("value").equalsIgnoreCase("3")).forEach(X->X.click());
	}

}
