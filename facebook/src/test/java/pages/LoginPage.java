package pages;

import org.openqa.selenium.By;

import pageobject.PageObject;

public class LoginPage extends PageObject {

	private static final String URL_LOGIN = "https://www.facebook.com/";

	public LoginPage() {
		super(null);
		this.browser.navigate().to(URL_LOGIN);

	}

	public void preencherFormularioUsuarioSenha(String username, String pswd) {
		browser.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys(username);
		browser.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys(pswd);
		browser.findElement(By.cssSelector("button[data-testid='royal_login_button'")).click();
	}

	public boolean isUrlWelcome() {
		return browser.getCurrentUrl().equals(URL_LOGIN + "?sk=welcome");
	}

	public void quit() {
		browser.quit();
	}

}
