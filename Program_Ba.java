package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Ba {
	
	void gettitle() 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		  // Thread.sleep(5000);
		   driver.navigate().to("https://www.Amazon.in");
		  driver.manage().window().minimize();
		   driver.navigate().back();
		     String title = driver.getTitle();
		     System.out.println(title);
		   String url = driver.getCurrentUrl();
		   System.out.println(url);
		   driver.close();
		   
		   
		   
		   
		   
		   
		   
		   
	}

	public static void main(String[] args)
	{
		Program_Ba b1  = new Program_Ba();
		b1.gettitle();
	

	}

}
