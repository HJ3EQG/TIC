package Cps12;
/*
Implementar una super clase abstracta llamada Producto, la cual tenga los siguientes atributos y métodos.

Atributos:
●	Código.
●	Descripción.
●	Precio de compra.
●	Precio de venta.
●	Cantidad en bodega.
●	Cantidad mínima requerida en bodega.
●	Cantidad máxima de inventario permitida.
●	Porcentaje de Descuento.

Métodos abstractos:
●	Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.
●	Calcular total a pagar : devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades de compra.

*/
public abstract class Producto {

    protected int codigo; 
    protected String desc; 
    protected int pCompra; 
    protected int pVenta; 
    protected int cBodega; 
    protected int cMinRequerida; 
    protected int cMaxpermitida; 
    protected static double pDescuento=0.01;

    public Producto(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida,
            int cMaxpermitida) {
        this.codigo = codigo;
        this.desc = desc;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxpermitida = cMaxpermitida;
    }

    public abstract boolean solicitar();

    public abstract double totalApagar(double unidades);

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
    }

    public int getcBodega() {
        return cBodega;
    }

    public void setcBodega(int cBodega) {
        this.cBodega = cBodega;
    }

    public int getcMinRequerida() {
        return cMinRequerida;
    }

    public void setcMinRequerida(int cMinRequerida) {
        this.cMinRequerida = cMinRequerida;
    }

    public int getcMaxpermitida() {
        return cMaxpermitida;
    }

    public void setcMaxpermitida(int cMaxpermitida) {
        this.cMaxpermitida = cMaxpermitida;
    }

    public static double getpDescuento() {
        return pDescuento;
    }

    public static void setpDescuento(double pDescuento) {
        Producto.pDescuento = pDescuento;
    }


    




    




    
}
