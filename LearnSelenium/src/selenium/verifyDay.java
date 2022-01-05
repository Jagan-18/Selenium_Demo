package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
		
		
		
		
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
        Select dy=new Select(day);
        List<WebElement>daycount=dy.getOptions();
        System.out.println(daycount.size());
        for(int i=0; i<daycount.size(); i++)
        {
        	System.out.println(daycount.get(i).getText());
        }
        dy.selectByIndex(18);

	}

}
