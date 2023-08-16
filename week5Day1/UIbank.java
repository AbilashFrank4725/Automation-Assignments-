package week5Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIbank {
	public static void main(String[] args) {
		//Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Step 2: Load the Application Url as 'https://uibank.uipath.com/register-account'
		driver.get("https://uibank.uipath.com/register-account");
		//Step 3: Maximize the Browser
		driver.manage().window().maximize();
		
		//Step 4: Enter your name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abilash");
		//Step 5: Select your title
		Select title = new Select(driver.findElement(By.xpath("//select[@id='title']")));
		title.selectByVisibleText("Mr");
		//Step 6: Enter your Initial
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(" ");
		//Step 7: Enter your Last Name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Franklin");
		//Step 8: Select Gender
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='sex']")));
		gender.selectByVisibleText("Male");
		//Step 9: Select   Employment Status by using selectByVisibleText()
		Select empStatus =  new Select(driver.findElement(By.xpath("//select[@id='employmentStatus']")));
		empStatus.selectByVisibleText("Unemployed");
		//Step 10: Enter your name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("AbilashFranklin");
		//Step 11: Enter your EmailAddress
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("godzilla@gmail.com");
		//Step 12: Enter your Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		//Step 13: Close your Browser
		driver.close();
	}

}
