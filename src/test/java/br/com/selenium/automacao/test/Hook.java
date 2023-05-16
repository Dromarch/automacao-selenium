package br.com.selenium.automacao.test;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
	
	private static ChromeDriver driver;
	
	public static void startDriver() {
		File driverFile = new File("src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());          
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static ChromeDriver getDriver() {
		return driver;
	}
	
}
