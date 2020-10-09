package week4.day2.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser setup
		WebDriverManager.chromedriver().setup();
		//chrome browser driver
		ChromeDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//load app
		driver.get("http://leaftaps.com/opentaps/control/main");
		//common wait 5 seconds to locate each element
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login
		driver.findElementByName("USERNAME").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//merge lead navigation
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		//child window1
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> wndHdls;
		List<String> wndHdl;
		wndHdls=driver.getWindowHandles();
		wndHdl=new ArrayList<String>(wndHdls);
		driver.switchTo().window(wndHdl.get(wndHdl.size()-1));
		driver.findElementByXPath("//input").sendKeys("10033");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='10033']").click();
		//switch back parent
		driver.switchTo().window(wndHdl.get(0));
		//child window2
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		wndHdls=driver.getWindowHandles();
		wndHdl=new ArrayList<String>(wndHdls);
		driver.switchTo().window(wndHdl.get(wndHdl.size()-1));
		driver.findElementByXPath("//input").sendKeys("10034");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='10034']").click();
		//switch back parent
		driver.switchTo().window(wndHdl.get(0));
		//merge and accept
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		//find and verify
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys("10033");		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		if(driver.findElementByXPath("//div[text()='No records to display']").isDisplayed()) {
			System.out.println("No Records to display is verified!");
		}
		//close browser
		driver.close();
	}

}
