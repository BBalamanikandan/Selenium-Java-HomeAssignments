package week4.day2.homeassignments;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		
		
		int rows=driver.findElementsByXPath("//table/tbody/tr/th").size();
		int cols=driver.findElementsByXPath("//table/tbody/tr").size();

		System.out.println("Table has "+rows+" Columns");
		System.out.println("Table has "+cols+" Rows");

		System.out.println("Learn to interact with elements progress: "+driver.findElementByXPath("//table//tr[3]/td[2]").getText());
			
		driver.findElementByXPath("//table//tr[4]/td[3]/input").click();
		System.out.println("Least progress learning marked as vital task");
		
		driver.close();
		
	}

}
