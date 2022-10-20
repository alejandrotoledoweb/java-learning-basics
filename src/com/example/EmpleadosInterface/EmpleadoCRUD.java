package com.example.EmpleadosInterface;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();

    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }

}
