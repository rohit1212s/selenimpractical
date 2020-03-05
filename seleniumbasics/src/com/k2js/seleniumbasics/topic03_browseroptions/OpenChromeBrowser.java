package com.k2js.seleniumbasics.topic03_browseroptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("user-data-dir=C:\\Users\\Win10\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver(co);

	}

}
