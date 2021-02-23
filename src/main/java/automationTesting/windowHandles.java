package automationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".blinkingText")).click();
       Set<String> windows= driver.getWindowHandles(); //[parentid,childid]
       Iterator<String> it=windows.iterator();
       String parentid=it.next();
       String childid=it.next();
       driver.switchTo().window(childid);
       String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       driver.switchTo().window(parentid);
       driver.findElement(By.id("username")).sendKeys(emailid);

	}

}
