package com.sofka.hibot.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.hibot.userinterfaces.CheckoutUI.Orden_Finalizada_TEXT;

public class VerificarOrdenFinalizada implements Question<Boolean> {

    private final Target target;

    public VerificarOrdenFinalizada(Target target) {
        this.target = target;
    }

    public static VerificarOrdenFinalizada esVisible() {
        return new VerificarOrdenFinalizada(Orden_Finalizada_TEXT);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
        return WebElementQuestion.the(target).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isDisplayed() {
        return new VerificarOrdenFinalizada(Orden_Finalizada_TEXT);
    }
}