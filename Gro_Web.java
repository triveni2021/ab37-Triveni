package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gro_Web {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		  // driver.get("https://grotechminds.com");
		   driver.get("https://grotechminds.com/registration/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	WebElement fname = driver.findElement(By.xpath("//input[@id='fname']"));
                    fname.sendKeys("Samarth");
           WebElement lname = driver.findElement(By.id("lname"));
           lname.sendKeys("patil");
           fname.sendKeys("Samarth");
           WebElement uname= driver.findElement(By.id("Username"));
           uname.sendKeys("Samarthpatil");
           WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
           pass.sendKeys("Sam@2021");
           WebElement male = driver.findElement(By.xpath("//input[@id='Male']"));
           male.click();
           WebElement  female = driver.findElement(By.xpath("//input[@id='FeMale']"));
           female.click();
           WebElement  addr = driver.findElement(By.xpath("//textarea[@id='w3review']"));
           addr.sendKeys("pune maharashtra");
           WebElement  peraddr = driver.findElement(By.xpath("//textarea[@id='Address']"));
           peraddr.sendKeys("sangli maharashtra");
           WebElement pcode= driver.findElement(By.id("Pincode"));
           pcode.sendKeys("421043");
             WebElement  agre= driver.findElement(By.xpath("//input[@id='Agree']"));
             agre.click();
             WebElement submit = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
             submit.click();
	}
}
             
       

	
