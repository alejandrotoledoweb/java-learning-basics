package com.example.interfaces;

import com.example.Coche;
import com.example.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche() {
        System.out.println("destruyendo coche");
    }
}
