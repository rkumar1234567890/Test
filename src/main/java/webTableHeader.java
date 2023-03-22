import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableHeader {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SAP\\Personal\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		
		List <WebElement> wb=driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		 System.out.println(wb.size());
		 
		 for(WebElement ele:wb)
		 {
			String value= ele.getText();
			System.out.println(value);
		 }
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 //driver.quit();
	}

}
