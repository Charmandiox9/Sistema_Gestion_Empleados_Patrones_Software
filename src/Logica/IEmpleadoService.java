package Logica;

import Dominio.Empleado;

public interface IEmpleadoService {
    void agregarEmpleado (Empleado empleado);
    Empleado obtenerEmpleado (String nombre);
    void eliminarEmpleado (String nombre);
    void actualizarEmpleado (Empleado empleado);
}
