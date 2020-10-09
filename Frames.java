package week4.day2.homeassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement f1,f2,f3;
		f1=driver.findElementByXPath("//iframe");
		driver.switchTo().frame(f1);
		driver.findElementByXPath("//button[@id='Click']").click();
		driver.switchTo().defaultContent();
		f2=driver.findElementByXPath("(//iframe)[2]");
		driver.switchTo().frame(f2);
		f3=driver.findElementByXPath("//*[@id='frame2']");
		driver.switchTo().frame(f3);
		driver.findElementByXPath("//button[@id='Click1']").click();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElementsByXPath("//iframe").size());
	}

}
