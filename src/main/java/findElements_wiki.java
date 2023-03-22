import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_wiki {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SAP\\Personal\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		List <WebElement> wiki=driver.findElements(By.xpath("//div[@class='central-featured']//a"));
		System.out.println(wiki.size());
		
		for(int i=0;i<wiki.size();i++)
		{
			System.out.println(wiki.get(i).getText());
		}
	}

}
