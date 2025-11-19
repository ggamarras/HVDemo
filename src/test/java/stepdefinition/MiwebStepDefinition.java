package stepdefinition;

import io.cucumber.java.en.*;
import step.MiwebSteps;

public class MiwebStepDefinition {
    MiwebSteps steps = new MiwebSteps();

    @Given("el usuario abre la página de login")
    public void abrirLogin() {
        steps.abrirLogin();
    }

    @When("el usuario ingresa credenciales válidas desde Vault")
    public void ingresarCredenciales() throws Exception {
        steps.ingresarCredencialesDesdeVault();
    }

    @Then("el usuario accede correctamente")
    public void verificarAcceso() {
        steps.verificarAcceso();
    }
}


