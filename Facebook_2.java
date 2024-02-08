package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("email")).sendKeys("ap7763644@gmail.com");
		   driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"A");
		   driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		   
		   driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");


	}

}
