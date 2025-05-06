package com.sofka.hibot.actors;

import net.serenitybdd.screenplay.Actor;

public class Usuario extends Actor {

    private String name;

    public Usuario(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
