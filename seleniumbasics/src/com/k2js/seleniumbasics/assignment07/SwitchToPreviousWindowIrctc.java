package com.k2js.seleniumbasics.assignment07;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToPreviousWindowIrctc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//WebElement link=driver.findElement(By.xpath("//div[3]/a//i[@class='fa fa-align-justify']"));
		//link.click();
		WebElement flightlink=driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')][@class]"));
		flightlink.click();
		System.out.println(driver.getTitle());
		Set<String> allwindowhandles=driver.getWindowHandles();
		ArrayList<String> allwinlist= new ArrayList<>(allwindowhandles);
		driver.switchTo().window(allwinlist.get(1));
		System.out.println(driver.getTitle());
		WebElement rt=driver.findElement(By.xpath("//label[@class='form-check-label'][@for='Round-Trip']"));
		assert !rt.isSelected();

	}

}
