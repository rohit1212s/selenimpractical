package com.k2js.seleniumbasics.topic04_seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenRemoteChrome {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();

		try {
			RemoteWebDriver rwd = new RemoteWebDriver(new URL("http://192.168.0.105:4444"), co);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	

}
}
