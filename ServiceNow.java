package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser setup
				WebDriverManager.chromedriver().setup();
				//chrome browser driver
				ChromeDriver driver=new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//load app
				driver.get("https://dev68594.service-now.com/");
				//common wait 5 seconds to locate each element
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				//login
				driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
				driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
				driver.findElementById("sysverb_login").click();
				driver.findElementByXPath("//input[@id='filter']").sendKeys("incident");
				driver.findElementByXPath("//div[text()='All']").click();
				driver.findElementById("sysverb_new").click();
				driver.findElementById("lookup.incident.caller_id").click();

				Set<String> wndHdls;
				List<String> wndhdl;

				wndHdls=driver.getWindowHandles();
				wndhdl=new ArrayList<String>(wndHdls);

				driver.switchTo().window(wndhdl.get(wndhdl.size()-1));

				driver.findElementByXPath("//a[text()='Abel Tuter']").click();
				
				driver.switchTo().window(wndhdl.get(0));

				driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("service now incident test");
				String incNo=driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
				driver.findElementByName("not_important").click();

				driver.findElementByXPath("//div[@class='input-group']//input").sendKeys(incNo);
				driver.findElementByXPath("//div[@class='input-group']//input").sendKeys(Keys.ENTER);
				if(driver.findElementByXPath("//a[text()='"+incNo+"']").isDisplayed())
				System.out.println("Verification complete!");




	}

}
