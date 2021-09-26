abstract class Producto {
    protected int codigo;
    protected int cantidad;
    protected int cantidadMinimaBodega;
    protected int cantidadMaximaInventario;
    protected double porcentajeDescuento;
    protected double precioDeVenta;
    protected double precioDeCompra;
    protected String descripcion;

    public Producto(int codigo, int cantidad, int cantidadMinimaBodega, int cantidadMaximaInventario, double porcentajeDescuento, double precioDeVenta, double precioDeCompra, String descripcion) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.cantidadMinimaBodega = cantidadMinimaBodega;
        this.cantidadMaximaInventario = cantidadMaximaInventario;
        this.porcentajeDescuento = porcentajeDescuento;
        this.precioDeVenta = precioDeVenta;
        this.precioDeCompra = precioDeCompra;
        this.descripcion = descripcion;
    }

    // Creacion de metoos abstractos de clase
    public abstract Boolean solicitarPedido(Boolean respuesta);
    public abstract double CantidadTotalAPagar(int UnidadesDeCompra);

    
}


class PrendasVestir extends Producto {

    public PrendasVestir() {
        super(1, 0, 0, 0, 0, 0, 0, "Prendas vestir");
    }

    @Override
    public Boolean solicitarPedido(Boolean respuesta) {
        return cantidadMinimaBodega > cantidadMaximaInventario ? true : false;
    }

    @Override
    public double CantidadTotalAPagar(int UnidadesDeCompra) {
        return (precioDeVenta * UnidadesDeCompra);
    }
}