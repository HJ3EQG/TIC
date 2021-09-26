public class Empleado {

    static int id; // Variable estatica que se incrementa con cada instanciacion de la clase de manera global.
    private String nombre;
    private String tipoContrato;
    private int salario;

    // Creacion del construcctor de la clase 'Empleado'
    public Empleado(String nombre, String tipoContrato, int salario) {
        // Asignacion de los atributos de la clase 'Empleado'
        //  El id de cada objeto instanciado se incrementa en 1 y se asociara con el id del objeto actual.
        id ++;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.salario = salario;
    }

    // Metodos para definir (setters) los atributos de la clase 'Empleado'
    public void setSalario(int valor) { this.salario = valor; }
    public void setNombre(String texto) { this.nombre = texto; }
    public void setTipoContrato(String tipo) { this.tipoContrato = tipo; }

    // Metodos para obtener (getters) los atributos de la clase 'Empleado'
    public int getSalario() { return this.salario; }
    public String getNombre() { return this.nombre; }
    public String getTipoContrato() { return this.tipoContrato; }

}