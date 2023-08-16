package week5Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("https://en-gb.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click create acc button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abilash");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Franklin");
		//enter Mobile Number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9444155035");
		//enter password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("letsroll");
		
		
		//date DD
		WebElement dateDD = driver.findElement(By.xpath("//select[@id='day']"));
		//selct drop down
		Select dateDropDown = new Select(dateDD);
		//select by idex
		dateDropDown.selectByIndex(24);
		
		
		//select month
		WebElement monthDD = driver.findElement(By.xpath("//select[@id='month']"));
		//select drop down
		Select monthDropDown = new Select(monthDD);
		//selct by visible index
		monthDropDown.selectByVisibleText("May");
		
		//year dd
		WebElement yearDD = driver.findElement(By.xpath("//select[@id='year']"));
		//select drop down
		Select yearDropDown = new Select(yearDD);
		//Select by value
		yearDropDown.selectByValue("2000");
		
		//check box for fermale
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		// to submit
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		//CLOSE DRIVER
		driver.close();
		}
	}



