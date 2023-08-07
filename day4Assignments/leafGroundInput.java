package week3.day4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGroundInput {
	public static void main(String[] args) {
		
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//get and launch url
		driver.get("http://www.leafground.com/input.xhtml");
		
		//maximize
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//input name
		driver.findElement(By.xpath("//input[@name = 'j_idt88:name']")).sendKeys("Abilash Frankin");
		
		//Input City
		driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt91\"]")).sendKeys("Chennai");
		
		//to verify the box is disabled
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).isEnabled(); // will return false
		
		//to clear tect
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
		//to get text
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]")).getText()); 
		
		//to enter email
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]")).sendKeys("godzilla@gmail.com");
		
		//to entert about yourself
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]")).sendKeys("Hey buddy. Lets learn selenium");
		
		//

	
		//close
		driver.close();
		
		
		
		
	
	}

	
	
}
