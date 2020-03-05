package com.k2js.mavenbasicfw.util;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// 5.Write BrowserFactory class with following methods

public class BrowserFactory {
	private static WebDriver driver = null;

	public static WebDriver getBrowser(String browsername, String runmode) {
		if (runmode.equalsIgnoreCase("chrome")) {
			ChromeOptions co = new ChromeOptions();
			try {
				String remoteMachine = CommonUtil.getProperty("config", "remoteMachine1");
				try {
					driver = new RemoteWebDriver(new URL(remoteMachine), co);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (runmode.equalsIgnoreCase("local")) {
			if (browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();

			}

		}

		return driver;
	}

	public static String openUrl(String url) {
		driver.get(url);

		return url;

	}

	public static void close() {
		driver.close();

	}

}
