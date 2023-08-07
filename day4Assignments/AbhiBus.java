package week3.day4Assignments;

import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
	public static void main(String[] args) {
		
		// launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//launch url
		driver.get("https://www.abhibus.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Click bus
		driver.findElement(By.xpath("//*[@id=\"pills-home-tab\"]")).click();
		
		//type Chennai
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		
		//selct 1st one
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//type banglore
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		//driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		//select 1st pop up
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//selct next date
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[text()='7']")).click();
		
		//Click search
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		//get bus name
		WebElement busName = driver.findElements(By.xpath("//*[@id=\"result_1655595902\"]/div[2]/div[1]/h2"));
		
		String name1 = busName.getText();
		System.out.println(name1);
		
		//select sleeper
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		
		//print the resulting bus seats
		WebElement seats = driver.findElement(By.xpath("//p[text()='26 Seats Available']")).click();
		
		String name2 = seats.getText();
		System.out.println("Number of seats - "+ name2);
		
		//click select seat
		driver.findElement(By.className("book")).click();
		
		//select seat
		driver.findElement(By.xpath("//a[@id='UO3-5ZZ']")).click();
		
		//print seat and fare
		System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
		
		//select boarding point
		WebElement boardDD = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		Select BoardPoint = new Select(boardDD);
		BoardPoint.selectByIndex(4);
		
		//select arrival point
		WebElement arrivalDD = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select ArrivalPoint = new Select(arrivalDD);
		ArrivalPoint.selectByIndex(3);
		
		//get titlt
		driver.getTitle();
		
		driver.close();
		
	}

}
