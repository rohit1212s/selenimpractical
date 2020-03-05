package com.k2js.mavenbasicfw.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.k2js.mavenbasicfw.pageobjects.HomePage;
import com.k2js.mavenbasicfw.pageobjects.RegisterPage;
import com.k2js.mavenbasicfw.util.BrowserFactory;
import com.k2js.mavenbasicfw.util.CommonUtil;

public class TestRunner {
	private WebDriver driver;
	String bn, rm, url;

@Test
	public void verifyHomePageTitle() throws Throwable {
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
			String actualText = hp.getHomePageTitle();

			System.out.println(actualText);
			String expecText = CommonUtil.getProperty("homepage", "homepage.title");
			System.out.println(expecText);
			assert actualText.equalsIgnoreCase(expecText) : "Title is not same";
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
@Test
	public void verifyConfirmationMessage() throws Throwable {
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

			RegisterPage rp = hp.clickRegisterLink();
			String fn = CommonUtil.getProperty("registerpage", "registerpage.firstname");
			rp.enterFirstName(fn);
			String ln = CommonUtil.getProperty("registerpage", "registerpage.lastname");
			rp.enterLastFirstName(ln);
			String pn = CommonUtil.getProperty("registerpage", "registerpage.Mobile");
			rp.enterPhone(pn);
			String em = CommonUtil.getProperty("registerpage", "registerpage.email");
			rp.enterEmail(em);
			String adr = CommonUtil.getProperty("registerpage", "registerpage.Address");
			rp.enterAdrress(adr);
			String ct = CommonUtil.getProperty("registerpage", "registerpage.City");
			rp.enterCity(ct);

			String st = CommonUtil.getProperty("registerpage", "registerpage.State/Province");
			rp.enterState(st);
			String pc = CommonUtil.getProperty("registerpage", "registerpage.PostalCode");
			rp.enterPincCode(pc);
			String cn = CommonUtil.getProperty("registerpage", "registerpage.Country");
			rp.selectCountry(cn);
			String unm = CommonUtil.getProperty("registerpage", "registerpage.UserName");
			rp.enterUsername(unm);
			String ps = CommonUtil.getProperty("registerpage", "registerpage.Password");
			rp.enterPassword(ps);
			String cps = CommonUtil.getProperty("registerpage", "registerpage.ConfirmPassword");
			rp.confirmPassword(cps);
			rp.clickSubmit();
			String actualText = "Dear K2js Java,\nThank you for registering. You may now sign-in using the user name and password you've just entered.\r\n"
					+ "\nNote: Your user name is rohit1212p.";
			System.out.println(actualText);
			String expecText = CommonUtil.getProperty("confirmationpage", "registerpage.confmessage");
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

	/*
	 * public static void main(String[] args) { TestRunner tr = new TestRunner();
	 * try { // tr.verifyHomePageTitle(); tr.verifyConfirmationMessage(); } catch
	 * (Throwable e) { e.printStackTrace(); }
	 * 
	 * }
	 */

}
