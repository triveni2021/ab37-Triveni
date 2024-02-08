package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("file:///E:/Automation_Assig/html/learningHTML1.html");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Samarth patil");
		   driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Sam");
		 driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Sam@2021");
		 driver.findElement(By.xpath("((/html/body/form)[1]/input )[1]")).sendKeys("Samarth");
		// driver.findElement(By.xpath("(/html/body/from)[1]/input)[3]")).click();
		 driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		 driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		 driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		 driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();  //submit code
		 driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		 driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		 driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		 driver.findElement(By.xpath("(/html/body/input)[7]")).click();
		// driver.findElement(By.partialLinkText("Click")).click();
		 driver.findElement(By.linkText("Click to know about us")).click();
		 //driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();  //submit code



}
}
