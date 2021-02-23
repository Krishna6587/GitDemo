package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
	

	}

}
