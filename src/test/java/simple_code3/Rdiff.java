package simple_code3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Rdiff {
	public static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
		

	}


}
