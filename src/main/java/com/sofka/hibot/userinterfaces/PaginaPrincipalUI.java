package com.sofka.hibot.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class PaginaPrincipalUI {

    public static final Target Agregar_Al_Carrito_BUTTONS = Target.the("botones de agregar al carrito")
            .located(By.xpath("//button[contains(@id, 'add-to-cart')]"));

    public static final Target Carrito_BUTTON = Target.the("Botón para ir al carrito").located(By.xpath("//a[@class='shopping_cart_link']"));
}
