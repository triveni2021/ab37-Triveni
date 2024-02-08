package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String id = driver.getWindowHandle();
		System.out.println(id);
		 Set<String> id1 = driver.getWindowHandles();
		 System.out.println(id1);
		String title = driver.getTitle();
		/*char c1[]       = title.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(title);*/
		ArrayList al= new ArrayList();
		al.add(title);
		System.out.println("the title stored in array is:"+al);
		
		
		
	}

}
