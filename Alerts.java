package week4.day2.homeassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser setup
				WebDriverManager.chromedriver().setup();
				//chrome browser driver
				ChromeDriver driver=new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//load app
				driver.get("http://leafground.com/pages/Alert.html");
				//common wait 5 seconds to locate each element
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElementByXPath("//button[text()='Alert Box']").click();

				Alert alt;

				alt=driver.switchTo().alert();
				alt.accept();

				driver.findElementByXPath("//button[text()='Confirm Box']").click();
				alt=driver.switchTo().alert();
				alt.dismiss();
				if(driver.findElementByXPath("//p[@id='result']").isDisplayed())
				System.out.println("verified result message!");

				driver.findElementByXPath("//button[text()='Prompt Box']").click();
				alt=driver.switchTo().alert();
				alt.accept();
				if(driver.findElementByXPath("//p[@id='result1']").isDisplayed())
				System.out.println("verified result message!");


				driver.findElementByXPath("//button[text()='Prompt Box']").click();
				alt=driver.switchTo().alert();
				alt.sendKeys("Test");
				alt.accept();
				if(driver.findElementByXPath("//p[@id='result1']").isDisplayed())
				System.out.println("verified result message!");

				driver.findElementByXPath("//button[text()='Prompt Box']").click();
				alt=driver.switchTo().alert();
				alt.dismiss();


				driver.findElementByXPath("//button[text()='Line Breaks?']").click();
				alt=driver.switchTo().alert();
				alt.accept();	

				driver.findElementByXPath("//button[text()='Sweet Alert']").click();
				driver.findElementByXPath("//button[text()='OK']").click();
				
				driver.close();
	}

}
