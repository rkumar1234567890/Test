import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBarHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tahir\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("// input[@class='gLFyf']")).sendKeys("Car");
		driver.findElement(By.xpath("// input[@class='gLFyf']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
			js.executeScript("arguments[0].scrollIntoView(true);","");
		
		driver.close();

	}

}

