package week3.day4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		//launch browser and get url
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//maximize and wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//send bags in search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		
		//click search
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//print number of results
		System.out.println(driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']")).getText());
		
		//select first 2 brands
		WebElement bagDD = driver.findElement(null)
		
	}

}






/*
//slect first pop up
WebElement placeDD = driver.findElement(By.id("source"));
Select placeDropDown = new Select(placeDD);
placeDropDown.selectByIndex(1);
*/