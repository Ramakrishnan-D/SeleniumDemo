package selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Rail extends BrowserLaunch{
	
	@Test
	public void WebTablesWorking() throws InterruptedException {
		navigateToUrl("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT",Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MS",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(5000);
		List<WebElement> trainList = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr"));
		int rowCount = trainList.size();
		System.out.println(rowCount);
		System.out.println("``````");
		for(int i=2;i<=rowCount;i++) {
			String trainName = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr["+i+"]/td[1]/a")).getText();
			System.out.println(trainName);
		}		
	}

}
