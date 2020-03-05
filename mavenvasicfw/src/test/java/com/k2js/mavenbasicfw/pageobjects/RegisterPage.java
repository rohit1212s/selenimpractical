package com.k2js.mavenbasicfw.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {

	private WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="firstName")
	private WebElement fnele;
	
	@FindBy(name="lastName")
	private WebElement lnele;
	
	@FindBy(name="phone")
	private WebElement phn;
	
	@FindBy(name="userName")
	private WebElement email;
	
	@FindBy(name="address1")
	private WebElement addr;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement pin;
	
	@FindBy(name="country")
	private WebElement con;
	
	@FindBy(name="email")
	private WebElement unam;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="confirmPassword")
	private WebElement cpass;
	
	@FindBy(name="register")
	private WebElement regist;
	
	
	
	public void enterFirstName(String fninput) {
		this.fnele.sendKeys(fninput);
	}
	public void enterLastFirstName(String lninput) {
		this.lnele.sendKeys(lninput);
	}
	public void enterPhone(String phone) {
		this.phn.sendKeys(phone);
	}
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	
	
	public void enterAdrress(String address) {
		this.addr.sendKeys(address);
	}
	
	public void enterCity(String city) {
		this.city.sendKeys(city);
	}

	public void enterState(String state) {
		this.state.sendKeys(state);
	}
	public void enterPincCode(String pin) {
		this.pin.sendKeys(pin);
	}
	
	
	public void selectCountry(String country) {
		Select sl= new Select(con);
		sl.selectByValue("92");
		
		this.con.sendKeys(country);
	}
	
	public void enterUsername(String uname) {
		this.unam.sendKeys(uname);
	}

	public void enterPassword(String pass) {
		this.pass.sendKeys(pass);
	}
	public void confirmPassword(String cpass) {
		this.cpass.sendKeys(cpass);
	}
	
	public void clickSubmit() {
		this.regist.click();
	}

}
