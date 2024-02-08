package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Uae {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		
		
		String[] link = {"Arab","Kingdom","States"};
		for(int i=0;i<link.length;i++)
		{          driver.get("https://www.amazon.in");
		          driver.manage().window().maximize();
			String partiallinkTest = link[i];

			 driver.findElement(By.partialLinkText(partiallinkTest)).click();
			 Thread.sleep(2000);
		}
		
		
	    
		


}
}