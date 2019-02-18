package br.com.rsinet.netshoes2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaLogin {
	
	//para receber o driver utilizado
	private WebDriver driver;
	private WebDriverWait wait;
	
	public PaginaLogin(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
	}
	
	public void acessaPaginaLogin() {
		driver.get("https://www.netshoes.com.br/login");
	}
	
	public void fazLogin(String usuario, String senha) {
		driver.findElement(By.id("username")).sendKeys(usuario); 
		driver.findElement(By.id("password")).sendKeys(senha); 
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		driver.findElement(By.id("login-button")).click();
	}
}
