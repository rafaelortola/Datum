$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:reservaDeTicket.feature");
formatter.feature({
  "name": "Reserva de tickets",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Reservar 1 ticket de passagem aérea",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Cenário1"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "que acesso a página da aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessar_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe um usuario válido",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão sign-in",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a cidade de origem",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionaCidadeDeOrigem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a cidade de destino",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionaCidadeDeDestino()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma data de ida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informoUmaDataDeIdaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma data de volta",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informoUmaDataDeVolta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opção First Class",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionoOpcaoFirstClass()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um passageiro",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarUmPassageiro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão continuar da página de busca",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.clicarNoBotaoContinuarPaginaBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono voo de ida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarVooDeIda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono voo de volta",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarVooDeVolta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão continuar da página reserva de voo",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoContinuarPaginaReservaVoo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o primeiro e o segundo nome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNomeCompleto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o número do cartão de crédito",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNumeroCartaoCredito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o nome do passageiro",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNomeDoPassageiro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão de reservar passagem",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoParaReservarPassagem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "exibe mensagem de compra reservada",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaCompraReservada()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Criar massa de dados - Reserva",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Cenário2"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "que acesso a página da aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.acessar_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe um usuario válido",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarUsername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão sign-in",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opção one way",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarOpcaoOneWay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a companhia aérea Pangaea Airlines",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarAirlinesPangea()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a cidade de origem",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionaCidadeDeOrigem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a cidade de destino",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionaCidadeDeDestino()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma data de ida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informoUmaDataDeIdaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a opção First Class",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionoOpcaoFirstClass()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um passageiro",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarUmPassageiro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão continuar da página de busca",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.clicarNoBotaoContinuarPaginaBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono voo de ida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarVooDeIda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão continuar da página reserva de voo",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoContinuarPaginaReservaVoo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o primeiro e o segundo nome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNomeCompleto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o número do cartão de crédito",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNumeroCartaoCredito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o nome do passageiro",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNomeDoPassageiro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão de reservar passagem",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.clicarNoBotaoParaReservarPassagem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "exibe mensagem de compra reservada",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaCompraReservada()"
});
formatter.result({
  "status": "passed"
});
});