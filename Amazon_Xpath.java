package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		  
		  
		   String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIzNzcuJTngwMVjSqDAx3jjA79EAAYASAAEgL5-fD_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9146075%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D11434266177471593895%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("(//input)[7]")).sendKeys("ptriveni1409@gmail.com");
		   driver.findElement(By.xpath("(//input)[10]")).click();
		   driver.findElement(By.xpath("(//input)[9]")).sendKeys("Samarth@2021");
		   driver.findElement(By.xpath("(//input)[11]")).click();
            
	}

}
