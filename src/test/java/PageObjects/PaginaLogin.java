package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends BasePage {
    public PaginaLogin(WebDriver navegador) {
        super(navegador);
    }

    public PaginaLogin informarLogin(){
        navegador.findElement(By.name("userName")).sendKeys("mercury");
        return this;
    }

    public PaginaLogin infomarSenha(){
        navegador.findElement(By.name("password")).sendKeys("mercury");
        return this;
    }

    public PaginaLogado clicarBotaoLogar(){
        navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=image]")).click();
        return new PaginaLogado(navegador);
    }
}
