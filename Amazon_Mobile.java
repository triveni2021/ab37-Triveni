package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mobile {
	  public void clickmobile()
	  {
		  ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("Mobiles")).click();
	  }
	  
	public static void main(String[] args) 
	{    Amazon_Mobile m1 = new  Amazon_Mobile();
	      m1.clickmobile();
		

	}

}
