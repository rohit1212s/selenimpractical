package com.k2js.seleniumbasics.topic02_closebrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeBrowserUsingQuit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.quit();
		cd.quit();

	}

}
