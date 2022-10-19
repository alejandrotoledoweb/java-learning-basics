package com.example;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int result = 5 / 5;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin de la función");
    }
}
