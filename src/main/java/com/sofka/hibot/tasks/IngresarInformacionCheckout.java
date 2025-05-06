package com.sofka.hibot.tasks;

import com.sofka.hibot.interactions.IngresarInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofka.hibot.userinterfaces.CarritoUI.Checkout_BUTTON;
import static com.sofka.hibot.userinterfaces.CheckoutUI.Continue_BUTTON;

public class IngresarInformacionCheckout implements Task {

    private String firstName;
    private String lastName;
    private String postalCode;

    public IngresarInformacionCheckout(String firstName, String lastName, String postalCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static IngresarInformacionCheckout con(String firstName, String lastName, String postalCode){
        return new IngresarInformacionCheckout(firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(Checkout_BUTTON),
                IngresarInformacion.usando(firstName, lastName, postalCode)
        );
    }
}
