package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public void preencherCadastreSe() {
		By locator = By.cssSelector("input[name='firstname']");
		
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement nomeInput = browser.findElement(locator);
		
		browser.findElement(locator).sendKeys("teste");
//		browser.findElement(By.name("firstname")).sendKeys("teste");
	}
}
