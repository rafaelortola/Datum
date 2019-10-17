$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:reservaDeTicket.feature");
formatter.feature({
  "name": "Reserva de tickets",
  "description": "",
  "keyword": "Funcionalidade"
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
  "name": "Preencher FlightNumber",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarFlightNumber(String,String,String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [Preencher FlightNumber] is defined with 3 parameters at \u0027StepsDefinition.Steps.selecionarFlightNumber(String,String,String) in file:/C:/ProjetosGit/Datum/Web/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: Preencher FlightNumber\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
});