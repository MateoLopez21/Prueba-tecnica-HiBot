package com.sofka.hibot.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SeleccionarProductos implements Interaction {

    private final Target botonesTarget;
    private final int cantidad;

    public SeleccionarProductos(Target botonesTarget, int cantidad) {
        this.botonesTarget = botonesTarget;
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> botones = botonesTarget.resolveAllFor(actor);
        Collections.shuffle(botones);

        List<WebElementFacade> seleccionados = botones.stream()
                .limit(cantidad)
                .toList();

        seleccionados.forEach(WebElementFacade::click);
    }

    public static SeleccionarProductos de(Target botonesTarget, int cantidad) {
        return Tasks.instrumented(SeleccionarProductos.class, botonesTarget, cantidad);
    }
}
