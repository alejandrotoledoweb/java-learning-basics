package com.example;

public class Funciones {

  public static void main(String[] args) {

    holaMundo();
    holaMundoConNombre("Alex");
    holaMundoConNombre("Donatelo");

    String saludo = devolverHello();
    System.out.println(saludo);
  }

  public static void holaMundo() {
    System.out.println("Hola mundo desde private");
  }

  // sobrecarga de funciones
  private static void holaMundo(String name) {
    System.out.println("Hola mundo desde private" + name);
  }
  protected static void holaMundo(String name, String surname) {
    System.out.println("Hola mundo "+ name + " " + surname);
  }
  private static void holaMundoConNombre(String name) {
    System.out.println("Hola " + name);
  }

  private static String devolverHello() {
    return "Hello";
  }

  public static int sum(int num1, int num2) {
    return num1 + num2;
  }
}
