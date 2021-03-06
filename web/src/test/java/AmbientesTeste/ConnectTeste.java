package AmbientesTeste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Paginas.Login;
import Suporte.Navegador;

public class ConnectTeste {
	private WebDriver navegador;

	@Before
	public void setUp() {

		navegador = Navegador.createChrome();
	}

	@Test
	public void testCriacaoDePost() throws InterruptedException {

		new Login(navegador).fazerLogin("diretor", "quality")
		.acaoPost()
		.publicarFoto();
	}

	@After
	public void tearDown() {
		// navegador.quit();
	}
}