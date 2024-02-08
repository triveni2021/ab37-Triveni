package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loator_Gmail {
	   public void gmail()
	   {
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("Gmail")).click();
	   }
	

	public static void main(String[] args) {
		
		Loator_Gmail g1 = new Loator_Gmail();
		g1.gmail();


	}

}
