package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
        
        Alert alt1=driver.switchTo().alert();
        String alertmessage=driver.switchTo().alert().getText();
        System.out.println(alertmessage);
        
        alt1.accept();
        
        
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
          
        Alert alt2=driver.switchTo().alert();
        String alertmessage2=driver.switchTo().alert().getText();
        System.out.println(alertmessage2);
        alt2.dismiss();
        
        
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        
        
        Alert alt3= driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("selenium");
        alt3.accept();
        
       
        

	}

}
