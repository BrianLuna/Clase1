package org.example;

public abstract class Animal {
    private String nombre;
    private int cantidadPatas;

    public Animal(String nombre, int cantidadPatas) {
        this.nombre = nombre;
        this.cantidadPatas = cantidadPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
}
