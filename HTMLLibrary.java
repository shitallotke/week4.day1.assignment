package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLLibrary {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> columns = driver.findElements(By.xpath("(//table)[1]//th"));	
		 int columnsize = columns.size();
		 
		List<String> library1 = new ArrayList<String>();
		for (int i = 1; i < columnsize+1; i++) {
		String value1 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[1]/td["+i+"]")).getText();
		library1.add(value1);
		
		}
		System.out.print("Market Share : " );
		System.out.print(library1);
		
		List<String> library2 = new ArrayList<String>();
		for (int j = 1; j < columnsize+1; j++) {
		String value2 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td["+j+"]")).getText();
		library2.add(value2);
		}
		System.out.print("\n" + "Absolute Usage : " );
		System.out.print(library2);
		
	}

}
