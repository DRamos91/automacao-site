package automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// Informando ao sistema o local do driver do google chrome
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() throws Exception {
		// Comando para fechar o navegador
		// driver.quit();
	}

	@Test
	public void test() {
		// Comando para acessar o site desejado
		driver.get("https://www.americanas.com.br/");

		driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[1]/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[1]/form/input"))
				.sendKeys("WebCam", Keys.ENTER);
		// driver.findElement(By.xpath("//*[@id=\"sort-by\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sort-by\"]/option[1]")).click();
		
	}

}
