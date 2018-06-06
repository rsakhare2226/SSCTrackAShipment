package sscOnlineDraftTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Track 
{

	WebDriver driver;
	@BeforeMethod
	
	public void LogIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul Back UP\\Selenium_RSS\\Chrome Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    //driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://staging.www.shipco.com/ecommerce/tmp/shipco_bkg_245961041567320180604054357.pdf");
	    Thread.sleep(5000); 
	      
	    
	}
	
	@Test
	public void Search1BkgNo() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("download"));
		Actions action = new Actions(driver);
		 
        action.moveToElement(element).build().perform();
	    
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('download').click()");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id='download']")).click();
       /* WebElement element =  driver.findElement(By.cssSelector(#download));
        Thread.sleep(10000);*/
        		
     }
}
