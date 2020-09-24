package week2.day2.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		driver.findElementByXPath("//span[text()='Phone']").click();
		Thread.sleep(200);
		driver.findElementByName("//input[@name='phoneNumber']").sendKeys("999");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(200);

		
		String id=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(200);

		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(200);

		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(200);

		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(200);

		boolean noRec=driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();

		if(noRec)
		System.out.println("No Records to Display presence is verified");

		driver.close();


	}

}
