package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPage {
	
	@Test
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://house-of-esports.web.app/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.cssSelector("div[class='header-div'] button:nth-child(2)")).click();
		String f1= driver.getCurrentUrl();
		Assert.assertEquals(f1, "https://house-of-esports.web.app/f1");
		
		driver.findElement(By.cssSelector("button:nth-child(3)")).click();
		String apex = driver.getCurrentUrl();
		Assert.assertEquals(apex, "https://house-of-esports.web.app/apex");
		
		driver.findElement(By.cssSelector("button:nth-child(5)")).click();
		String strmr = driver.getCurrentUrl();
		Assert.assertEquals(strmr, "https://house-of-esports.web.app/streamers");
		
		driver.findElement(By.cssSelector("button:nth-child(6)")).click();
		String more = driver.getCurrentUrl();
		Assert.assertEquals(more, "https://house-of-esports.web.app/more");
		
	}

}
