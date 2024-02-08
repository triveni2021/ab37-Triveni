package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://grotechminds.com/x-path/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  // WebElement product= driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		   WebElement product= driver.findElement(By.xpath("//ul[@class='main-items']/li/span"));
		    product.click();
		   // Thread.sleep(3000);
			   WebElement books= driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
			   books.click();
			    WebElement ebooks = driver.findElement(By.xpath("//ul/li/span[@class='folder'][1]"));
			    ebooks.click();
			//   Thread.sleep(3000);
			   WebElement mobiles= driver.findElement(By.xpath("(//span[@class='folder'])[15]"));
				mobiles.click();
				//Thread.sleep(2000);
				WebElement clothes=driver.findElement(By.xpath("(//span[@class='folder'])[24]"));
				clothes.click();
				//Thread.sleep(2000);
				WebElement chocolates=driver.findElement(By.xpath("(//span[@class='folder'])[31]"));
				chocolates.click();
				
				
	}
	}


