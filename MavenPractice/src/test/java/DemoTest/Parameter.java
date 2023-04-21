package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	@Test
	public void display() {
	
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.print(BROWSER);
		System.out.println(URL);
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		
	}
}
