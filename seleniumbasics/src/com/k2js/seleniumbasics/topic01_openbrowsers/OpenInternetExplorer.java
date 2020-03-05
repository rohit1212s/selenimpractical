package com.k2js.seleniumbasics.topic01_openbrowsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();

	}

}
