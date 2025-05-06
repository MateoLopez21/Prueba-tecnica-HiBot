package com.sofka.hibot.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarAlaPaginaDeLogin implements Interaction {

    public static NavegarAlaPaginaDeLogin abrir() {
        return new NavegarAlaPaginaDeLogin();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));

        System.out.println("Navegando a la página de inicio de sesión");
    }
}
