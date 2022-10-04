package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Page {
	public static void main(String[] args) {

		//Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();

		//Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		//Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Step 4: Maximize the window
		driver.manage().window().maximize();

		//Step 5: Add implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Step 6: Click on Create New Account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Karuppasamy");

		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ganapathy");

		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9021548120");

		// Step 10: Enter the password
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Test@123");

		//Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(8);

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1991");

		// Step 12: Select the radio button "Male"
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

}
