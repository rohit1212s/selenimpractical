package com.k2js.seleniumbasics.topic17_readsdatafrompropertyfile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	private static WebDriver driver=null;
	public static WebDriver getBrowser(String browsername,String runmode) {
		if(runmode.equalsIgnoreCase("remote")) {
			if (browsername.equalsIgnoreCase("chrome")) {
				ChromeOptions co=new ChromeOptions();
				try {
					driver=new RemoteWebDriver(new URL("http://192.168.0.105:4444"),co);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else if(browsername.equalsIgnoreCase("firefox"));
		}
		
		if(runmode.equalsIgnoreCase("local")) {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
		}
		return driver;
	}

}
