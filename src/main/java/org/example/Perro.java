package org.example;

public class Perro extends Animal{

    private String raza;

    public Perro(String raza) {
        super("Perro", 4);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
