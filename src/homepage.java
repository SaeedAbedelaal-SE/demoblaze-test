import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class homepage extends parameters {

//	@Test 
//	
//	public void get_title_test() {
//		
//		String actual_title = driver.getTitle();
//		String Expected_title = "STORE" ;
//		softassert.assertEquals(actual_title, Expected_title);
//		softassert.assertAll();
//		
//	}
//	
//	@Test 
//	public void images_test() {
//		
//		List<WebElement> images = driver.findElements(By.className("img-fluid"));
//		
//		String src1 = images.get(0).getAttribute("src") ;
//		String src2 = images.get(1).getAttribute("src") ;
//		String src3 = images.get(2).getAttribute("src") ;
//		
//		boolean myImageCheck1 = src1 != src2 ;
//		boolean myImageCheck2 = src2 != src3 ;
//		boolean myImageCheck3 = src1 != src3 ;
//		
//		softassert.assertEquals(myImageCheck1, true);
//		softassert.assertEquals(myImageCheck2, true);
//		softassert.assertEquals(myImageCheck3, true);
//		
//		
//		softassert.assertAll();
//	}

	@Test(invocationCount = 3)
	public void About_page() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		String emails[] = { "9a@gmailedu", "uu887@gmail", "alaa@gmail.ps" };

		Random random = new Random();
		int index = random.nextInt(3);

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys(emails[index]);
		String value = driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).getAttribute("value");

		String Regex = "^(.+)@(.+)+.+(.+)$";

		Pattern pattern = Pattern.compile(Regex);

		Matcher matcher = pattern.matcher(emails[index]);

		System.out.println(emails[index] + "  is valid email " + matcher.matches());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[1]/button/span")).click();

	}

}
