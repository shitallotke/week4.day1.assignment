package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockMarket {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL https://www.chittorgarh.com/
		driver.get(" https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		//Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		//Get all the Security names
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]/tbody//tr"));
		int rowsize = rows.size();
		System.out.println("No. of Security names : " + rowsize);
		
		List<String> inputList = new ArrayList<String>();
		for (int i = 1; i < rowsize; i++) {
			
			String security = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr["+i+"]/td[3]")).getText();
			inputList.add(security);

		}
			System.out.println("Security names List:");
			System.out.println(inputList);
			
		//Ensure whether there are duplicate Security names
		 Set inputSet = new HashSet(inputList);
		 int setsize = inputSet.size();
		 System.out.println("No. of Security names without duplicates : "+setsize);
        if(inputSet.size()< inputList.size()) {
        	System.out.println("Duplicates are available in the list");
        }
		else {
			System.out.println("No Duplicates in the list");
		}
        
	 
		
		
		

	}

}
