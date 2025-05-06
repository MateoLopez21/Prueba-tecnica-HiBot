package com.sofka.hibot.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class VerificarPaginaPrincipal implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement element = driver.findElement(By.xpath("//span[@class='title' and contains(text(), 'Products')]"));
        return element.isDisplayed();
    }

    public static VerificarPaginaPrincipal estaVisible() {
        return new VerificarPaginaPrincipal();
    }
}