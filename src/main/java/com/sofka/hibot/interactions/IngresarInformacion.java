package com.sofka.hibot.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static com.sofka.hibot.userinterfaces.CheckoutUI.*;

public class IngresarInformacion implements Interaction {

    private String firstName;
    private String lastName;
    private String postalCode;

    public IngresarInformacion(String firstName, String lastName, String postalCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static IngresarInformacion usando(String firstName, String lastName, String postalCode){
        return new IngresarInformacion(firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Titulo_Informacion_TEXT, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(First_Name_INPUT),
                Enter.theValue(lastName).into(Last_Name_INPUT),
                Enter.theValue(postalCode).into(Postal_Code_INPUT),
                Click.on(Continue_BUTTON)
        );
        System.out.println("Ingresando Información en el Checkout...");
    }

}