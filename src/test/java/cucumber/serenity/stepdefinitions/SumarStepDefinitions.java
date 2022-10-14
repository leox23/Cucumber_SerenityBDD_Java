package cucumber.serenity.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.serenity.calculo.Suma;
import org.junit.Assert;

public class SumarStepDefinitions {
    private Suma sumador;
    private int resultado;

    @Given("^Quiero sumar$")
    public void prepararSuma() {
        sumador = new Suma();
    }

    @When("^Sumo (\\d+) mas (\\d+)$")
    public void sumar(int arg1, int arg2) {
        resultado = sumador.sumar(arg1, arg2);
    }

    @Then("^Deberia ver que el resultado es (\\d+)$")
    public void verificarResultado(int arg1) {
        Assert.assertEquals(arg1, resultado);
    }


}
