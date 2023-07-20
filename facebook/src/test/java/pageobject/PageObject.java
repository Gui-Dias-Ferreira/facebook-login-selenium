package pageobject;

import java.time.Duration;

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
		
//		espera o elemento aparecer pra ser localizado.
		this.browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void fechar() {
		this.browser.quit();
	}
}
