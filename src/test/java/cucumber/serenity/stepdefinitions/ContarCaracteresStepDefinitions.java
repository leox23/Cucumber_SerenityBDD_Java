package cucumber.serenity.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.serenity.palabras.ContadorCaracteres;
import org.junit.Assert;

public class ContarCaracteresStepDefinitions {
    private ContadorCaracteres contador;
    private int resultado;

    @Given("^quiero contar caracteres$")
    public void preparar() {
        contador = new ContadorCaracteres();
    }

    @When("^cuento los caracteres de la palabra (.*)$")
    public void contarCaracteres(String palabra) {
        resultado = contador.contar(palabra);
    }

    @Then("^deberia ver que el numero de caracteres de la palabra es (\\d+)$")
    public void verificarResultado(int arg1) {
        Assert.assertEquals(4, resultado);
    }
}
