package com.k2js.seleniumbasics.assignment03;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickRevereseUsingLambda {
	
	@FindBy(xpath ="//tr[@class='mouseOut']//a")
	List<WebElement> link;
	static int count;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		ClickRevereseUsingLambda cl = PageFactory.initElements(driver, ClickRevereseUsingLambda.class);
		count = cl.link.size();
		cl.link.stream().forEach(x->cl.link.get(--count).click());
	}

}
