package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTables {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(ele);
		List<WebElement> country = driver.findElements(By.xpath("//table//tr//td[3]"));
		List<WebElement> company = driver.findElements(By.xpath("//table//tr//td[1]"));
		// int i=company.size()-1;
		// int j=country.size()-1;
		// System.out.println(company.get(i).getText() );
		// System.out.println(country.get(j).getText() );

		for (int i = 0; i < country.size(); i++) {
			if (country.get(i).getText().toString().length() <= 6) {
				System.out.println(company.get(i).getText() + " " + country.get(i).getText());
			}

		}

		driver.close();

	}
}
