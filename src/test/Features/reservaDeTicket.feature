# language: pt
Funcionalidade: Reserva de tickets

  @Cenário1 @SmokeTest
 Cenário: Reservar 1 ticket de passagem aérea
    Dado que acesso a página da aplicação
    E informe um usuario válido
    E informe uma senha válida
    E clico no botão sign-in
    E seleciono a cidade de origem
    E seleciono a cidade de destino
    E informo uma data de ida
    E informo uma data de volta
    E seleciono a opção First Class
    E seleciono um passageiro
    Quando clico no botão continuar da página de busca
    E seleciono voo de ida
    E seleciono voo de volta
    E clico no botão continuar da página reserva de voo
    E informo o primeiro e o segundo nome
    E informo o número do cartão de crédito
    E informo o nome do passageiro
    E clico no botão de reservar passagem
    Então exibe mensagem de compra reservada


  @Cenário2 @SmokeTest
Cenário: Criar massa de dados - Reserva de Companhia aérea selecionada
    Dado que acesso a página da aplicação
    E informe um usuario válido
    E informe uma senha válida
    E clico no botão sign-in
    E seleciono a opção one way
    E seleciono a companhia aérea Pangaea Airlines
    E seleciono a cidade de origem
    E seleciono a cidade de destino
    E informo uma data de ida
    E seleciono a opção First Class
    E seleciono um passageiro
    Quando clico no botão continuar da página de busca
    E seleciono voo de ida
    E clico no botão continuar da página reserva de voo
    E informo o primeiro e o segundo nome
    E informo o número do cartão de crédito
    E informo o nome do passageiro
    E clico no botão de reservar passagem
    Então exibe mensagem de compra reservada





