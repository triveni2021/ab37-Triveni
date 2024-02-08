package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_110 {

	public static void main(String[] args) {
		 
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();

	}

}
