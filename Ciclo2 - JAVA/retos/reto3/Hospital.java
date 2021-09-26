import java.util.ArrayList; // import the ArrayList class

public class Hospital {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    // Metos getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Empleado getEmpleados(int index) { return empleados.get(index); }
    public void setEmpleados(Empleado empleado) { empleados.add(empleado); }

    // Resta del salario los gastos adiciónales
    public static double liquidarNominaEmpleado(Empleado empleado) {
        double total = 0;
        // Resta del salario del empleado los porcentajes de salud (4%) y pension (4%)
        total = empleado.getSalario() - (empleado.getSalario() * 0.08);
        return total;
    }

    // Calcula los costos adicionales de la salud del empleado
    public static double liquidarSaludEmpleado(Empleado empleado) {
        // Variable auxiliar que almacena el total de costos de salud del empleado
        double total = 0;
        total += empleado.getSalario() * 0.085; // Seguridad social
        total += empleado.getSalario() * 0.12;  // Salud
        total += empleado.getSalario() * 0.00522;// Pension
        return total;
    }

    // Calcula la liquidacion de las prestaciones del empleado
    public static double liquidarPrestacionesEmpleado(Empleado empleado) {
        double total = 0;
        double prima = empleado.getSalario() * 0.0833;
        double cesantia = empleado.getSalario() * 0.0833;
        double interesCesantia = cesantia * 12 / 100;
        double vacaciones = empleado.getSalario() * 0.0416;

        total += prima + cesantia + interesCesantia + vacaciones;
        return total;
    }

    // Calcula los costos parafiscales del empleado
    public static double liquidarParafiscalesEmpleado(Empleado empleado) {
        double total = 0;
        total += empleado.getSalario() * 0.04;  // Caja de compensación
        total += empleado.getSalario() * 0.03;  // ICBF
        total += empleado.getSalario() * 0.02;  // SENA
        return total;
    }
}
