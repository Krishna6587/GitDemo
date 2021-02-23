package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chromeOptions_SSL {

	public static void main(String[] args) {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\New folder\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(c);
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
	}

}
