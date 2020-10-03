package week4.day1.homeasssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/sortable/");
	Thread.sleep(20000);

	// to get into frame
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	WebElement src = driver.findElementByXPath("//ul[@id='sortable']/li");
	WebElement dst = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
	
	int x=dst.getLocation().getX();
	int y=dst.getLocation().getY();
	
	
	Actions act=new Actions(driver);
	act.dragAndDropBy(src, x, y).perform();
	
	driver.close();
	
	}
}
