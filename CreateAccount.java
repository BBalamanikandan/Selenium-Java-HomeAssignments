package week2.day1.homeassignments;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(200);
		
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(200);

		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(200);
		
		driver.findElementByLinkText("Create Account").click();
		Thread.sleep(200);
		
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account");
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("LocalTestName");
		driver.findElementByXPath("//input[@name='officeSiteName']").sendKeys("Site Test Name");
		driver.findElementByXPath("//input[@class='inputBox' and @name='annualRevenue']").sendKeys("5.75L");
		
		Select industry=new Select(driver.findElementByName("industryEnumId"));
		industry.selectByIndex(3);
		
		Select ownership=new Select(driver.findElementByName("ownershipEnumId"));
		ownership.selectByVisibleText("S-Corporation");
		
		Select source=new Select(driver.findElementById("dataSourceId"));
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select marketingCampaign=new Select(driver.findElementById("marketingCampaignId"));
		marketingCampaign.selectByIndex(6);
		
		Thread.sleep(200);
		
		Select state=new Select(driver.findElementById("generalStateProvinceGeoId"));
		state.selectByValue("TX");
		
		driver.findElementByXPath("//input[@type='submit']").click();
	}

}
