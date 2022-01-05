package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String expectedtitle="Demo Web Shop";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		String actualsrc=driver.getPageSource();
		System.out.println(actualsrc);
		
		driver.close();
	}

}
