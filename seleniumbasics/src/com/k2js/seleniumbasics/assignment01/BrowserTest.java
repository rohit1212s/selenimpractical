package com.k2js.seleniumbasics.assignment01;

import org.openqa.selenium.WebDriver;

public class BrowserTest {
	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.getBrowser("chrome","local");
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
