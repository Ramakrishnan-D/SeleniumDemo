package selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OceanAcademy extends BrowserLaunch{
	
	@Test
	public void printCorseDetails() throws InterruptedException {
		navigateToUrl("https://oceanacademy.co.in/");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@id='root']/div[1]/div")).click();
		
		WebElement courses = driver.findElement(By.id("courses"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(courses).perform();
		
		WebElement offlineCourses = driver.findElement(By.xpath("//a[text()='Offline Courses']"));
		
		
		String firstCourseName = driver.findElement(By.xpath("(//p[@class='title'])[1]")).getText();
		System.out.println(firstCourseName);
		
		System.out.println("~~~~~~~~~~");
		List<WebElement> courseNameList = driver.findElements(By.xpath("//p[@class='title']"));
		for (WebElement indiCourse : courseNameList) {
			System.out.println(indiCourse.getText());
		}actionObj.moveToElement(offlineCourses).click().build().perform();
	}
}
