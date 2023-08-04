package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import constantspackage.URLConstants;

public class BaseClass {

	WebDriver driver;

	public WebDriver chromeBrowserInstantiation() {

		System.setProperty(URLConstants.chromeDriverKey, URLConstants.projectPath + "//drivers//chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public WebDriver firefoxBrowserInstantaiton() {

		System.setProperty(URLConstants.firefoxDriverKey, URLConstants.projectPath + "//drivers//geckodriver.exe");

		driver = new FirefoxDriver();

		return driver;

	}

	public WebDriver ieBrowserInstantation() {

		System.setProperty(URLConstants.ieDriverKey, URLConstants.projectPath + "//drivers//IEDriverServer.exe");

		driver = new InternetExplorerDriver();

		return driver;

	}

	public void get(String url) {

		driver.get(url);

	}

	public void close() {
		driver.close();

	}

}
