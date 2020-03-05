package com.k2js.seleniumbasics.topic10_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectbyTextUsingLambda {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement bm = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bm);
		
		month.getOptions().stream().filter(X->X.getText().equalsIgnoreCase("Mar")).forEach(X->X.click());
		
		

	}

}
