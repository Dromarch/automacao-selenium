package br.com.selenium.automacao.pages;

import org.openqa.selenium.By;

public class NttDataPage extends BasicPage {

	public void acceptAllCookies() {
		driver.findElement(By.xpath("//button[@id='all']")).click();
	}
	
	public void accessCareerPage() {
		driver.findElement(By.xpath("//li[@id='menu-item-32094']//a")).click();
	}
	
	public void accessJoinPage() {
		driver.findElement(By.xpath("//a[text()='Junte-se a nossa equipe']")).click();
	}
	
	public void processCareerSearch(String search) throws InterruptedException {
		switchWindow();
		Thread.sleep(3000);
		insertCareerSearchInput(search);
		Thread.sleep(3000);
	}

	public String getFirstCareerSearchResultText() {
		return driver.findElement(By.xpath("(//div[@class='col-xs-12 padding-5 padding-top-15 padding-bottom-15 vacancy-list-typograph'])[1]//div//h4")).getText();
	}
	
	private void insertCareerSearchInput(String search) {
		driver.findElement(By.xpath("//input[@id='pesquisar-vaga-localidade-etc']")).sendKeys(search);
	}
	
}
