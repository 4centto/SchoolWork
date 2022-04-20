
package mx.unam.aragon.fes;

public class UsarEmpleado {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado();
        empleado.setNombre("Ivan");
        empleado.setSueldo(10000);
        empleado.setHorasExtra(10);
        
        System.out.println("El sueldo mensual de " + empleado.getNombre() + " es: " + empleado.CalcularSueldo());
        
    }
}
