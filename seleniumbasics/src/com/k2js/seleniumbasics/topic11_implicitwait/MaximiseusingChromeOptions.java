package com.k2js.seleniumbasics.topic11_implicitwait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximiseusingChromeOptions {

	public static void main(String[] args) {
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--start-maximized");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=800,480");
        
 	
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		
		
	}

}
