package com.k2js.seleniumbasics.topic06_locate_find_act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReuseElementAferRefresh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement regclick=driver.findElement(By.partialLinkText("GISTER"));
		regclick.click();
		WebElement fnelement=driver.findElement(By.cssSelector("input[name=firstName]"));
		fnelement.sendKeys("K2JS");
		driver.navigate().refresh();
		fnelement.sendKeys("K2JS");
//		Stale Element Exception

	}

}
