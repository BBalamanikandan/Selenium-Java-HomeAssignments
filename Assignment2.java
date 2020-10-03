package week4.day1.homeasssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(20000);
		// to get into frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dst = driver.findElementByXPath("//div[@id='droppable']");
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dst).perform();
		driver.close();
	}

}
