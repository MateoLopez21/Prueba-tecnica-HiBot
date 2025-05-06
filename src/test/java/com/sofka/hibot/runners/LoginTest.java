package com.sofka.hibot.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com.sofka.hibot.stepdefinitions",
        tags = "")
public class LoginTest {
}
