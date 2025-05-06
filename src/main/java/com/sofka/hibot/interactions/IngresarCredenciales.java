package com.sofka.hibot.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofka.hibot.userinterfaces.LoginUI.*;

public class IngresarCredenciales implements Interaction {

    private String username;
    private String password;

    public IngresarCredenciales(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static IngresarCredenciales con(String username, String password) {
        return new IngresarCredenciales(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(Username_INPUT),
                Enter.theValue(password).into(Password_INPUT)
        );
        System.out.println("Ingresando credenciales en el Login...");
    }
}
