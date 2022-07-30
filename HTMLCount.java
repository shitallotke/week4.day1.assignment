package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL  https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Get the count of number of rows ---table 1
		List<WebElement>  table1rows = driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowsize = table1rows.size();
		System.out.println("Table1 No. of rows: " +rowsize);
		
		//Get the count of number of rows ---table 2
		List<WebElement> table2rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int tab2row = table2rows.size();
		System.out.println("Table2 No. of rows: " +tab2row);
		
		// Get the count of number of columns---table 1
		 List<WebElement> table1columns = driver.findElements(By.xpath("(//table)[1]//th"));	
		 int columnsize = table1columns.size();
		 System.out.println("Table1 No.of columns: " +columnsize);
		 
		 // Get the count of number of columns---table 2
		 List<WebElement> table2columns = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		 int tab2column = table2columns.size();
		 System.out.println("Table2 No.of column: " +tab2column);
		 
		 
		

	}

}
