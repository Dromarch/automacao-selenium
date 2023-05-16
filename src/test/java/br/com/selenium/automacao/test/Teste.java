package br.com.selenium.automacao.test;

import org.junit.*;
import br.com.selenium.automacao.pages.*;

public class Teste {

	private GoogleSearchPage googleSearchPage;
	private NttDataPage nttDataPage;
	
	@Before
	public void beforeTest() {
		Hook.startDriver();
		googleSearchPage = new GoogleSearchPage();
		nttDataPage = new NttDataPage();
	}
	
	@Test
	public void careerPageSearchTest() throws InterruptedException {
		processGoogleSearch("nttdata");
		processNttDataPageAccess();
		Assert.assertEquals(nttDataPage.getFirstCareerSearchResultText(), "Arquiteto(a) de Solução SAP - Manufatura");
	}
	
	private void processGoogleSearch(String search) {
		googleSearchPage.accessPage();
		googleSearchPage.processSearch(search);
		googleSearchPage.acessSearchResultLink();
	}
	
	private void processNttDataPageAccess() throws InterruptedException {
		nttDataPage.acceptAllCookies();
		nttDataPage.accessCareerPage();
		nttDataPage.accessJoinPage();
		nttDataPage.processCareerSearch("Arquiteto");
	}
	
}
