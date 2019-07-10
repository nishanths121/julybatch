package flip1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\nishanth\\flip1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement s1=driver.findElement(By.id("twotabsearchtextbox"));
		s1.sendKeys("one plus 7 pro");
		WebElement s11=driver.findElement(By.xpath("//input[@class='nav-input']"));
		s11.click();
		WebElement s111=driver.findElement(By.xpath("//input[@class='a-size-medium a-color-base a-text-normal']"));
		s111.click();
		WebElement ss1=driver.findElement(By.id("buy-now-button"));
		ss1.click();
		WebElement sa1=driver.findElement(By.id("ap_email"));
		sa1.sendKeys("abcd@gmail.com");
		WebElement sa11=driver.findElement(By.id("ap_password"));
		sa11.sendKeys("123456789");
		WebElement sa111=driver.findElement(By.id("signInSubmit"));
		sa111.click();	
		
		
		driver.quit();
	}

}
