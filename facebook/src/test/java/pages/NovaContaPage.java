package pages;

import org.openqa.selenium.By;

import pageobject.PageObject;

public class NovaContaPage extends PageObject {

	private static final String URL_FACEBOOK = "https://www.facebook.com/";

	public NovaContaPage() {
		super(null);
		this.browser.navigate().to(URL_FACEBOOK);
	}
	
	public void clicarCriarNovaConta() {
		browser.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
	}
	
	
	
	public void quit() {
		browser.quit();
	}
}
