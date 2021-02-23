package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        List <WebElement> dates=driver.findElements(By.className("ui-state-default"));
        System.out.println(dates);
        int count=driver.findElements(By.className("ui-state-default")).size();
        for(int i=0;i<count;i++) 
        {
        	String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
        	if(text.equalsIgnoreCase("25")) 
        	{
        	   driver.findElements(By.className("ui-state-default")).get(i).click();	
        	}
        }
        
        /*driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
        {
        	System.out.println("Its disabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }*/
        
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByValue("3");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
