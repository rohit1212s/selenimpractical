package com.k2js.seleniumbasics.assignment03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickreverseusingloop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> link1 = driver.findElements(By.className("mouseOut"));
		int rc = link1.size()-1;
		
		for(int i = rc; i>0; i--) {
			link1 = driver.findElements(By.className("mouseOut"));
			link1.get(i).click();
			
		}
	}

}
