package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suporte.Web;

public class CadastrarEnderecoTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = Web.createChrome();
    }

    @Test
    public void testeRealizarCompra() {
    }

    @After
    public void tearDown() {
        //Close browser
        driver.close();
    }
}
