package com.k2js.mavenbasicfw.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(linkText="REGISTER")
	private WebElement reglink;
	
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	
	@FindBy(xpath="//font[contains(text(),'Details')]")
	private WebElement heading1;
	
	@FindBy(xpath="//font[contains(text(),'Pref')]")
	private WebElement heading2;
	
	@FindBy(xpath="//a[contains(text(),'SIGN-OFF')]")
	private WebElement signoff;
	
	
	public RegisterPage clickRegisterLink() {
		this.reglink.click();
		return PageFactory.initElements(this.driver, RegisterPage.class);

	}
	
	public String getHomePageTitle() {
		return this.driver.getTitle();

	}
	
	public void enterUsername(String uninput) {
		this.username.sendKeys(uninput);
	}
	public void enterpassword(String pass) {
		this.password.sendKeys(pass);
	}
	public void clickOnLogin() {
		this.login.click();
	}
	public String getTitleHeading1() {
		return this.heading1.getText();
	}
	public String getTitleHeading2() {
		return this.heading2.getText();
	}
	public void clickOnSignOff() {
		this.signoff.click();
	}


}
