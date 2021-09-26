public class Doctor extends Empleado {
    private String especialidad;

    // Constructor de la clase
    Doctor(String nombre, String tipoContrato, int salario,  String especialidad) {
        // Se invoca al constructor de la super clase
        super(nombre, tipoContrato, salario);
        this.especialidad = especialidad;
    }

    // Metodos getters y setters
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public String getEspecialidad() { return this.especialidad; }
}
