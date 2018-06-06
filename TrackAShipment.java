package sscOnlineDraftTestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wwaFinalTestCases.Utility_screenShots;

public class TrackAShipment 
{
	WebDriver driver;
	   
		@BeforeMethod
		
		public void LogIn() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Rahul Back UP\\Selenium_RSS\\Chrome Driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://awswwwstaginga.sscconsolidation.com");
		    Thread.sleep(3000); 
		    
		    Thread.sleep(3000); 
		    JavascriptExecutor jse = (JavascriptExecutor) driver;
	        driver.findElement(By.xpath("html/body/section/div[5]/header/div[1]/div[2]/div/div[1]/a")).click();
	        Thread.sleep(4000); 
	        driver.findElement(By.xpath("//*[@id='cHdrUsername']")).sendKeys("newtester");
	        driver.findElement(By.xpath("//*[@id='cHdrPassword']")).sendKeys("newtester");
	        Thread.sleep(3000); 
	        driver.findElement(By.xpath("//*[@id='lognBx']/div[1]/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	        Thread.sleep(6000);
	       
	 	    driver.findElement(By.xpath("//*[@id='rightAccord']/div[2]/ul/li[5]/a")).click();
		    Thread.sleep(3000);
		}
		
		@AfterMethod()
		
		public void tearDown(ITestResult result) throws IOException 
		{
		    if (ITestResult.SUCCESS == result.getStatus()) 
		    {
		         Utility_screenShots.captureScreenShot(driver, result.getName());
		    }
		    else
		    {
		         Utility_screenShots.captureScreenShot(driver, result.getName());
		    }
		    driver.close();
		   }
		
		
	
		@Test
		public void Search1BkgNo() throws InterruptedException
		{
			
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[2]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("10415673");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("a[class='shpmnt-icn tip'][title='Click to view full shipment details']")).click();	
			Thread.sleep(8000);
			driver.switchTo().frame("frame1");
            
			driver.findElement(By.linkText("Shipment Documentation")).click();
            Thread.sleep(8000);

           

            //Code for Document opening. present in shipment documents.
            
            driver.findElement(By.xpath("//*[@id='tas-p4']/div/div/table/tbody/tr[1]/td[1]/a")).click();
            Thread.sleep(2000);
            
            String MainWindow=driver.getWindowHandle();
            Set<String> s1=driver.getWindowHandles();		
            Iterator<String> i1=s1.iterator();
            while(i1.hasNext())			
            {		
                String ChildWindow=i1.next();		
                		
                if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                {    		
                     
                        // Switching to Child window
                        driver.switchTo().window(ChildWindow);
                        Thread.sleep(4000);
                        driver.manage().window().maximize();
                        Thread.sleep(2000);
                                                
                      // driver.findElement(By.xpath("//*[@id='pageContainer1']")).click();
                        Thread.sleep(2000);
                    //  driver.findElement(By.xpath("//*[@id='download']")).click();
                        
                        Thread.sleep(8000);
                        driver.close();		
                }	
                
            }		
                        
           driver.switchTo().window(MainWindow);

        //   Thread.sleep(8000);
            

          // driver.findElement(By.linkText("Shipment Details")).click();
            //Thread.sleep(8000);
 	
		}
		
		
		
/*
		@Test
		public void Search2LotNo() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Search Options")).click();
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[3]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).clear();
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("10415673");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(8000);
		}
	

		@Test
		public void Search3BLNo() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Search Options")).click();
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[4]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).clear();
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("BOLN10415673");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(8000);		
		}
		

		
		@Test
		public void Search4ARNNo() throws InterruptedException
		{
		
			driver.findElement(By.linkText("Search Options")).click();
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[5]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).clear();
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("180421500102");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(8000);			
		}
		

		@Test
		public void Search5ContainerNo() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Search Options")).click();
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[6]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).clear();
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("TEST180409");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(8000);	
		}
		

		@Test
		public void Search6CustomerRef() throws InterruptedException
		{
			
			driver.findElement(By.linkText("Search Options")).click();
		    driver.findElement(By.xpath("//*[@id='srch_field']")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='srch_field']/option[7]")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='reference']")).clear();
			driver.findElement(By.xpath("//*[@id='reference']")).sendKeys("SBRNJCN24418");
			driver.findElement(By.xpath("//*[@id='searchShipment']")).click();
			Thread.sleep(8000);		

		}
*/
	}


			    


				