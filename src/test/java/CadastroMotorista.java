import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CadastroMotorista {
	
	private WebDriver driver;
	
	@Before 
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\gustavo.teixeira\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://96437c04.ngrok.io/");
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("requestLogin")).click();
					
	}
	
	@After
	public void finaliza() {
	//driver.quit();
	}
	
	public void robot () throws Throwable {
		Robot robot = null;
		try {
		robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_TAB);
		}
	
	@Test 
	public void CadastroMotoristanPositivo() throws Throwable {
		Thread.sleep(5000);
		//Acessar o menu Cadastro Motorista
		driver.findElement(By.xpath("//div[' ' and contains(text(),'Cadastrar motorista')]")).click();
		//Clicar no botão Cadastro Motorista
		driver.findElement(By.id("modalCadEmpresa")).click();
		//Inserir CPF
		WebElement cpf = driver.findElement(By.xpath("//input[@aria-label=\"CPF*\"]"));
		cpf.clear();
		cpf.sendKeys("08514316664");
		robot();
		//Inserir Nome
		WebElement nome = driver.findElement(By.xpath("//input[@aria-label=\"Nome*\"]"));
		nome.clear();
		nome.sendKeys("Gustavo Felipe Teixeira");
		//Selecionar Nacionalidade
		WebElement nacionalidadePai = driver.findElement(By.xpath("//input[@aria-label=\"Nacionalidade*\"]/.."));
		nacionalidadePai.click();
		WebElement nacionalidadeEscolher = driver.findElement(By.xpath("//div[' ' and contains(text(),\"BRASILEIRO\")]"));
		nacionalidadeEscolher.click();
		//Selecionar UF
		WebElement UFPai = driver.findElement(By.xpath("//input[@aria-label=\"UF*\"]/.."));
		UFPai.click();
		WebElement UFEscolher = driver.findElement(By.xpath("//div[' ' and contains(text(),\"MG\")]"));
		UFEscolher.click();
		//Selecionar Cidade
		//Inserir Data Nascimento
		WebElement datanascimento = driver.findElement(By.xpath("//input[@aria-label=\"Data Nascimento*\"]"));
		datanascimento.clear();
		datanascimento.sendKeys("12091991");
		//Inserir Telefone 1
		WebElement telefone1 = driver.findElement(By.xpath("//input[@aria-label=\"Telefone 1*\"]"));
		telefone1.clear();
		telefone1.sendKeys("31988665129");
		//Inserir Telefone 2
		WebElement telefone2 = driver.findElement(By.xpath("//input[@aria-label=\"Telefone 2*\"]"));
		telefone2.clear();
		telefone2.sendKeys("31993721436");
		//Inserir Numero RG
		WebElement numerorg = driver.findElement(By.xpath("//input[@aria-label=\"Numero RG*\"]"));
		numerorg.clear();
		numerorg.sendKeys("MG15469095");
		//Inserir Orgão Expedidor
		//Inserir Numero CNH
		WebElement numerocnh = driver.findElement(By.xpath("//input[@aria-label=\"CNH*\"]"));
		numerocnh.clear();
		numerocnh.sendKeys("187393739");
		//Selecionar Tipo
		//Inserir Data Validade
		WebElement datavalidade = driver.findElement(By.xpath("//input[@aria-label=\"Validade*\"]"));
		datavalidade.clear();
		datavalidade.sendKeys("12091991");
		//Inserir Data 1º Habiltação
		WebElement data1habilitacao = driver.findElement(By.xpath("//input[@aria-label=\"Data 1º Habilitação*\"]"));
		data1habilitacao.clear();
		data1habilitacao.sendKeys("12091991");
		//Selecionar Unidade Responsável
		
		
		
		
	}
	
//	@Test 
//	public void CadastroMotoristanNegativo() throws Throwable {
//		driver.get("https://74fe609e.ngrok.io/login");
//		driver.findElement(By.id("email")).sendKeys("admin@admin.com.br");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.id("requestLogin")).click();
				
	//}

}
