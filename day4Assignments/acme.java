package week3.day4Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class acme {
	public static void main(String[] args) {
		
	    //Launch browser
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("https://acme-test.uipath.com/login");
		//maxzimize
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter mail
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		//click login
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//get title
		System.out.println("Title: " + driver.getTitle());      
		//log out
		driver.findElement(By.linkText("Log Out")).click();
		//close driver
		driver.close();
			
	}	
	}




/*
1. Load url "https://acme-test.uipath.com/login"
2. Enter email as "kumar.testleaf@gmail.com"
3. Enter Password as "leaf@12"
4. Click login button
5. Get the title of the page and print
6. Click on Log Out
7. Close the browser (use -driver.close())
*/