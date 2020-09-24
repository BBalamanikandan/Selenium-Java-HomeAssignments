package week2.day2.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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

		driver.findElementByLinkText("Leads").click();
		Thread.sleep(200);

		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);

		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(200);

		driver.findElementByName("emailAddress").sendKeys("test");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(200);

		String name=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(200);

		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(200);

		String title=driver.getTitle();

		if (title.equals("Duplicate Lead"))
		System.out.println("Duplicate Lead page title is verified");

		driver.findElementByName("submitButton").click();
		Thread.sleep(200);

		String dupName=driver.findElementById("viewLead_firstName_sp").getText();

		if (dupName.equals(name))
		System.out.println("Duplicated first name is verified");

		driver.close();
	}

}
