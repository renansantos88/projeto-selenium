package main.java.pages;

import org.openqa.selenium.By;

public class ResumoPage extends main.java.core.BasePage {

	public void excluirMovimentacao(){
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}
	
	public String obterMensagemSucesso(){
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
