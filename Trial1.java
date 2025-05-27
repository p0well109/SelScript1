package selScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Trial1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cxqui\\Downloads\\chromedriver.exe");	
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/cxqui/Downloads/chromedriver.exe");
		
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		//WebDriver methods + class methods
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();

		

	}

}
