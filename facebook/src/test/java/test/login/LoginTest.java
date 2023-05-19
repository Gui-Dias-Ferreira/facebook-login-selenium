package test.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.login.LoginPage;

public class LoginTest {

	private LoginPage login;

	@BeforeEach
	public void beforeEach() {
		this.login = new LoginPage();
	}

	@AfterEach
	public void afterEach() {
		this.login.fechar();
	}

	@Test
	public void deveriaEfetuarLogin() {
		this.login.preencherFormularioUsuarioSenha("testeqa.automatizacao@outlook.com", "testeqa123456");
		Assert.assertTrue(this.login.isUrlWelcome());
	}

}
