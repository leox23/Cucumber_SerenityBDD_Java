package cucumber.serenity.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.serenity.calculo.Resta;
import org.junit.Assert;

public class RetarStepDefinitions {
    private Resta restador;
    private int resultado;

    @Given("^Quiero restar$")
    public void quieroRestar() {
        restador = new Resta();
    }

    @When("^Resto (\\d+) menos (\\d+)$")
    public void restoMenos(int arg1, int arg2) {
        resultado = restador.restar(arg1, arg2);
    }

    @Then("^Debera ver que el resultado de la resta es (\\d+)$")
    public void deberaVerQueElResultadoDeLaRestaEs(int arg1) {
        Assert.assertEquals(arg1, resultado);
    }

}
