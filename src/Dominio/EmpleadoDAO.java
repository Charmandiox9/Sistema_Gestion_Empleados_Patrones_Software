package Dominio;

import Logica.IEmpleadoDAO;

import java.util.ArrayList;

public class EmpleadoDAO implements IEmpleadoDAO {

    ArrayList<Empleado> empleados = new ArrayList();

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        for(Empleado empleado : empleados){
            if(empleado.getNombre().equals(nombre)){
                return empleado;
            }
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        for(Empleado empleado : empleados){
            if(empleado.getNombre().equals(nombre)){
                empleados.remove(empleado);
            }
        }
    }

    @Override
    public void actualizarEmpleado(Empleado emp) {
        for(Empleado empleado1 : empleados){
            if(empleado1.getNombre().equals(emp.getNombre())){
                empleado1.setPuesto("Director");
                empleado1.setSalario(750.00);
            }
        }
    }

}
