package org.example;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//        Suma lambdaSuma = (unNumero, otroNumero) -> unNumero + otroNumero;
//
//        int unNumero = 5;
//        int otroNumero = 3;
//
//
//        int resultadoSuma = lambdaSuma.sumar(unNumero, otroNumero);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresá tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresá tu apellido: ");
        String apellido = scanner.nextLine();

        Persona persona = new Persona();

        persona.setNombre(nombre);
        persona.setApellido(apellido);

        System.out.println("El nombre de la persona es " + persona.getNombre());

    }
}