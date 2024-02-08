package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WevDriver_Property {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AutomationProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

}
