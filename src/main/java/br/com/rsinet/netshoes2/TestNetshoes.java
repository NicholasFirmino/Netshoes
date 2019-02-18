package br.com.rsinet.netshoes2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNetshoes {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nicholas.firmino\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
    public void fazLoginLogout(){
    	PaginaPrincipal pgPrincipal= new PaginaPrincipal(driver);
    	PaginaLogin pgLogin = new PaginaLogin(driver);
    
    	pgPrincipal.acessaPaginaPrincipal();
    	pgPrincipal.acessaLogin();
    	pgLogin.fazLogin("22889474895", "rsi123456");
    	pgPrincipal.fazLogout();
    }
	
	@After
	public void finaliza() {
		driver.quit();
	}
}