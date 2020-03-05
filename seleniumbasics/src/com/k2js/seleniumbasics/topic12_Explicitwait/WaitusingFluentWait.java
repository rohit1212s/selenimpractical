package com.k2js.seleniumbasics.topic12_Explicitwait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitusingFluentWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		FluentWait<WebDriver> fw = new FluentWait<>(driver);
		fw.withTimeout(Duration.ofSeconds(150));
		fw.pollingEvery(Duration.ofSeconds(5));
		// fw.ignoring(StaleElementReferenceException.class);
		WebElement ele = fw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
		ele.click();

	}

}
