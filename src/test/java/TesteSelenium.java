import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
    @Test
    public void PesquisarSiteGoogle(){
        System.setProperty("webdriver.chrome.driver","drive\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        WebElement barrabusca = webDriver.findElement(By.className("gLFyf"));
        barrabusca.click();
        barrabusca.sendKeys("playstation 5", Keys.ENTER);
        WebElement primeiroelemento = webDriver.findElement(By.className("srp"));
        String texto = primeiroelemento.getText();
        Assertions.assertTrue(texto.contains("playstation 5"));
    }
}
