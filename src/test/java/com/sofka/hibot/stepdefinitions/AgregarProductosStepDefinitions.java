package com.sofka.hibot.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

import com.sofka.hibot.actors.Usuario;
import com.sofka.hibot.interactions.NavegarAlaPaginaDeLogin;
import com.sofka.hibot.questions.VerificarProductosEnCarrito;
import com.sofka.hibot.tasks.AgregarProductos;
import com.sofka.hibot.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

public class AgregarProductosStepDefinitions {


    Usuario usuario = new Usuario("Mateo");

    @Before
    public void setUpAgregarProductos() {
        System.out.println(">>> Before AgregarProductosStepDefinitions");
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("El usuario ha iniciado sesion correctamente")
    public void el_usuario_ha_iniciado_sesion_correctamente() {
        usuario.attemptsTo(NavegarAlaPaginaDeLogin.abrir());
        usuario.attemptsTo(IniciarSesion.conCredenciales("standard_user", "secret_sauce"));
    }

    @When("Agrega {int} productos al carrito")
    public void agrega_productos_al_carrito(int cantidad) {
        usuario.attemptsTo(AgregarProductos.alCarrito(cantidad));
    }

    @Then("Deberia visualizar los {int} productos agregados en el carrito")
    public void deberia_visualizar_los_productos_agregados_en_el_carrito(int cantidad) {
        usuario.should(seeThat(VerificarProductosEnCarrito.esIgualA(cantidad)));
    }
}