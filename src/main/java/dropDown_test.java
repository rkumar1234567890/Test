import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SAP\\Personal\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		
		Select s=new Select(drop);
		
		s.selectByIndex(7);
		Thread.sleep(3000);
		s.selectByValue("ast");
		Thread.sleep(3000);
		s.selectByVisibleText("Galego");
		
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='central-featured']"));
		
			for(WebElement stl:lst) {
				
				String st=stl.getText();
				System.out.println(st);
				Thread.sleep(2000);
				driver.close();
			}
		

	}

}
