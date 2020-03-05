package com.k2js.seleniumbasics.topic11_implicitwait;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		
		Options o = driver.manage();
		Window w = o.window();
		w.setSize(new Dimension(500, 500));
		
		//driver.manage().window().setSize(new Dimension(500, 500));
	}

}