package br.com.selenium.automacao.pages;

import org.openqa.selenium.By;

public class GoogleSearchPage extends BasicPage {

	private static final String PAGE_URL = "https://www.google.com.br/";
	
	public void accessPage() {
		driver.get(PAGE_URL);
	}
	
	public void processSearch(String search) {
		insertSearchInput(search);
		confirmSearchInput();
	}
	
	public void acessSearchResultLink() {
		driver.findElement(By.xpath("//a[@href='https://nttdata-solutions.com/br/']")).click();
	}

	private void insertSearchInput(String search) {
		driver.findElement(By.name("q")).sendKeys(search);
	}
	
	private void confirmSearchInput() {
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}
	
}
