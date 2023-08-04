import basepackage.BaseClass;
import constantspackage.URLConstants;

public class BrowserInstantiationWithBaseClass {

	BaseClass baseClass = new BaseClass();

	public void launchGooglePagewithChromeBrowser() throws InterruptedException {

		baseClass.chromeBrowserInstantiation();
		baseClass.get(URLConstants.googlePageURL);
		Thread.sleep(10000);
		baseClass.close();

	}

	public void launchGooglePageWithFirefoxBrowser() throws InterruptedException {

		baseClass.firefoxBrowserInstantaiton();
		baseClass.get(URLConstants.googlePageURL);
		Thread.sleep(10000);
		baseClass.close();

	}

	public void launchGooglePageWithIEBrowser() throws InterruptedException {

		baseClass.ieBrowserInstantation();
		baseClass.get(URLConstants.googlePageURL);
		Thread.sleep(10000);
		baseClass.close();

	}

	public static void main(String[] args) throws InterruptedException {

		BrowserInstantiationWithBaseClass obj = new BrowserInstantiationWithBaseClass();

		obj.launchGooglePagewithChromeBrowser();

		obj.launchGooglePageWithFirefoxBrowser();

		obj.launchGooglePageWithIEBrowser();

	}

}
