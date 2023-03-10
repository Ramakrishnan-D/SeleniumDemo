package selenium.learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LambdaTest {

	@Test
	public void registerTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	driver.findElement(By.id("input-firstname")).sendKeys("Mohammadu");
	driver.findElement(By.id("input-lastname")).sendKeys("Ijas");
	driver.findElement(By.id("input-email")).sendKeys("ijas@gmail.com");
	driver.findElement(By.id("input-telephone")).sendKeys("976544577644");
	driver.findElement(By.id("input-password")).sendKeys("ijass");
	driver.findElement(By.id("input-confirm")).sendKeys("ijass");

	driver.findElement(By.xpath("//label[@for='input-newsletter-no']")).click();
	driver.findElement(By.xpath("//label[@for='input-agree']")).click();
	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	}
	
	@Test
	public void xpathLocator() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		driver.findElement(By.xpath("//label[@for='input-agree']")).click();
	}
}
