package com.sofka.hibot.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutUI {
    public static final Target Titulo_Informacion_TEXT = Target.the("Título Checkout: Your Information").located(By.xpath("//span[@class='title' and contains(text(), 'Checkout: Your Information')]"));
    public static final Target First_Name_INPUT = Target.the("Campo para ingresar el primer nombre").located(By.xpath("//input[@id='first-name']"));
    public static final Target Last_Name_INPUT = Target.the("Campo para ingresar el/los apellidos").located(By.xpath("//input[@id='last-name']"));
    public static final Target Postal_Code_INPUT = Target.the("Campo para ingresar el código postal").located(By.xpath("//input[@id='postal-code']"));
    public static final Target Continue_BUTTON = Target.the("Botón para avanzar con el checkout").located(By.xpath("//input[@id='continue']"));

    public static final Target Titulo_Resumen_TEXT = Target.the("Título de la página del resumen de compra").located(By.xpath("//span[@class='title' and contains(text(), 'Checkout: Overview')]"));
    public static final Target Finish_BUTTON = Target.the("Botón para finalizar la compra").located(By.xpath("//button[@id='finish']"));

    public static final Target Orden_Finalizada_TEXT = Target.the("Texto que indica que la orden finalizó").located(By.xpath("//h2[normalize-space()='Thank you for your order!']"));
}
