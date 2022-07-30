package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore");
		driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai");
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[7]/td[7]")).click();
		
		//driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[7]td[6]")).click();
		String title = driver.getTitle();
		System.out.println("Title : " +title);
	}

}
