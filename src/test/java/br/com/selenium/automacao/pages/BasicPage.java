package br.com.selenium.automacao.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import br.com.selenium.automacao.test.Hook;

public class BasicPage {

	protected ChromeDriver driver;
	
	public BasicPage() {
		driver = Hook.getDriver();
	}
	
	protected void switchWindow() {
		driver.close();
		for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
	}
	
}
