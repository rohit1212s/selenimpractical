package com.k2js.seleniumbasics.assignment06;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.k2js.seleniumbasics.topic08_reuseelements.ReuseTextBoxElement;

public class Snapdealfindelements {

	@FindBy(xpath = "//span[contains(text(),'Computers & Gaming')]")
	WebElement cng;
	@FindBy(xpath = "//span[@class='headingText'][contains(text(),'Storage')]")
	WebElement storage;
	@FindBy(xpath = "//button[@data-filtername='Capacity_s']")
	WebElement viewmore;
	@FindBy(xpath = "//label[contains(@for,'Capacity_s')]")
	List<WebElement> links;
	@FindBy(xpath = "//span[@class='filter-clear']")
	WebElement clear;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Snapdealfindelements sd = PageFactory.initElements(driver, Snapdealfindelements.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		sd.cng.click();
		sd.storage.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		js.executeScript("arguments[0].scrollIntoView();", sd.viewmore);
		sd.viewmore.click();
		int i=sd.links.size();
		sd.links.get(i-2).click();
		sd.viewmore.click();
		js.executeScript("window.scrollBy(0,200)");
		sd.links.get(6).click();
		js.executeScript("window.scrollBy(0,300)");
		sd.clear.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,300)");
		assert !sd.links.get(i-2).isSelected();
		System.out.println(!sd.links.get(i-2).isSelected());
		assert !sd.links.get(5).isSelected();
		System.out.println(!sd.links.get(5).isSelected());
		
	}

}
