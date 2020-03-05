package com.k2js.seleniumbasics.topic10_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectbyIndex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement bd = driver.findElement(By.name("birthday_day"));
		Select date = new Select(bd);
		date.selectByIndex(4);
		
		WebElement bm = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bm);
		month.selectByIndex(4);
		
		WebElement by = driver.findElement(By.name("birthday_year"));
		Select year = new Select(by);
		year.selectByIndex(16);
	}

}
