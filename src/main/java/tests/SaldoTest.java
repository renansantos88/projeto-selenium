package main.java.tests;

import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends main.java.core.BaseTest {
	main.java.pages.HomePage page = new main.java.pages.HomePage();
	main.java.pages.MenuPage menu = new main.java.pages.MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(main.java.core.Propriedades.NOME_CONTA_ALTERADA));
	}
}
