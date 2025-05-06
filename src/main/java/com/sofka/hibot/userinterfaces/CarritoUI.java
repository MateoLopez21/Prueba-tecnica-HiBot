package com.sofka.hibot.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {
    public static final Target Checkout_BUTTON = Target.the("Botón de checkout").located(By.xpath("//button[@id='checkout']"));


}
