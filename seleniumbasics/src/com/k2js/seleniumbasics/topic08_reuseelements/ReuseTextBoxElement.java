package com.k2js.seleniumbasics.topic08_reuseelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReuseTextBoxElement {
	@FindBy(name = "firstName")
	WebElement fnele;
	@FindBy(linkText = "REGISTER")
	WebElement reglink;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		ReuseTextBoxElement rtbe=PageFactory.initElements(driver, ReuseTextBoxElement.class);
		rtbe.reglink.click();
		rtbe.fnele.sendKeys("k2js");
		driver.navigate().refresh();
		rtbe.fnele.sendKeys("k2js");
		driver.close();

	}

}
