import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandale {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tahir\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle();
			if(!t.contains("DEMOQA")) 
			{
				driver.close();
			}
		}
	}

}
