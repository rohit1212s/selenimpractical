package com.k2js.mavenbasicfw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtil {
	// 1.Method to read any property file and get value based on key
	public static String getProperty(String filename, String key) throws FileNotFoundException {
		try (FileInputStream fis = new FileInputStream(".//testdata//" + filename + ".properties")) {
			Properties p = new Properties();
			p.load(fis);
			return p.getProperty(key);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return null;

	}

	// 2.To sleep for required time
	public static void sleepFor(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3.Method to get current date time
	public static String getCurrentDateTime() {
		String dt = LocalDateTime.now().toString();
		return dt.replace(":", "-").substring(0, dt.indexOf('.'));
	}

	// 4.Write take screenshot code
	public static void takeScreenShot(WebDriver driver) {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//screeshot//" + getCurrentDateTime() + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
