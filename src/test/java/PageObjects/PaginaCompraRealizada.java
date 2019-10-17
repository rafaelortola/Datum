package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCompraRealizada extends BasePage {
    public PaginaCompraRealizada(WebDriver navegador) {
        super(navegador);
    }

    public PaginaCompraRealizada validaCompraRealizada(){
        String text = navegador.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
        text.contains("Your itinerary has been booked!");
        return this;
    }
}
