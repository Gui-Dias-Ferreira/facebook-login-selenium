package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

		browser.findElement(By.cssSelector("input[name='firstname']")).sendKeys("teste");
		browser.findElement(By.cssSelector("input[name='lastname']")).sendKeys("teste");
		browser.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("teste");
		browser.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("teste");

		WebElement selectElementDia = browser.findElement(By.cssSelector("select[id='day']"));
		Select selectDia = new Select(selectElementDia);

		WebElement vinteQuatro = browser.findElement(By.cssSelector("option[value='24']"));
		selectDia.selectByValue("24");
		Assertions.assertTrue(vinteQuatro.isSelected());

		WebElement selectElementMes = browser.findElement(By.cssSelector("select[id='month']"));
		Select selectMes = new Select(selectElementMes);

		WebElement mes = browser.findElement(By.cssSelector("option[value='7']"));
		selectMes.selectByValue("7");
		Assertions.assertTrue(!mes.isSelected());

		WebElement selectElementAno = browser.findElement(By.cssSelector("select[id='year']"));
		Select selectAno = new Select(selectElementAno);

		WebElement ano = browser.findElement(By.cssSelector("option[value='1999']"));
		selectAno.selectByValue("1999");
		Assertions.assertTrue(ano.isSelected());

		WebElement masculino = browser.findElement(By.cssSelector("input[value='2']"));
		masculino.click();

		// cadastre-se
		browser.findElement(By.cssSelector("button[name='websubmit']")).click();

	}
}
