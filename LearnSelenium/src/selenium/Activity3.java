package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("jagan");
        
        driver.findElement(By.name("LastName")).sendKeys("Reddy");
        driver.findElement(By.name("Email")).sendKeys("Jaganreddy570@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Njr@9922");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Njr@9922");
        driver.findElement(By.id("register-button")).click();
        driver.close();
	}

}
