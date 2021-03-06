package com.k2js.seleniumbasics.assignment03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClicklinksInReverse {
	
	@FindBy(xpath ="//tr[@class='mouseOut']//a")
	List<WebElement> link;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		ClicklinksInReverse c = PageFactory.initElements(driver,ClicklinksInReverse.class);
				
			 		
		for(int i=6; i<c.link.size();i--) {
			WebElement x = c.link.get(i);
			x.click();
			driver.navigate().back();
			
			}
		}

	}

