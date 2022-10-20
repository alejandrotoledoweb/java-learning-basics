package com.example.EmpleadosInterface;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        EmpleadoCRUDMySQL empleadoCRUDMySQL = new EmpleadoCRUDMySQL();

        Empleado juanito = new Empleado("Juanito", 34, 2004.33, true);
        Empleado patricia = new Empleado("Patricia", 34, 2004.33, true);

        // sin interface
        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);

        //con interface
        empleadoCRUDMySQL.guardar(juanito);
        empleadoCRUDMySQL.guardar(patricia);

        //consultar todos los empleados

        List<Empleado> todosLosEmpleados = empleadoCRUD.findAll();
        System.out.println(todosLosEmpleados);
    }
}
