package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemogoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("selenium");
        
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
        

	}

}
