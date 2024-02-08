package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Keys {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		for (int i=0;i<11;i++)
		{
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN+"[i]");
		}
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("software books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        
	}

}
