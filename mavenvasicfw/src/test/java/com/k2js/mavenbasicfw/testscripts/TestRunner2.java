package com.k2js.mavenbasicfw.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.k2js.mavenbasicfw.pageobjects.HomePage;
import com.k2js.mavenbasicfw.util.BrowserFactory;
import com.k2js.mavenbasicfw.util.CommonUtil;

public class TestRunner2 {
	private WebDriver driver;
	String bn, rm, url;

	@Test
	public void verifyHeadings() throws Throwable {
		String testResult = "fail", errorMsg = "";
		try {
			this.bn = CommonUtil.getProperty("config", "browsername");
			System.out.println(bn);
			this.rm = CommonUtil.getProperty("config", "runmode");
			System.out.println(rm);
			this.url = CommonUtil.getProperty("config", "url");
			System.out.println(url);

			this.driver = BrowserFactory.getBrowser(bn, rm);
			BrowserFactory.openUrl(url);
			System.out.println(this.driver);
			HomePage hp = PageFactory.initElements(this.driver, HomePage.class);
			
			
			String un = CommonUtil.getProperty("homepage", "homepage.username");
			hp.enterUsername(un);
			String ps = CommonUtil.getProperty("homepage", "homepage.password");
			hp.enterpassword(ps);
			hp.clickOnLogin();
			String heading1 =hp.getTitleHeading1();
			System.out.println(heading1);
			String heading2 =hp.getTitleHeading2();
			System.out.println(heading2);
			hp.clickOnSignOff();
			String actualText = hp.getHomePageTitle();
			System.out.println(actualText);
			String expecText = CommonUtil.getProperty("homepage", "homepage.title");
			System.out.println(expecText);
			//assert actualText.equalsIgnoreCase(expecText) : "Title is not same";
			testResult = "Pass";
		} catch (Throwable t) {
			errorMsg = t.getMessage();
			CommonUtil.takeScreenShot(this.driver);
			t.printStackTrace();
			throw t;
		}

		finally {
			System.out.println(testResult);
			if (errorMsg.isEmpty()) {
				System.out.println(errorMsg);
			}
			BrowserFactory.close();
		}
	}

}
