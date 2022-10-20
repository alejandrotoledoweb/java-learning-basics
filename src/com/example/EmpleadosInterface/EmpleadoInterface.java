package com.example.EmpleadosInterface;

import java.util.List;

public interface EmpleadoInterface {

    /**
     * se declara los métodos, no se implementan
     *
     * Actua como un contrato, se dice lo que hay que hacer pero no lo hace
     */

     void guardar(Empleado empleado);

     List<Empleado> findAll();

     void delete(Empleado empleado);

}
