package com.k2js.seleniumbasics.topic05_openurl;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.youtube.com/");

	}
}
