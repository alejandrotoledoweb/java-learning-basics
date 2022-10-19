package com.example.interfaces;

import com.example.Coche;
import com.example.CocheElectrico;
import com.example.CocheHibrido;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche() {
        System.out.println("destruyendo coche de carreras");
    }
}
