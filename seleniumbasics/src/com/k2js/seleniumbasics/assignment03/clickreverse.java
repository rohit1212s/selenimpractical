package com.k2js.seleniumbasics.assignment03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class clickreverse {

	
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			
			WebElement link = driver.findElement(By.xpath("//tr[@class='mouseOut']//a"));
			List<WebElement> links = link.findElements(By.xpath("//tr[@class='mouseOut']//a"));
			for(int i=links.size()-1; i>1; i++) {
				link.findElement(By.xpath("//tr[@class='mouseOut']")).click();
			}
							
				 		
					
				
			}
	}


