package week2.day1.homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(200);
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Log Out").click();
		Thread.sleep(200);
		driver.close();
	}
}
