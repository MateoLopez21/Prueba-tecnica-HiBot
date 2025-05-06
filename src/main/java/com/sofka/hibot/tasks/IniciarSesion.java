package com.sofka.hibot.tasks;
import com.sofka.hibot.interactions.IngresarCredenciales;
import com.sofka.hibot.interactions.NavegarAlaPaginaDeLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofka.hibot.userinterfaces.LoginUI.Login_BUTTON;

public class IniciarSesion implements Task {

    private String username;
    private String password;

    public IniciarSesion(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static IniciarSesion conCredenciales(String username, String password) {
        return new IniciarSesion(username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarCredenciales.con(username, password),
                Click.on(Login_BUTTON)
        );
    }
}