package com.k2js.seleniumbasics.assignment04;

import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlefindnth {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement k = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		k.click();		
		k.sendKeys("test");
		
		List<WebElement> we = driver.findElements(By.cssSelector("ul>li[class='sbct']"));
		/*String[] s= we.toArray(new String[0]);
		Arrays.sort(s, Comparator.comparing(String::length));
		Arrays.stream(s).forEach(System.out::print);*/
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int ct = (int)(Math.random()*10)+1;
		for(int i =0; i<we.size();i++) {
			if(ct==i) {
				we.get(i).click();
			}
			
		}
		
		System.out.print(ct);
		driver.findElement(By.cssSelector("ul>li[class='sbct']:nth-child("+ct+")")).click();
		 
		
	}

}
