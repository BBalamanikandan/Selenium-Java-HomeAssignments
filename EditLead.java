package week2.day2.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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

		driver.findElementByXPath("//form/div/div[2]/div/div/div/div/div[2]/div[1]/input").sendKeys("Ravi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(200);

		driver.findElementByLinkText("10027").click();
		Thread.sleep(2000);

		System.out.println("Title: "+driver.getTitle());

		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(200);

		driver.findElementById("updateLeadForm_companyName").sendKeys("updated name");
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(200);

		System.out.println("Updated company value: "+driver.findElementById("viewLead_companyName_sp").getAttribute("value"));
		driver.close();


	}

}
