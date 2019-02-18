package br.com.rsinet.netshoes2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaPrincipal {
	
	//para receber o driver utilizado
	private WebDriver driver;
	private WebDriverWait wait;
	
	public PaginaPrincipal(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
	}
	
	
	//
	public void acessaPaginaPrincipal() {
		driver.get("https://www.netshoes.com.br/");
	}
	
	public void acessaAbaEntrar() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#header-user-anonymous']")));
		driver.findElement(By.xpath("//*[@href='#header-user-anonymous']")).click(); 
	}
	
	public void acessaLogin() {
		acessaAbaEntrar();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='/login']")));
		driver.findElement(By.xpath("//*[@href='/login']")).click();
	}
	
	public void acessaAbaUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#header-user-logged']")));
		driver.findElement(By.xpath("//*[@href='#header-user-logged']")).click();
	}
	
	public void fazLogout() {
		acessaAbaUsuario();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='/logout']")));
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
	}
}
