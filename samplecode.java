package sscOnlineDraftTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class samplecode 
{
	WebDriver driver;
	
	@Test 
	public void Container_Specification() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul Back UP\\Selenium_RSS\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://awswwwstaginga.sscconsolidation.com");
		Thread.sleep(3000);
			
		//Click on 'Sitemap' link
		driver.findElement(By.xpath("html/body/section/footer/div/div/aside[1]/nav/a[7]")).click();
					
		//Click on "Container specification " link
				driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[1]/span[2]/a")).click();
				Thread.sleep(5000);
				//Select Container specification name in drop down list
				WebElement element = driver.findElement(By.id("Scnt"));
				element.sendKeys("20-High Cube Dry Container");
				Thread.sleep(3000);
				//Change the UOM as E to M
				driver.findElement(By.xpath(".//*[@id='metricDiv']/a")).click();
				Thread.sleep(3000);
				//Navigate Browser back button
				 driver.navigate().back();
				 Thread.sleep(3000);
	}
}
