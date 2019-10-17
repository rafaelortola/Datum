package TestRunner;

import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features = "C:/ProjetosGit/Projeto_Correios/src/test/features/")
        plugin = { "html:target/cucumberHtmlReport" },
        features = "C:/ProjetosGit/Datum/Web/src/test/Features/",
        tags = { "@Cenário2" },
        glue = { "StepsDefinition" }
)
//dryRun = false,
//strict = false

public class Runner {
}
