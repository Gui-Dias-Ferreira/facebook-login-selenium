package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObject {

	protected WebDriver browser;

	public PageObject(WebDriver browser) {
		WebDriverManager.chromedriver().setup();

		if (browser == null) {
			this.browser = new ChromeDriver();
			this.browser.manage().window().maximize();
		} else {
			this.browser = browser;
		}
	}

	public void fechar() {
		this.browser.quit();
	}
}
