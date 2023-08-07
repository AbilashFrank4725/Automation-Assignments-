package week3.day4Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leafGroundSelects {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml");
	
	Select tool = new Select(driver.findElement(By.xpath("//option[text()='Select Tool']")));
	tool.selectByVisibleText("Puppeteer");
	
	Select country = new Select(driver.findElement(By.xpath("//label[text()='Select Country']")));
	country.selectByVisibleText("India");
	
	Select city = new Select (driver.findElement(By.xpath("//label[text()='Select City']")));
	city.selectByVisibleText();
	
	Select course = new Select(driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/ul/li")));
	
	Select language = new Select (driver.findElement(By.xpath("//option[text()='Select Language']")));
	language.selectByVisibleText("English");
	
	
	
	
	
	
}
}




//Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
//genre.selectBy("ANIMATION");