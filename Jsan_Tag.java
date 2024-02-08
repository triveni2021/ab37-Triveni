package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsan_Tag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("file:///E:/Automation_Assig/html/learningHTML1.html");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("Click to know about us")).click();

	}

}
