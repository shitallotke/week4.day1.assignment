package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Get the count of number of rows
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		int rowsize = row.size();
		System.out.println("Count of number of rows: " +rowsize);
		
		//Get the count of number of columns
		List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]/th"));
		int columnsize = column.size();
		System.out.println("Count of number of columns: " +columnsize);
		
		//Get the progress value of 'Learn to interact with Elements'
		System.out.println("Progress value of Learn to interact with Elements:");
		
		for(int i=3;i<=rowsize-1;i++) {
			for(int j=1;j<=columnsize;j++) {
			String data =	driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(data + " ");
			}
			System.out.println();
		}
			
			
	
		
		
		
		

	}

}
