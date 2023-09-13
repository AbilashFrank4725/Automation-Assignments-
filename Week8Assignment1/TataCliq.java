package Week8Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("Start-maximized", "--disable-notifications");
//		1.Lanuch the browser and Handle the Notification
		ChromeDriver driver = new ChromeDriver(option);

//		2.Maximize the window and add wait

//		3.Load the Url(https://www.tatacliq.com/)
		driver.get("https://www.tatacliq.com/");
//		4.MouseHover on Brands
		Actions builder = new Actions(driver);

		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		
		//WebElement watches = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[5]"));
//		Thread.sleep(4000);
//		WebElement lavie = driver.findElement(By.xpath("//a[text()='Lavie']"));
//		
		builder.moveToElement(brands).perform();
		//.pause(5000).moveToElement(watches).pause(2000)
		// .pause(4000).moveToElement(watches).pause(4000).click(lavie).perform();
//		5.click Watches & Accessories

//		6.Choose the first option from the Brand dispaly

//		7.Select sort by-New Arrivals
//		8.Click Men check box
//		9.Print all price of watches(take only numbers)
//		10.Print the watch price
//		11.click the second loaded result
//		12.Handle the window and Print the price of the watch
//		13.Compare two price and print Both price are equal
//		14.Click Add to Bag
//		15.Check the bag count
//		16.Click the cart bag
//		17.Take snapshot of result 
//		18.Close the open window
//		19.Close the browser

	}

}
