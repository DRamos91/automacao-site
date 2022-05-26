package automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	//	 driver.quit();
	}

	@Test
	public void test() {
		// Comando para acessar o site desejado
		driver.get("https://www.americanas.com.br/");

		WebElement campoPesquisado = driver.findElement(By.name("conteudo"));
		campoPesquisado.clear();
		campoPesquisado.sendKeys("Webcam", Keys.ENTER);
		
		String preco = driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]")).getText();

		System.out.println(preco.toLowerCase().contains("webcam".toLowerCase()));

		System.out.println("O titulo da pagina �: " + driver.getTitle());


	}

}
