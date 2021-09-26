public class Empleado {

    static int id; // Variable estatica que se incrementa con cada instanciacion de la clase de manera global.
    private String nombre;
    private String email;
    private String tipoContrato;
    private int salario;
    private String especialidad;

    // Creacion del construcctor de la clase 'Empleado'
    public Empleado(String nombre, String email, String tipoContrato, int salario,  String especialidad) {
        // Asignacion de los atributos de la clase 'Empleado'
        //  El id de cada objeto instanciado se incrementa en 1 y se asociara con el id del objeto actual.
        id ++;
        this.salario = salario;
        this.nombre = nombre;
        this.email = email;
        this.tipoContrato = tipoContrato;
        this.especialidad = especialidad;
    }

    // Metodos para definir (setters) los atributos de la clase 'Empleado'
    public void setSalario(int valor) { this.salario = valor; }
    public void setNombre(String texto) { this.nombre = texto; }
    public void setEmail(String email) { this.email = email; }
    public void setTipoContrato(String tipo) { this.tipoContrato = tipo; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    // Metodos para obtener (getters) los atributos de la clase 'Empleado'
    public int getSalario() { return this.salario; }
    public String getNombre() { return this.nombre; }
    public String getEmail() { return this.email; }
    public String getTipoContrato() { return this.tipoContrato; }
    public String getEspecialidad() { return this.especialidad; }

    // Metodo para calcular los costos adicionales de la salud del empleado
    public double liquidarSalud(Empleado empleado) {
        // Variable auxiliar que almacena el total de costos de salud del empleado
        double total = 0;
        total += empleado.getSalario() * 0.085; // Seguridad social
        total += empleado.getSalario() * 0.12;  // Salud
        total += empleado.getSalario() * 0.00522;// Pension
        return total;
    }
}