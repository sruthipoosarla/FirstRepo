package sikulitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver = new  ChromeDriver();
		 driver.get("https://www.gmail.com");
		 driver.manage().window().maximize();

		 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sruthi.poosarla@gmail.com");
		 driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("nannagaru");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=':ce']/div/div")).click();
		Thread.sleep(2000);
		/*
		//recipient
		driver.findElement(By.xpath("//*[@id=\":hv\"]")).sendKeys("sruthipapa23@gmail.com");
		 
		
		 //Subject
		 driver.findElement(By.xpath("//*[@id=\":hf\"]")).sendKeys("Meterials");
		 Thread.sleep(2000);
		 	 */
		 //Attachment
		 driver.findElement(By.xpath("//*[@id=\":j6\"]")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\":jf.ep\"]/button[12]/span/div")).click();
		
	}
}