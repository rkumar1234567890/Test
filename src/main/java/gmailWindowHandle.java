import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailWindowHandle {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tahir\\Desktop\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		
		Set <String> t=driver.getWindowHandles();
		
		Iterator<String> s= t.iterator();
		
		String parent = s.next();
		String child= s.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

	}

}
