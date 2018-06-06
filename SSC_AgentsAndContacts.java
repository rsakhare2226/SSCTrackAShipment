package sscOnlineDraftTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SSC_AgentsAndContacts 
{

	
	WebDriver driver;
	@BeforeMethod
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
	
	public void HighlightMyElement(WebElement element)
	{ 
		   JavascriptExecutor javascript = (JavascriptExecutor) driver;
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange");
	}
	
	@Test (priority = 1)
	public void SSC_Contacts() throws Exception
	{
		//Click on Contacts
		WebElement element = driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[2]/div/ul/li[1]/span[2]/a"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[2]/div/ul/li[1]/span[2]/a")).click();
		JavascriptExecutor jse4=(JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0, +300)", " ");
		//Click on expand arrow
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[2]/a")).click();
		Thread.sleep(1000);
		//Click on Show link
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[3]/table/tbody/tr[1]/td/div/a")).click();
		Thread.sleep(1000);
		//Click on Show Details
		for (int i=0; i<=1;i++)
		{
			driver.findElement(By.xpath("//*[@id='Antwerp18']")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[3]/table/tbody/tr[1]/td/div/a")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void SSC_Agent() throws Exception
	{
		//Click on Agents
		WebElement element = driver.findElement(By.xpath("//div/div[2]/div[2]/div/ul/li[1]/span[3]/a"));
		HighlightMyElement(element);		
		driver.findElement(By.xpath("//div/div[2]/div[2]/div/ul/li[1]/span[3]/a")).click();
		Thread.sleep(2000);
		//Click on Show link
		driver.findElement(By.xpath("//tr/td[1]/div/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);
		//Show Details
		for (int i=0; i<=1;i++)
		{
			driver.findElement(By.xpath("//*[@id='166']")).click();
			Thread.sleep(2000);
			JavascriptExecutor jse4=(JavascriptExecutor) driver;
			jse4.executeScript("window.scrollBy(0, +200)", " ");
		}
	}
	
	
	@Test (priority = 14)
	public void SSC_Surcharge() throws Exception
	{
		//Click on 'Surcharges' link
		
		driver.findElement(By.xpath("//div[5]/div[2]/div/div[1]/div[2]/div/ul/li/a")).click();
		Thread.sleep(2000);
		//Click on Download Link
		driver.findElement(By.xpath("//div[5]/div[2]/div/div[1]/div/div/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
		//Click on View Link
		driver.findElement(By.xpath("//div[5]/div[2]/div/div[1]/div/div/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(5000);
		//Download PDF
		driver.findElement(By.xpath("//*[@id='ui-id-1']/div/div/a[1]")).click();
		Thread.sleep(3000);
		//Click on email icon
		driver.findElement(By.xpath("//*[@id='ui-id-1']/div/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cEmailto']")).sendKeys("Surcharges Test Email text");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='cEmailID']")).sendKeys("pyeole@shipco.com");
		Thread.sleep(2000);
		//Click on Send Mail button
		driver.findElement(By.xpath("//*[@id='sendMail']/div/div/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);
			
		//Close email confirmation pop up icon
		
		//driver.findElement(By.xpath("//div[9]/div[1]/a")).click();
		Thread.sleep(2000);
		//Close Send Email Popup
		
		//driver.findElement(By.xpath("//div[8]/div[1]/a")).click();
		Thread.sleep(2000);
		//Close view popup
		driver.findElement(By.xpath("html/body/div[7]/div[1]/a")).click();
		Thread.sleep(2000);
	}
	
	
	
}
