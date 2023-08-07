package week3.day4Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGroundRadio {

	public static void main(String[] args) {
		
		//launch browser and load url
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//maximize
		driver.manage().window().maximize();
		
		//slect your browser
		driver.findElement(By.xpath("//h5[text()='Your most favorite browser']")).click();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled();
		
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		
		driver.close();
		
		
		
		

	}

}
