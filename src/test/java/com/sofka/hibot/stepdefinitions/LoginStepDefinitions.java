package com.sofka.hibot.stepdefinitions;

import com.sofka.hibot.actors.Usuario;
import com.sofka.hibot.interactions.NavegarAlaPaginaDeLogin;
import com.sofka.hibot.questions.VerificarPaginaPrincipal;
import com.sofka.hibot.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions  {


    Usuario usuario = new Usuario("Mateo");


    @Before
    public void setUp() {
        WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("El usuario navega a la pagina de inicio de sesion")
    public void el_usuario_navega_a_la_pagina_de_inicio_de_sesion() {
        usuario.attemptsTo(NavegarAlaPaginaDeLogin.abrir());
    }

    @When("Ingresa las credenciales correctas")
    public void ingresa_las_credenciales_correctas() {
        usuario.attemptsTo(IniciarSesion.conCredenciales("standard_user", "secret_sauce"));
    }

    @Then("El usuario deberia ver la pagina principal")
    public void el_usuario_deberia_ver_la_pagina_principal() {
        usuario.should(seeThat(VerificarPaginaPrincipal.estaVisible()));
    }
}
