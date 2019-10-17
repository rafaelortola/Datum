package StepsDefinition;

import PageObjects.PaginaCompraRealizada;
import PageObjects.PaginaLogado;
import PageObjects.PaginaLogin;
import Suport.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "SampleAppData.csv")
public class Steps {
    private WebDriver navegador;

    /*@Before
    public void setUp() {
     navegador = Web.createChrome();
    }*/

    @Dado("que acesso a página da aplicação")
    public void acessar_url(){
        navegador = Web.createChrome();
    }

    @Dado("informe um usuario válido")
    public void informarUsername(){
        new PaginaLogin(navegador)
        .informarLogin();
    }

    @Dado("informe uma senha válida")
    public void informarPassword(){
        new PaginaLogin(navegador)
                .infomarSenha();
    }

    @Dado("clico no botão sign-in")
    public void clicarNoBotaoSignIn(){
        new PaginaLogin(navegador)
                .clicarBotaoLogar();
    }

    @Dado("seleciono a cidade de origem")
    public void selecionaCidadeDeOrigem(){
        new PaginaLogado(navegador)
                .informarCidadeOrigem();
    }

    @Dado("seleciono a cidade de destino")
    public void selecionaCidadeDeDestino(){
        new PaginaLogado(navegador)
                .informarCidadeDestino();
    }

    @Dado("informo uma data de ida")
        public void informoUmaDataDeIdaValida(){
        new PaginaLogado(navegador)
                .informarDataDeIdaValida();
    }

    @Dado("informo uma data de volta")
    public  void  informoUmaDataDeVolta(){
        new PaginaLogado(navegador)
                .informarDataDeRetornoValida();
    }

    @Dado("seleciono a opção First Class")
    public void selecionoOpcaoFirstClass(){
        new PaginaLogado(navegador)
                .informarOpcaoFirstClass();
    }

    @Dado("seleciono um passageiro")
    public void selecionarUmPassageiro(){
        new PaginaLogado(navegador)
                .selecionarUmPassageiro();
    }

    @Quando("clico no botão continuar da página de busca")
    public void clicarNoBotaoContinuarPaginaBusca(){
        new PaginaLogado(navegador)
                .clicarBotaoContinuarDaPaginaDeBusca();
    }

    @Dado("seleciono voo de ida")
    public void selecionarVooDeIda(){
        new PaginaLogado(navegador)
                .selecionarVooDeIda();
    }

    @Dado("seleciono voo de volta")
    public void selecionarVooDeVolta(){
        new PaginaLogado(navegador)
                .selecionarVooDeVolta();
    }

    @Dado("clico no botão continuar da página reserva de voo")
    public void clicarNoBotaoContinuarPaginaReservaVoo(){
        new PaginaLogado(navegador)
                .clicarBotaoContinuarDaPaginaDeReservaVoo();
    }

    @Dado("informo o primeiro e o segundo nome")
    public void informarNomeCompleto(){
        new PaginaLogado(navegador)
                .informarNomeCompleto();
    }

    @Dado("informo o número do cartão de crédito")
        public void informarNumeroCartaoCredito(){
        new PaginaLogado(navegador)
                .informarNumeroDoCartaoCredito();
    }

    @Dado("informo o nome do passageiro")
    public void informarNomeDoPassageiro(){
        new PaginaLogado(navegador)
                .informarNomeDoPassageiro();
    }

    @Dado("clico no botão de reservar passagem")
    public void clicarNoBotaoParaReservarPassagem(){
        new PaginaLogado(navegador)
                .clicarBotaoReservarPassagem();
    }

    @Então("exibe mensagem de compra reservada")
        public void validaCompraReservada(){
        new PaginaCompraRealizada(navegador)
                .validaCompraRealizada();
        }

        @Dado("seleciono a opção one way")
        public void selecionarOpcaoOneWay(){
        new PaginaLogado(navegador)
                .selecionarOpcaoOneWay();
        }

        @Dado("Preencher FlightNumber")
        public void selecionarFlightNumber(@Param(name="FlightNumber") String FlightNumber,@Param(name="Passengers")String Passengers,@Param(name="Class")String Class){

            WebElement campoAirlines = navegador.findElement(By.name("airline"));
            new Select(campoAirlines).selectByVisibleText(FlightNumber);

            WebElement campoPassengers = navegador.findElement(By.name("passCount"));
            new Select(campoPassengers).selectByVisibleText(Passengers);

            WebElement selecionarClass = navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2)"));
            new Select(selecionarClass).selectByValue(Class);

        }

}












    /*@After
    public void tearDown(){
        navegador.quit();
    }*/



