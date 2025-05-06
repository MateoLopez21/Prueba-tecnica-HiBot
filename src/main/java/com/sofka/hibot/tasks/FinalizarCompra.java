package com.sofka.hibot.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.sofka.hibot.userinterfaces.CheckoutUI.*;

public class FinalizarCompra implements Task {

    public static Performable hacerCheckout() {
        return instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(Titulo_Resumen_TEXT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(Finish_BUTTON)
        );
        System.out.println("Compra Finalizada");
    }
}