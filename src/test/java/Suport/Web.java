package Suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:/Users/T0304RFD/Desktop/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        //Navegando para a página
        String url = "http://www.newtours.demoaut.com/";
        navegador.get(url);

        return navegador;

    }
}
