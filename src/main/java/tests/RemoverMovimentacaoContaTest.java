package main.java.tests;

import org.junit.Assert;
import org.junit.Test;

public class RemoverMovimentacaoContaTest extends main.java.core.BaseTest {
	
	main.java.pages.MenuPage menuPage = new main.java.pages.MenuPage();
	main.java.pages.ContasPage contasPage = new main.java.pages.ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(main.java.core.Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}
