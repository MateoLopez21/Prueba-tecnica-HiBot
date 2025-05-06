package com.sofka.hibot.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;


public class VerificarProductosEnCarrito implements Question<Boolean> {

    private final int cantidadEsperada;

    private static final By PRODUCTOS_EN_CARRITO = By.xpath("//div[@class='cart_item']");

    public VerificarProductosEnCarrito(int cantidadEsperada) {
        this.cantidadEsperada = cantidadEsperada;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int cantidadActual = BrowseTheWeb.as(actor).getDriver().findElements(PRODUCTOS_EN_CARRITO).size();
        return cantidadActual == cantidadEsperada;
    }

    public static VerificarProductosEnCarrito esIgualA(int cantidadEsperada) {
        return new VerificarProductosEnCarrito(cantidadEsperada);
    }
}
