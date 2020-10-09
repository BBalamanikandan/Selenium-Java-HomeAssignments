package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElementByXPath("//button[@id='home']").click();
		Set<String> wndHdls;
		List<String> wndHdl;
		wndHdls=driver.getWindowHandles();
		wndHdl=new ArrayList<String>(wndHdls);
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		wndHdls=driver.getWindowHandles();
		wndHdl=new ArrayList<String>(wndHdls);
		int Cnt=wndHdl.size();
		System.out.println("Total number of windows: "+Cnt);
		driver.findElementByXPath("//button[text()='Do not close me ']").click();
		wndHdls=driver.getWindowHandles();
		wndHdl=new ArrayList<String>(wndHdls);
		int Count=wndHdl.size();
		for (int i=1;i<Count;i++){
		driver.switchTo().window(wndHdl.get(i));
		driver.close();
		}
		driver.switchTo().window(wndHdl.get(0));
		driver.findElementByXPath("(//button[@id='color'])[2]").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

}
