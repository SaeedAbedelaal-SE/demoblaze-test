import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {

	WebDriver driver;
	WebDriver saeed;
	SoftAssert softassert = new SoftAssert() ;
	String myURL = "https://www.demoblaze.com/";

	@BeforeTest

	public void beforeStart() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(myURL);
		driver.manage().window().maximize();

	}

}
