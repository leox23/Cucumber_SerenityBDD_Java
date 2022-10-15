package cucumber.serenity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/contar_caracteres.feature"},
        glue = {"cucumber.serenity/stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class ContarCaracteres {
}
