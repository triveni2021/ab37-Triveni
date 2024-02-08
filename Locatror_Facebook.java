package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatror_Facebook {
	
	public void locatefb()
	{  ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("email")).sendKeys("ap7763644@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("ak@975007");
	   driver.findElement(By.name("login")).click();
		
	}

	public static void main(String[] args) {
		Locatror_Facebook l1 = new Locatror_Facebook();
		l1.locatefb();
		

	}

}
