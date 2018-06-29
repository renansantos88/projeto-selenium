package main.java.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	main.java.tests.ContaTest.class,
	main.java.tests.MovimentacaoTest.class,
	main.java.tests.RemoverMovimentacaoContaTest.class,
	main.java.tests.SaldoTest.class,
	main.java.tests.ResumoTest.class
})
public class SuiteGeral {
	private static main.java.pages.LoginPage page = new main.java.pages.LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("renans.pereira88@gmail.com");
		page.setSenha("Renan@123");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		main.java.core.DriverFactory.killDriver();
	}
}
