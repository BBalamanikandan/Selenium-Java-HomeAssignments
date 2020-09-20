package week2.day1.homeassignments;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(200);
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC Pvt Ltd.,");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ravi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sharma");

		Select sources=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		sources.selectByVisibleText("Employee");

		Select marketingCampaigns=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketingCampaigns.selectByValue("9001");

		Select industries=new Select(driver.findElementById("createLeadForm_industryEnumId"));
		List<WebElement> ind=industries.getOptions();
		industries.selectByIndex(ind.size()-2);
		
		Select coporations=new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		coporations.selectByIndex(5);

		driver.findElementByName("submitButton").click();
		Thread.sleep(200);
		System.out.println(driver.getTitle());


	}
}
