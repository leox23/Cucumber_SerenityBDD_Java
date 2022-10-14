package cucumber.serenity.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetarStepDefinitions {
    @Given("^Quiero restar$")
    public void prepararResta() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Resto (\\d+) menos (\\d+)$")
    public void restar(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Deberia ver que el resultado de la resta es (\\d+)$")
    public void verificarResta(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
