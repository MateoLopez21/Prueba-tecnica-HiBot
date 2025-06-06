package com.sofka.hibot.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregarProductos.feature",
        glue = "com.sofka.hibot.stepdefinitions"
)
public class AgregarProductosTest {}
