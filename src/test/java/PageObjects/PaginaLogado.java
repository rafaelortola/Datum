package PageObjects;

import Suport.Variaveis;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;


public class PaginaLogado extends BasePage{
    public PaginaLogado(WebDriver navegador) {
        super(navegador);
    }

    public PaginaLogado informarCidadeOrigem(){
        navegador.findElement(By.name("fromPort")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > select > option:nth-child(4)")).click();
        return this;
    }

    public PaginaLogado informarCidadeDestino(){
        navegador.findElement(By.name("toPort")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > select > option:nth-child(5)")).click();
        return this;
    }

    public PaginaLogado informarDataDeIdaValida(){
        navegador.findElement(By.name("fromMonth")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > select:nth-child(1) > option:nth-child(10)")).click();
        navegador.findElement(By.name("fromDay")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > select:nth-child(2) > option:nth-child(27)")).click();
        return  this;
    }

    public PaginaLogado informarDataDeRetornoValida(){
        navegador.findElement(By.name("toMonth")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > select:nth-child(1) > option:nth-child(10)")).click();
        navegador.findElement(By.name("toDay")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > select:nth-child(2) > option:nth-child(31)")).click();
        return this;
    }

    public PaginaLogado informarOpcaoFirstClass(){
        navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(4)")).click();
        return this;
    }

    public PaginaLogado selecionarUmPassageiro(){
        navegador.findElement(By.name("passCount")).findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > b > select > option:nth-child(1)")).click();
        return this;
    }

    public PaginaLogado clicarBotaoContinuarDaPaginaDeBusca(){
        navegador.findElement(By.name("findFlights")).click();
        return this;
    }

    public PaginaLogado selecionarVooDeIda(){
        navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type=radio]")).click();
        return this;
    }

    public PaginaLogado selecionarVooDeVolta(){
        navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(9) > td.frame_action_xrows > input[type=radio]")).click();
        return this;
    }

    public PaginaLogado clicarBotaoContinuarDaPaginaDeReservaVoo(){
        navegador.findElement(By.name("reserveFlights")).click();
        return this;
    }

    public PaginaLogado informarNomeCompleto(){
        Variaveis novoUsuario = new Variaveis();
        String newFirstName = novoUsuario.FirstName = "Rafael";
        String newLastName = novoUsuario.LastName = "Ortola";
        navegador.findElement(By.name("passFirst0")).sendKeys(newFirstName);
        navegador.findElement(By.name("passLast0")).sendKeys(newLastName);
        return this;
    }

    public PaginaLogado informarNumeroDoCartaoCredito(){
        Variaveis novoCartaoCredito = new Variaveis();
        String newCardNumber = novoCartaoCredito.CardNumber = "5183364117681849";
        navegador.findElement(By.name("creditnumber")).sendKeys(newCardNumber);
        return this;
    }

    public PaginaLogado informarNomeDoPassageiro(){
        Variaveis novoPassageiro = new Variaveis();
        String newPassageiro = novoPassageiro.NomePassageiro = "Rafael Silva";
        navegador.findElement(By.name("cc_frst_name")).sendKeys(newPassageiro);
        return this;
    }

    public PaginaCompraRealizada clicarBotaoReservarPassagem(){
        navegador.findElement(By.name("buyFlights")).click();
        return new PaginaCompraRealizada(navegador);
    }

    public PaginaLogado selecionarOpcaoOneWay(){
        navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)")).click();
        return this;
    }


}
