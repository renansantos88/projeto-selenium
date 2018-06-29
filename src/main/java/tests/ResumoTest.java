package main.java.tests;

import static main.java.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.core.DriverFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends main.java.core.BaseTest {
	private main.java.pages.MenuPage menuPage = new main.java.pages.MenuPage();
	private main.java.pages.ResumoPage resumoPage = new main.java.pages.ResumoPage();

//	@Test
	public void test1ExcluirMovimentacao(){
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		
		Assert.assertEquals("Movimentação removida com sucesso!",
				resumoPage.obterMensagemSucesso());
	}
	
//	@Test(expected=NoSuchElementException.class)
	@Test
	public void test2ResumoMensal(){
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
		
//		DriverFactory.getDriver().findElement(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		
//		try{
//			DriverFactory.getDriver().findElement(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
//			Assert.fail();
//		} catch (NoSuchElementException e) {
//			
//		}
		
		List<WebElement> elementosEncontrados = 
				DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		Assert.assertEquals(7, elementosEncontrados.size());
		
	}
}
