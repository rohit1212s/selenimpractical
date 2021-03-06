package com.k2js.seleniumbasics.topic14_switchtoalert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchtoAlert_usingExplicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		WebElement ele = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//button[@onclick ='myFunction()']")).click();
		
		Alert a = new WebDriverWait(driver, 50).pollingEvery(Duration.ofSeconds(5)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.alertIsPresent());
		System.out.println(a.getText());
		a.accept();
		
		
	}

}
