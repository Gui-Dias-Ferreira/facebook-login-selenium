package test.login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.NovaContaPage;

public class NovaContaTest {

	private NovaContaPage novaConta;
	
	@BeforeEach
	public void beforeEach() {
		this.novaConta = new NovaContaPage();
	}

	@AfterEach
	public void afterEach() {
		this.novaConta.fechar();
	}
	
	@Test
	public void deveriaClicarNoBotaoCriarNovaConta() {
		this.novaConta.clicarCriarNovaConta();
	}
}
