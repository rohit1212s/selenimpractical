package com.k2js.seleniumbasics.assignment02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.k2js.seleniumbasics.topic08_reuseelements.ReuseTextBoxElement;

public class ValidateText {
	@FindBy(name = "firstName")
	WebElement fnele;
	@FindBy(linkText = "REGISTER")
	WebElement reglink;
	@FindBy(css = "input[name='register'][type='image']")
	WebElement submit;
	@FindBy(xpath = "//td/table/tbody/tr[3]/td/p[2]/../..")
	WebElement text;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SeleniumTrainingByJitendra\\Tools\\selenium softwares 3.14.9\\chromedriver_win32_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		ValidateText rtbe = PageFactory.initElements(driver, ValidateText.class);
		String expText = "Dear k2js ,\r\n" + 
				"\r\n" + 
				"Thank you for registering. You may now sign-in using the user name and password you've just entered.\r\n" + 
				"\r\n" + 
				"Note: Your user name is .";
		rtbe.reglink.click();
		rtbe.fnele.sendKeys("k2js");
		rtbe.submit.click();
		String actualText = rtbe.text.getText();
		assert expText.equals(actualText) : "Both text is not same";

		driver.close();

	}

}
