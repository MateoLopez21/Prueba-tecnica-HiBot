package com.sofka.hibot.stepdefinitions;

import com.sofka.hibot.actors.Usuario;
import com.sofka.hibot.interactions.NavegarAlaPaginaDeLogin;
import com.sofka.hibot.questions.VerificarOrdenFinalizada;
import com.sofka.hibot.tasks.AgregarProductos;
import com.sofka.hibot.tasks.FinalizarCompra;
import com.sofka.hibot.tasks.IngresarInformacionCheckout;
import com.sofka.hibot.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FinalizarCompraStepDefinitions {

    Usuario usuario = new Usuario("Mateo");

    @Before
    public void setUpFinalizarCompra(){
        System.out.println(">>> Before FinalizarCompraStepDefinitions");
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
        usuario.can(BrowseTheWeb.with(driver));

    }

    @Given("El usuario ha agregado dos productos al carrito")
    public void el_usuario_ha_agregado_dos_productos_al_carrito() {
        usuario.attemptsTo(
                NavegarAlaPaginaDeLogin.abrir(),
                IniciarSesion.conCredenciales("standard_user", "secret_sauce"),
                AgregarProductos.alCarrito(2)
        );
    }
    @When("El usuario ingresa la informacion correctamente")
    public void el_usuario_ingresa_la_informacion_correctamente() {
        usuario.attemptsTo(IngresarInformacionCheckout.con("Mateo", "López", "050005"));
        usuario.attemptsTo(FinalizarCompra.hacerCheckout());
    }
    @Then("Deberia visualizar el mensaje de orden finalizada")
    public void deberia_visualizar_el_mensaje_de_orden_finalizada() {
        usuario.should(seeThat(VerificarOrdenFinalizada.esVisible()));
    }
}
