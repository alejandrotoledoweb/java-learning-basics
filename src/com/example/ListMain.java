package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        System.out.println(nombres);
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add( new Coche("azul", "toyota", "corolla", 1390d, 4.32d));
        coches.add( new Coche("rojo", "toyota", "corolla", 1390d, 4.32d));
        coches.add( new Coche("negro", "toyota", "corolla", 1390d, 4.32d));

        System.out.println(coches);
    }
}
