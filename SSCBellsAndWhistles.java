package sscOnlineDraftTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import stiOnlineFinalTestCases.Utility_screenShots;

public class SSCBellsAndWhistles 
{

	//private static final WebElement WebElement = null;
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
		driver.findElement(By.xpath("//header/div[1]/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(4000);
	}
	
	//@Test
	public void HighlightMyElement(WebElement element)
	{ 
		   JavascriptExecutor javascript = (JavascriptExecutor) driver;
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange");
	}

	@Test (priority = 0)
	public void SSC_Container_Specification() throws Exception
	{
		Thread.sleep(5000);
		//Click on "Container specification" link
		WebElement element = driver.findElement(By.xpath("//section/ul[1]/li[2]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[1]/li[2]/section[2]/a[1]")).click();
		Thread.sleep(5000);
		//Select Container specification name in drop down list
		
		for (int i=1; i<2; i++)
		{//18
			Thread.sleep(1000);
			WebElement cont1 = driver.findElement(By.xpath("//*[@id='Scnt']"));
			Select cont2 = new Select(cont1);
			cont2.selectByIndex(i);
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//div/div/div/table/tbody/tr[3]/td[4]/input")).click();
			//Thread.sleep(3000);
			//Change the UOM as E to M
			driver.findElement(By.xpath(".//*[@id='metricDiv']/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='metricDiv']/a")).click();
			Thread.sleep(3000);
		}
	}
	
	@Test (priority = 1)
	public void SSC_Shipping_Glossary() throws Exception
	{
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//section/ul[4]/li[2]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[4]/li[2]/section[2]/a[1]")).click();
		//Click on 'Show all shipping glossary'
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[2]/div[2]/span/a")).click();
		Thread.sleep(2000);
		//Click on 'E'
		driver.findElement(By.xpath(".//*[@id='E']")).click();
		Thread.sleep(4000);
		//enter text in search text box
		WebElement currencyhave0 = driver.findElement(By.id("glossaryName"));
		currencyhave0.clear();
		currencyhave0.sendKeys("Unit Cost");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Unit Cost')]")).click();
		Thread.sleep(3000);
		//Click on search button
		driver.findElement(By.xpath("//div[1]/div[5]/div[2]/div/div[2]/div[1]/table/tbody/tr/td[2]/input[3]")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void SSC_CFS_Finder() throws Exception
	{
		Thread.sleep(3000);
		//Click on CFS Finder
		WebElement element = driver.findElement(By.xpath("//section/ul[1]/li[1]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[1]/li[1]/section[2]/a[1]")).click();
		WebElement currencyhaveT = driver.findElement(By.id("portcode"));
		currencyhaveT.clear();
		currencyhaveT.sendKeys("USNYC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@id='googleMap']/div/div/button")).click();
		//Thread.sleep(4000);
		
	}
		
	@Test (priority = 3)
	public void SSC_UN_LocationCode() throws Exception
	{
	    //Click UN Location
		WebElement element = driver.findElement(By.xpath("//section/ul[4]/li[3]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[4]/li[3]/section[2]/a[1]")).click(); 
		//Search The Location
		WebElement UNcode1 = driver.findElement(By.id("locationCode"));
		UNcode1.clear();
		UNcode1.sendKeys("USNYC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(2000);
		
		//Click On Go Button
		driver.findElement(By.xpath("//div[3]/div/div/div[1]/div/table/tbody/tr/td[3]/input")).click();
		Thread.sleep(3000);
		
		//Select country name in drop down list
		WebElement Country = driver.findElement(By.xpath("//*[@id='cCountry']"));
		Select Country1 = new Select(Country);
		Country1.selectByVisibleText("United Arab Emirates");
		Thread.sleep(2000);
		
		
		//Select city name in drop down list
		WebElement City = driver.findElement(By.xpath("//*[@id='cCity']"));
		Select City1 = new Select(City);
		City1.selectByVisibleText("Jebel Ali");
		Thread.sleep(2000);
				
		//Click on Go Button
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div[2]/div[1]/table/tbody/tr/td[6]/input")).click();
		Thread.sleep(3000);
	}
	
	@Test (priority = 4)
	public void SSC_GLobal_Weather() throws Exception
	{
		//Click on Global Wather
		WebElement element = driver.findElement(By.xpath("//section/ul[2]/li[3]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[2]/li[3]/section[2]/a[1]")).click();
		WebElement FavoriteLocation = driver.findElement(By.id("gwCity"));
		FavoriteLocation.sendKeys("New York");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse4=(JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0, +100)", " ");
	}
		
	@Test (priority = 5)
	public void SSC_Hazardous_Information() throws Exception
	{
		//Click on Hazardous Information
		WebElement element = driver.findElement(By.xpath("//section/ul[3]/li[1]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[3]/li[1]/section[2]/a[1]")).click();
		Thread.sleep(4000);
		
		for (int i=0;i<2;i++)
		{//14
			WebElement HazDetails = driver.findElement(By.xpath("//*[@id='bt1']"));
			Select HazDetails1 = new Select(HazDetails);
			HazDetails1.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		//Click on the 'Hazardous Chart'link
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[1]/a")).click();
		Thread.sleep(2000);
		//Navigate Browser back button
		
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0, +200)", " ");
	}
	
	@Test (priority = 6)
	public void SSC_World_Time_Zone() throws Exception
	{
	   //Click on Word time zone
		WebElement element = driver.findElement(By.xpath("//section/ul[5]/li/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[5]/li/section[2]/a[1]")).click();
		//Enter country code in text box as INBOM
		WebElement WorldTimeZone = driver.findElement(By.id("origin"));
		WorldTimeZone.sendKeys("INBOM");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'INBOM')]")).click();
		Thread.sleep(2000);
		WorldTimeZone.clear();
		
		JavascriptExecutor jse2=(JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0, +200)", " ");
		
		Thread.sleep(2000);
		//Enter country code in text box as USNYC
		WebElement WorldTimeZone1 = driver.findElement(By.id("origin"));
		WorldTimeZone1.sendKeys("USNYC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(2000);
		WorldTimeZone1.clear();
		Thread.sleep(2000);
		JavascriptExecutor jse3=(JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0, +200)", " ");
		
		//Set Newyork as home
		driver.findElement(By.xpath(".//*[@id='wtr-home_id_3']")).click();
		Thread.sleep(4000);
		JavascriptExecutor jse4=(JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0, +200)", " ");
		
	}
	
	@Test(priority = 7)
	public void SSC_Currency_Converter() throws Exception
	{
	
		WebElement element = driver.findElement(By.xpath("//section/ul[2]/li[1]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[2]/li[1]/section[2]/a[1]")).click();
		//Select Container specification name in drop down list
		WebElement currencyhave = driver.findElement(By.id("origin"));
		currencyhave.clear();
		currencyhave.sendKeys("USD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'USD')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='currencyfrom']")).sendKeys("115");
		//Enter Currency I want 
		WebElement currencywant = driver.findElement(By.id("originwant"));
		currencywant.clear();
		currencywant.sendKeys("INR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'INR')]")).click();
		//Click on Calculate button
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[1]")).click();
		Thread.sleep(3000);
		//enterchange the currency
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
		//Click on Reset button
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[2]")).click();
		Thread.sleep(1000);
		//Click on Calender
		driver.findElement(By.xpath("//*[@id='from_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")).click();
		Thread.sleep(3000);
		//Select Container specification name in drop down list
		WebElement currencyhave1 = driver.findElement(By.id("origin"));
		currencyhave1.clear();
		currencyhave1.sendKeys("EUR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'EUR')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='currencyfrom']")).sendKeys("18.90");
		//Enter Currency I want 
		WebElement currencywant1 = driver.findElement(By.id("originwant"));
		currencywant1.clear();
		currencywant1.sendKeys("GBP");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'GBP')]")).click();
		//Click on Calculate button
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[1]")).click();
		Thread.sleep(3000);
		//enterchange the currency
		driver.findElement(By.xpath("//div[1]/div[5]/div[3]/div/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
	}
		
	@Test (priority = 8)
	public void SSC_Inco_Terms() throws Exception
	{
		//Click on INCO Terms
		WebElement element = driver.findElement(By.xpath("//section/ul[3]/li[2]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[3]/li[2]/section[2]/a[1]")).click();
		Thread.sleep(4000);
		
		//Select INCO Terms
		for (int i=0;i<2;i++)
		{//11
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, -350)", " ");
			Thread.sleep(3000);
			WebElement IncoTerms = driver.findElement(By.xpath("//*[@id='bt1']"));
			Select IncoTerms1 = new Select(IncoTerms);
			IncoTerms1.selectByIndex(i);
			JavascriptExecutor jse1=(JavascriptExecutor) driver;
			jse1.executeScript("window.scrollBy(0, +350)", " ");
			Thread.sleep(3000);
		}
		
		//click on INCO terms charts and description
		driver.findElement(By.xpath("//div[5]/div[2]/div/div[1]/a")).click();
		
		Thread.sleep(2000);
		//compress the inco terms chart
		driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		
		for (int i=1;i<=2;i++)
		{//11
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, -200)", " ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div["+i+"]/div[1]/a")).click();
			JavascriptExecutor jse3=(JavascriptExecutor) driver;
			jse3.executeScript("window.scrollBy(0, +200)", " ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div["+i+"]/div[1]/a")).click();
		}
		
		//Click on Contact Us Link
		driver.findElement(By.xpath("//div[3]/div[6]/span/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Download the Inco Terms
		driver.findElement(By.xpath("//div[1]/div[5]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(5000);
		JavascriptExecutor jse4=(JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0, +300)", " ");
		Thread.sleep(3000);
	}
		
	@Test(priority = 9)
	public void SSC_International_Holiday() throws Exception
	{
		
		//Click on International Holidays
		WebElement element = driver.findElement(By.xpath("//section/ul[3]/li[3]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[3]/li[3]/section[2]/a[1]")).click();
		Thread.sleep(3000);
		for (int i=0;i<2;i++)
		{
			WebElement year = driver.findElement(By.xpath("//*[@id='ih1']"));
			Select year1 = new Select(year);
			year1.selectByIndex(i);
			Thread.sleep(2000);
			for (int j=1; j<=12; j++)
			{
				driver.findElement(By.xpath("//*[@id='"+j+"_a']")).click();
				JavascriptExecutor jse4=(JavascriptExecutor) driver;
				jse4.executeScript("window.scrollBy(0, +200)", " ");
				Thread.sleep(2000);
			}
			
		}
		
		//View SSC Consolidations Office Closures
		driver.findElement(By.xpath("//div[5]/div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/a")).click();
		Thread.sleep(2000);
		
		for(int i = 1; i<=2 ; i++)
		{//6
			WebElement country = driver.findElement(By.xpath("//*[@id='cCountry']"));
			Select country1 = new Select(country);
			country1.selectByIndex(i);
			Thread.sleep(3000);
			
			for (int j=0; j<2; j++)
			{
				WebElement city = driver.findElement(By.xpath("//*[@id='cCity']"));
				Select city1 = new Select(city);
				city1.selectByIndex(j);
				Thread.sleep(3000);
			}
		}
		
		//Close Office CLosure
		//driver.findElement(By.xpath("//div[2]/div[1]/a")).click();
		
		//download holiday list in PDF
		//div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[1]
		
		//Download holiday list in csv
		//div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[2]
		
		//Download holiday list to email content
		//div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[3]
		
	}
		
	

	@Test(priority = 10)
	public void SSC_Ocean_Freight_Volume_Calculator() throws Exception
	{
		//Click on "Ocean Freight Volume Calculator"
		WebElement element = driver.findElement(By.xpath("//section/ul[4]/li[1]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[4]/li[1]/section[2]/a[1]")).click();
		Thread.sleep(3000);
		//Enter dimension calculator details
		driver.findElement(By.xpath(".//*[@id='quantity1']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='length1']")).sendKeys("15");
		driver.findElement(By.xpath(".//*[@id='width1']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='height1']")).sendKeys("15");
		
		for (int i=1; i<3; i++)
		{//5
			Thread.sleep(2000);
			WebElement frq = driver.findElement(By.xpath("//*[@id='uNit1']"));
			Select frq1 = new Select(frq);
			frq1.selectByIndex(i);
			Thread.sleep(1000);
		}
				
		driver.findElement(By.xpath(".//*[@id='addEm1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='quantity2']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='length2']")).sendKeys("18");
		driver.findElement(By.xpath(".//*[@id='width2']")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='height2']")).sendKeys("5");
		
		for (int i=1; i<3; i++)
		{//5
			Thread.sleep(2000);
			WebElement frq = driver.findElement(By.xpath("//*[@id='uNit2']"));
			Select frq1 = new Select(frq);
			frq1.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
							
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div[2]/div/input")).click();
		Thread.sleep(3000);
				
		//Enter Unit converter Lenght
		driver.findElement(By.xpath(".//*[@id='length']")).sendKeys("50");
		
		for (int i=0; i<2; i++)
			{//56
				Thread.sleep(1000);
				WebElement frq = driver.findElement(By.xpath("//*[@id='fclc1']"));
				Select frq1 = new Select(frq);
				frq1.selectByIndex(i);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div/div/div/table/tbody/tr[1]/td[4]/input")).click();
				Thread.sleep(1000);
			}
		
		//Enter Unit converter Weight
		driver.findElement(By.xpath(".//*[@id='weight']")).sendKeys("50");
		
		for (int i=0; i<2; i++)
		{//30
			Thread.sleep(1000);
			WebElement frq = driver.findElement(By.xpath("//*[@id='fclc2']"));
			Select frq1 = new Select(frq);
			frq1.selectByIndex(i);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/div/div/table/tbody/tr[2]/td[4]/input")).click();
			Thread.sleep(1000);
		}
		
		//Enter Unit converter Volume
		driver.findElement(By.xpath(".//*[@id='volume']")).sendKeys("60");
		
		for (int i=0; i<2; i++)
		{//30
			Thread.sleep(1000);
			WebElement frq = driver.findElement(By.xpath("//*[@id='fclc3']"));
			Select frq1 = new Select(frq);
			frq1.selectByIndex(i);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/div/div/table/tbody/tr[3]/td[4]/input")).click();
			Thread.sleep(1000);
		}
				
		//Enter Unit converter Temperature
		driver.findElement(By.xpath(".//*[@id='temperature']")).sendKeys("80");
		
		for (int i=0; i<2; i++)
		{//6
			Thread.sleep(1000);
			WebElement frq = driver.findElement(By.xpath("//*[@id='fclc4']"));
			Select frq1 = new Select(frq);
			frq1.selectByIndex(i);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/div/div/table/tbody/tr[4]/td[4]/input")).click();
			Thread.sleep(1000);
		}
		
	}
	
	@Test(priority = 11)
	public void SSC_Country_Restrictions() throws Exception
	{
		//Click on Country Restrictions
		WebElement element = driver.findElement(By.xpath("//section/ul[1]/li[3]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[1]/li[3]/section[2]/a[1]")).click();
		//Select Country Restriction -> select origin country name in drop down list
		WebElement Origincountry = driver.findElement(By.id("cr1"));
		Origincountry.sendKeys("United Kingdom");
		Thread.sleep(3000);
		//Select Country Restriction  -> select destination country name in drop down list
		WebElement DestinationCountry = driver.findElement(By.id("cr2"));
		DestinationCountry.sendKeys("Finland");
		Thread.sleep(3000);			
		//Select Country Restriction ->  select destination city name in drop down list
		WebElement DestinationCity = driver.findElement(By.id("cCity"));
		DestinationCity.sendKeys("VASA");
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 12)
	public void SSC_Dailing_Code() throws Exception
	{
		//Click on Dialling code
		WebElement element = driver.findElement(By.xpath("//section/ul[2]/li[2]/section[2]/a[1]"));
		HighlightMyElement(element);
		driver.findElement(By.xpath("//section/ul[2]/li[2]/section[2]/a[1]")).click();
		WebElement CountryDialling = driver.findElement(By.id("srCnt"));
		CountryDialling.clear();
		Thread.sleep(4000);
		//Enter UN Location code
		WebElement currencyhaveD = driver.findElement(By.id("lcode"));
		currencyhaveD.sendKeys("INBOM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'INBOM')]")).click();
		Thread.sleep(4000);
		currencyhaveD.clear();
		Thread.sleep(4000);
		//Emter Country Code
		WebElement CountryDialling1 = driver.findElement(By.id("srCnt"));
		CountryDialling1.sendKeys("United Arab Emirates");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'United Arab Emirates')]")).click();
		Thread.sleep(2000);
	}	

	@AfterMethod
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
	
}
