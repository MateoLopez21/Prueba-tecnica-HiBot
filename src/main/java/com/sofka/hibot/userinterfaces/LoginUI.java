package com.sofka.hibot.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target Username_INPUT = Target.the("Input para introducir el username ").located(By.id("user-name"));
    public static final Target Password_INPUT = Target.the("Input para introducir la contraseña ").located(By.id("password"));
    public static final Target Login_BUTTON = Target.the("Botón para inciar sesión ").located(By.id("login-button"));
}
