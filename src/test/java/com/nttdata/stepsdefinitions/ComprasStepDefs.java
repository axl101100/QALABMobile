package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ComprasStepDefs {

    @Steps

    LoginSteps loginSteps;

    @Given("que estoy en la aplicación de SauceLabs")
    public void queEstoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        loginSteps.validoProductos();

    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String producto) {

        loginSteps.agregarProductoPorNombreYUnidades(producto, unidades);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {

        int unidadesEsperadas = 3;
        loginSteps.validarCarritoDeCompra(unidadesEsperadas);
    }


}
