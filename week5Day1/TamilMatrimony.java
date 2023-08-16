package week5Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		
//Step 1: To open ChromeDriver
		ChromeDriver driver = new ChromeDriver();
//Step 2: Load the Application Url as 'https://www.tamilmatrimony.in/'
		driver.get("https://www.tamilmatrimony.in/");
//Step 3: Maximize the Browser
		driver.manage().window().maximize();
//Step 4: Select the Matrimony profile for YourSelf
		WebElement forDD = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select forDropDown = new Select(forDD);
		forDropDown.selectByVisibleText("Myself");		
//Step 5: Enter Name
		driver.findElement(By.xpath("//input[@id='NAME']"));
//Step 6: Click on Gender
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
//Step 7: Select your Date of Birth
		//date
		WebElement DateDD = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select DateDropDown = new Select(DateDD);
		DateDropDown.selectByIndex(25);
		//month
		Select month = new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
		month.selectByVisibleText("May");
		//WebElement monthDD = driver.findElement(By.xpath());
		//Select MonthDropDown = new Select(monthDD);
		//MonthDropDown.selectByVisibleText();
		//year
		Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
		year.selectByVisibleText("2000");
	//	WebElement yearDD = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		//Select YearDropDown = new Select(yearDD);
		//YearDropDown.selectByIndex(2000);
//Step 8: Select your Religion
		WebElement religionDD = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select RelDropDown = new Select(religionDD);
		RelDropDown.selectByVisibleText("Christian - Catholic");
//Step 10: Select your Mother Tongue
		//WebElement langDD = driver.findElement(By.xpath(""));
		//Select LangDropDown = new Select(langDD);
		//LangDropDown.selectByVisibleText();
		
		Select motherTongue = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
		motherTongue.selectByVisibleText("Tamil");
		
//Step 11: Select your country
		Select country = new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));
		country.selectByVisibleText("India");
		
//Step 12: Enter your MobileNumber
		Select countryCode = new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));
		countryCode.selectByVisibleText("+91");
		// mob number
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9444155035");
//Step 13: Enter your E-mail ID
		driver.findElement(By.xpath("//input[@id='EMAIL']"));
//Step 14: Close the Browser
		driver.close();

		 
	}

	

}
