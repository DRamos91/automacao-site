package automacao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenSite {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// Atualiza e roda com a vers?o mais atualizada do webdriver
		WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();

		// Informando ao sistema o local do driver do google chrome
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\drivers\\chromedriver.exe");

	}

	@After
	public void tearDown() throws Exception {
		// Comando para fechar o navegador
		 driver.quit();
	}

	@Test
	public void test() {
		// Comando para acessar o site desejado
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.get("https://www.americanas.com.br");
		//exibe o titulo da pagina
		String title = driver.getTitle();
		System.out.println(title);

		//digita webcam na barra de pesquisa do site
		WebElement searchBox = driver.findElement(By.name("conteudo"));
		searchBox.clear();
		searchBox.sendKeys("WebCam", Keys.ENTER);

		
//		String preco = driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/main/div/div[3]/div[2]")).getText();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"rsyswpsdk\"]/div/main/div/div[3]/div[2]"));

		for (WebElement element : elements) {
		    System.out.println("Paragraph text:" + element.getText());
		}
				
//		System.out.println(preco);
		
		

//		driver.get("https://www.americanas.com.br/");

//		WebElement campoPesquisado = driver.findElement(By.name("conteudo"));
//		campoPesquisado.clear();
//		campoPesquisado.sendKeys("Webcam", Keys.ENTER);

//		String preco = driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]")).getText();

//		System.out.println(preco.toLowerCase().contains("webcam".toLowerCase()));

//		System.out.println("O titulo da pagina ?: " + driver.getTitle());

	}

}
