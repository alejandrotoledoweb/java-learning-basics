package com.example;

// public abstract class com.example.Coche
// agregando la palabra abstract solo se puede crear un objeto a partir de
// las clases hijas, no new com.example.Coche, but new com.example.CocheElectrico o com.example.CocheHibrido
public class Coche {

    // Clases

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores

    public Coche() {

    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamiento
    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 120) {
        this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "com.example.Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
