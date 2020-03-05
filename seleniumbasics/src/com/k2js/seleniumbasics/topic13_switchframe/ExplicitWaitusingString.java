package com.k2js.seleniumbasics.topic13_switchframe;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitusingString {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		FluentWait<WebDriver> fw = new WebDriverWait(driver, 150);
		fw.pollingEvery(Duration.ofSeconds(5));
		fw.ignoring(StaleElementReferenceException.class);
		fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		
		driver.findElement(By.xpath("//button[@onclick ='myFunction()']")).click();
	}

}
