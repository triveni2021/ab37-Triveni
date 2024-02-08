package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Xpath {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("ap7763644@gmail.com");
		  //driver.findElement(By.xpath("//input[@name='email]")).sendKeys("ap7763644@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ak@975007");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
		   

	}

}
