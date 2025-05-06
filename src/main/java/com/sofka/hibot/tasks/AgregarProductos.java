package com.sofka.hibot.tasks;

import com.sofka.hibot.interactions.SeleccionarProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import com.sofka.hibot.userinterfaces.PaginaPrincipalUI;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.hibot.userinterfaces.PaginaPrincipalUI.Agregar_Al_Carrito_BUTTONS;
import static com.sofka.hibot.userinterfaces.PaginaPrincipalUI.Carrito_BUTTON;

public class AgregarProductos implements Task {

    private final int cantidad;

    public AgregarProductos(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Agregar_Al_Carrito_BUTTONS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                SeleccionarProductos.de(PaginaPrincipalUI.Agregar_Al_Carrito_BUTTONS, cantidad),
                Click.on(Carrito_BUTTON)
        );
    }

    public static AgregarProductos alCarrito(int cantidad) {
        return Tasks.instrumented(AgregarProductos.class, cantidad);
    }
}
