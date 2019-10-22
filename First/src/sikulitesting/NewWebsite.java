package sikulitesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class NewWebsite {
	
public static void main(String args[]) throws InterruptedException, FindFailed
{
	Screen screenobj=new Screen();
	Pattern img1=new Pattern("C:\\Users\\SRUTHI\\Desktop\\sikuli images\\first.png.sikuli\\1571650051530.png");
	Pattern img2=new Pattern("C:\\Users\\SRUTHI\\Desktop\\sikuli images\\first.png.sikuli\\1571650225907.png");
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zamzar.com/");
	driver.manage().window().maximize();
	
	//upload file
	 WebElement element=driver.findElement(By.xpath("//*[@id=\"uploader-tool-step-1\"]/div/div/p[1]/button"));
	 element.click();
	 Thread.sleep(2000);
	
	 screenobj.type(img1,"C:\\Users\\SRUTHI\\Desktop\\test1.xlsx");
	 Thread.sleep(2000);
	 
	 screenobj.click(img2);
	 
	
}
}
