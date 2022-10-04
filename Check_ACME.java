package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_ACME {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");

		//Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");

		//Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		//Click login button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		//Get the title of the page and print
		System.out.println(driver.getTitle());

		//Click on Log Out
		driver.findElement(By.linkText("Log Out")).click();

		//Close the browser (use -driver.close())
		Thread.sleep(2000);
		driver.close();
	}

}
