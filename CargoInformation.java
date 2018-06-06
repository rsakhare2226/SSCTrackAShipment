package sscOnlineDraftTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CargoInformation {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rahul Back UP\\Selenium_RSS\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://awswwwstaginga.sscconsolidation.com/index.php");	
		//Click on 'Sitemap' link
		driver.findElement(By.xpath("html/body/section/footer/div/div/aside[1]/nav/a[7]")).click();
		
		/*
		 * ***********************************************************************
		 * Done**********************************************************************
		 * 
		 * 
		 * 
		
		//Click on  UN Location codes
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[2]/span[4]/a")).click(); 
		WebElement UNcode1 = driver.findElement(By.id("locationCode"));
		UNcode1.clear();
		UNcode1.sendKeys("USNYC");
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(3000);
		//Select country name in drop down list
		WebElement country = driver.findElement(By.id("cCountry"));
		country.sendKeys("United Arab Emirates");
		Thread.sleep(3000);
		//Select country name in drop down list
		WebElement city = driver.findElement(By.id("cCity"));
		city.sendKeys("Jebel Ali");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div[2]/div[1]/table/tbody/tr/td[6]/input")).click();
		Thread.sleep(3000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		//Click on CFS Finder
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[2]/a")).click();
		WebElement currencyhaveT = driver.findElement(By.id("portcode"));
		currencyhaveT.clear();
		currencyhaveT.sendKeys("USNYC");
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='googleMap']/div/div/button")).click();
		Thread.sleep(4000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		//Click on Global Wather
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[5]/a")).click();
		WebElement FavoriteLocation = driver.findElement(By.id("gwCity"));
		FavoriteLocation.sendKeys("New York");
		driver.findElement(By.xpath("//a[contains(text(),'New York')]")).click();
		Thread.sleep(4000);
		FavoriteLocation.clear();
		driver.close();
		
		//Click on Hazardous Information
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[6]/a")).click();
		Thread.sleep(20000);
		WebElement HazMaterial = driver.findElement(By.id("bt1"));
		HazMaterial.sendKeys("Flammable Solids (4.1)");
		Thread.sleep(2000);
		//Click on the 'Hazardous Chart'link
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[1]/a")).click();
		Thread.sleep(2000);
		//Navigate Browser back button
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 //Click on Word Time Zone 
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[8]/a")).click();
		//Enter country code in text box as INBOM
		WebElement WorldTimeZone = driver.findElement(By.id("origin"));
		WorldTimeZone.sendKeys("INBOM");
		driver.findElement(By.xpath("//a[contains(text(),'INBOM')]")).click();
		Thread.sleep(2000);
		WorldTimeZone.clear();
		Thread.sleep(2000);
		//Enter country code in text box as USNYC
		WebElement WorldTimeZone1 = driver.findElement(By.id("origin"));
		WorldTimeZone1.sendKeys("USNYC");
		driver.findElement(By.xpath("//a[contains(text(),'USNYC')]")).click();
		Thread.sleep(2000);
		WorldTimeZone1.clear();
		Thread.sleep(2000);
		//Set Newyork as home
		driver.findElement(By.xpath(".//*[@id='wtr-home_id_3']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
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
		
		
		//Clicks on Shipping Glossary
			driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[2]/span[5]/a")).click();
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
			driver.findElement(By.xpath("//a[contains(text(),'Unit Cost')]")).click();
			Thread.sleep(3000);
			//Click on search button
			driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[2]/div[1]/table/tbody/tr/td[2]/input[3]")).click();
			Thread.sleep(4000);
			//Navigate Browser back button
			driver.navigate().back();
			Thread.sleep(3000);
			
			
			//Click on Agents
				driver.findElement(By.xpath(".//*[@id='search']")).click();
				Thread.sleep(1000);
				//Click on Show link
				driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/div/table/tbody/tr/td[1]/div/table/tbody/tr[1]/td[2]/a")).click();
				Thread.sleep(1000);
				
				
					//Click on Contacts
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[2]/div/ul/li[1]/span[2]/a")).click();
		//Click on expand arrow
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[2]/a")).click();
		Thread.sleep(1000);
		//Click on Show link
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[3]/table/tbody/tr[1]/td/div/a")).click();
		Thread.sleep(1000);
		//Click on Show Details
		driver.findElement(By.xpath(".//*[@id='Antwerp18']")).click();
		Thread.sleep(1000);
		//Click on Hide Details
		driver.findElement(By.xpath(".//*[@id='Antwerp18']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[1]/div/div[3]/table/tbody/tr[1]/td/div/a")).click();
		Thread.sleep(1000);
		//Enter Quick Find text
		WebElement QuickFindtext = driver.findElement(By.id("search"));
		QuickFindtext.sendKeys("Dubai");
		driver.findElement(By.xpath("//a[contains(text(),'Dubai')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//CUrrency Converter
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[2]/span[2]/a")).click();
		//Select Container specification name in drop down list
		WebElement currencyhave = driver.findElement(By.id("origin"));
		currencyhave.clear();
		currencyhave.sendKeys("USD");
		driver.findElement(By.xpath("//a[contains(text(),'USD')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='currencyfrom']")).sendKeys("115");
		//Enter Currency I want 
		WebElement currencywant = driver.findElement(By.id("originwant"));
		currencywant.clear();
		currencywant.sendKeys("INR");
		driver.findElement(By.xpath("//a[contains(text(),'INR')]")).click();
		//Click on Calculate button
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[1]")).click();
		Thread.sleep(5000);
		//enterchange the currency
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div/div/div[2]/a")).click();
		Thread.sleep(5000);
		//Click on Reset button
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[2]")).click();
		Thread.sleep(1000);
		//Click on Calender
		driver.findElement(By.xpath(".//*[@id='from_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a")).click();
		Thread.sleep(3000);
		//Select Container specification name in drop down list
		WebElement currencyhave1 = driver.findElement(By.id("origin"));
		currencyhave1.clear();
		currencyhave1.sendKeys("EUR");
		driver.findElement(By.xpath("//a[contains(text(),'EUR')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='currencyfrom']")).sendKeys("18.90");
		//Enter Currency I want 
		WebElement currencywant1 = driver.findElement(By.id("originwant"));
		currencywant1.clear();
		currencywant1.sendKeys("GBP");
		driver.findElement(By.xpath("//a[contains(text(),'GBP')]")).click();
		//Click on Calculate button
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div/div/div[6]/input[1]")).click();
		Thread.sleep(5000);
		//enterchange the currency
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[3]/div/div/div/div/div[2]/a")).click();
		Thread.sleep(5000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		//Inco Terms
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[2]/span[3]/a")).click();
		//Select Incotermns name in drop down list
		WebElement element3 = driver.findElement(By.id("bt1"));
		element3.sendKeys("CIP - Carriage & Insurance Paid To");
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[2]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[2]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[3]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[3]/div[1]/a")).click();
		Thread.sleep(3000);
		//Click on Contact Us Link
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[1]/div[3]/div[6]/span/a")).click();
		Thread.sleep(3000);
		
		
		//Click on International Holidays
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[7]/a")).click();
		Thread.sleep(2000);
		WebElement HolidayYear = driver.findElement(By.id("ih1"));
		HolidayYear.sendKeys("2017");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='5_a']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/span/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		
		//Click on 	View SSC Consolidation’s office closures
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[1]/div/div[1]/div/table/tbody/tr/td[6]/a")).click();
		Thread.sleep(2000);
		//Select Office closure Country name
		WebElement OfficeCountry = driver.findElement(By.id("cCountry"));
		OfficeCountry.sendKeys("United Arab Emirates");
		Thread.sleep(2000);
		//Select Office closure city name
		WebElement OfficeCity = driver.findElement(By.id("cCity"));
		OfficeCity.sendKeys("Dubai");
		Thread.sleep(2000);	
		//Close SSC Office closure pop up
		driver.findElement(By.xpath("html/body/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Click on 'Surcharges' link
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[1]/div[2]/div/ul/li/a")).click();
		Thread.sleep(2000);
		//Click on Download Link
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[1]/div/div/table/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(2000);
		//Click on View Link
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[1]/div/div/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);
		//Download PDF
		driver.findElement(By.xpath(".//*[@id='ui-id-1']/div/div/a[1]")).click();
		Thread.sleep(3000);
		//Click on email icon
		driver.findElement(By.xpath(".//*[@id='ui-id-1']/div/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='cEmailto']")).sendKeys("Surcharges Test Email text");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='cEmailID']")).sendKeys("pyeole@shipco.com");
		Thread.sleep(2000);
		//Click on Send Mail button
		driver.findElement(By.xpath(".//*[@id='sendMail']/div/div/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);
		//Close pop up icon
		driver.findElement(By.xpath("html/body/div[9]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[8]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[6]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Click on "Ocean Freight Volume Calculator"
		driver.findElement(By.xpath("//div[2]/div[1]/div/ul/li[1]/span[3]/a")).click();
		Thread.sleep(3000);
		//Enter dimension calculator details
		driver.findElement(By.xpath(".//*[@id='quantity1']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='length1']")).sendKeys("15");
		driver.findElement(By.xpath(".//*[@id='width1']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='height1']")).sendKeys("15");
		WebElement Unit = driver.findElement(By.id("uNit1"));
		Unit.sendKeys("Centimeter");
		driver.findElement(By.xpath(".//*[@id='addEm1']")).click();
		driver.findElement(By.xpath(".//*[@id='quantity2']")).sendKeys("20");
		driver.findElement(By.xpath(".//*[@id='length2']")).sendKeys("18");
		driver.findElement(By.xpath(".//*[@id='width2']")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='height2']")).sendKeys("5");
		WebElement Unit1 = driver.findElement(By.id("uNit2"));
		Unit1.sendKeys("Feet");
		Thread.sleep(5000);
		
		for (int i=1;i<=10;i++)
		{
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[2]/div/div[i]/div[1]/a")).click();
		}
		
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div[2]/div/input")).click();
		Thread.sleep(3000);
		//Enter Unit converter Lenght
		driver.findElement(By.xpath(".//*[@id='length']")).sendKeys("50");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[3]/div/div/div/table/tbody/tr[1]/td[4]/input")).click();
		Thread.sleep(3000);
		//Enter Unit converter Weight
		driver.findElement(By.xpath(".//*[@id='weight']")).sendKeys("50");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[3]/div/div/div/table/tbody/tr[2]/td[4]/input")).click();
		Thread.sleep(3000);
		//Enter Unit converter Volume
		driver.findElement(By.xpath(".//*[@id='volume']")).sendKeys("60");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[3]/div/div/div/table/tbody/tr[3]/td[4]/input")).click();
		Thread.sleep(3000);
		//Enter Unit converter Temperature
		driver.findElement(By.xpath(".//*[@id='temperature']")).sendKeys("80");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[3]/div/div/div/table/tbody/tr[4]/td[4]/input")).click();
		Thread.sleep(3000);
		 
		//Click on Country Restrictions
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[3]/a")).click();
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
		Thread.sleep(5000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		//Click on Dialling code
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/ul/li[3]/span[4]/a")).click();
		WebElement CountryDialling = driver.findElement(By.id("srCnt"));
		CountryDialling.clear();
		Thread.sleep(4000);
		//Enter UN Location code
		WebElement currencyhaveD = driver.findElement(By.id("lcode"));
		currencyhaveD.sendKeys("INBOM");
		driver.findElement(By.xpath("//a[contains(text(),'INBOM')]")).click();
		Thread.sleep(4000);
		currencyhaveD.clear();
		Thread.sleep(4000);
		//Emter Country Code
		WebElement CountryDialling1 = driver.findElement(By.id("srCnt"));
		CountryDialling1.sendKeys("United Arab Emirates");
		driver.findElement(By.xpath("//a[contains(text(),'United Arab Emirates')]")).click();
		Thread.sleep(4000);
		//Navigate Browser back button
		driver.navigate().back();
		Thread.sleep(3000);
		 
		 
		 Done**********************************************************************
		*/
		
		
		
		
		
		
		
		
		
		
		
			
		//Click on NEWS 
		driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[2]/div/ul/li[1]/span[1]/a")).click();
		Thread.sleep(2000);
		//Select Year in drop down
		WebElement NewsViewPerPage = driver.findElement(By.xpath(".//*[@id='entries_per_page']"));
		NewsViewPerPage.sendKeys("50");
		driver.findElement(By.xpath("//a[contains(text(),'50')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[1]/input")).click();
		
	
		
		
		
		
		

		
		
	}

}
