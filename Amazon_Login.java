package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Login {

	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 
	        //driver.findElement(By.id("ap_email")).sendKeys("ptriveni1409@gmail.com");
	      //  driver.findElement(By.name("email")).sendKeys("ptriveni1409@gmail.com");
	       // driver.findElement(By.id("continue")).click();
	      //  driver.findElement(By.id("ap_password")).sendKeys("Samarth@2021");
	       // driver.findElement(By.id("signInSubmit")).click();

	}

}
