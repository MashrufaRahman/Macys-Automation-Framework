package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePages;

public class BaseClass {
	public WebDriver driver;
	public HomePages homePages;

	@BeforeMethod
	public void setUp() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\mashr\\eclipse-workspace\\com.macys\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePages = new HomePages(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
