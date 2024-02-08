package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_Books {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		 driver.get("https://grotechminds.com/x-path/");
		   driver.manage().window().maximize();
		WebElement product=driver.findElement(By.xpath("(//li/span[@class='folder'])[1]"));
		product.click();
		Thread.sleep(3000);
		WebElement books=driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		books.click();
		//WebElement mbooks=driver.findElement(By.xpath("//ul[@class='sub-items']/li[2]"));
		//mbooks.click();
		
		WebElement mobiles= driver.findElement(By.xpath("(//li/span[@class='folder'])[15]"));
		mobiles.click();
		
		WebElement clothes=driver.findElement(By.xpath("(//span[@class='folder'])[24]"));
		clothes.click();
		
		Thread.sleep(3000);
		WebElement chocolates=driver.findElement(By.xpath("(//span[@class='folder'])[31]"));
		chocolates.click();
	}

	}


