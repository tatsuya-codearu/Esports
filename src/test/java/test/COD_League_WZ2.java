package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class COD_League_WZ2 {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://house-of-esports.web.app/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.findElement(By.cssSelector("button:nth-child(4)")).click();
		String cod = driver.getCurrentUrl();
		Assert.assertEquals(cod, "https://house-of-esports.web.app/cod");
		
		driver.findElement(By.xpath("//div[@class='main-div']//div[2]//div[1]//img[1]")).click();

	}
}
