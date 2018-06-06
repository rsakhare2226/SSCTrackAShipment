package sscOnlineDraftTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleHiglightTheElement 
{
	WebDriver driver;
	@BeforeMethod()
	public void wwaBellsAndWhistles() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul Back UP\\Selenium_RSS\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://awswwwstaginga.sscconsolidation.com");
		Thread.sleep(3000);
		//Click on 'Sitemap' link
		driver.findElement(By.xpath("html/body/section/footer/div/div/aside[1]/nav/a[7]")).click();
		Thread.sleep(4000);
	}
	
	@Test (priority = 0)
	public void SSC_Container_Specification() throws Exception
	{
		Thread.sleep(5000);
		//Click on "Container specification " link
		HighlightMyElement(driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[1]/span[2]/a")));
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[1]/span[2]/a")).click();
		Thread.sleep(5000);
		//Select Container specification name in drop down list
		
		for (int i=1; i<18; i++)
		{
			Thread.sleep(2000);
			WebElement cont1 = driver.findElement(By.xpath("//*[@id='Scnt']"));
			Select cont2 = new Select(cont1);
			cont2.selectByIndex(i);
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//div/div/div/table/tbody/tr[3]/td[4]/input")).click();
			//Thread.sleep(3000);
			//Change the UOM as E to M
			driver.findElement(By.xpath(".//*[@id='metricDiv']/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='metricDiv']/a")).click();
			Thread.sleep(3000);
		}
		
	}
	
	//@Test
	public void HighlightMyElement(WebElement element)
	{ 
		  
		   JavascriptExecutor javascript = (JavascriptExecutor) driver;
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange");
	}
		
	
}
