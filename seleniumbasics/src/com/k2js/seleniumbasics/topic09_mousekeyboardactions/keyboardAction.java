package com.k2js.seleniumbasics.topic09_mousekeyboardactions;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class keyboardAction {
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
		keyboardAction rtbe = PageFactory.initElements(driver, keyboardAction.class);
		rtbe.reglink.click();
		rtbe.fnele.sendKeys("k2js");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys("java").perform();
		//driver.close();


}
}
