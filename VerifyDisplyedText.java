package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDisplyedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:/Files for selenium/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize();
		
		WebElement element=driver1.findElement(By.xpath("//span[text()='Create an account']"));
		Boolean status= element.isDisplayed();
		
		if (status==true) {
			System.out.println("Element is Displayed");
			
		} else {
		
			System.out.println("Element is not Displayed");

		}
	driver1.close();	
	
	}

}
