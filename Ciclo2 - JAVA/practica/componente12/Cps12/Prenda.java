package Cps12;
/*●	Prendas de vestir (como lo son blusas, jeans, camisas, etc) el cual debe tener los siguientes 
parámetros adicionales:
○	Talla: S, M, L, etc
○	Permite planchado: verdadero o falso.
*/
public class Prenda extends Producto implements Vista{

    private String talla;
    private boolean planca;


    public Prenda(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxpermitida,
            String talla, boolean planca) {
        super(codigo, desc, pCompra, pVenta, cBodega, cMinRequerida, cMaxpermitida);
        this.talla = talla;
        this.planca = planca;
    }

    // SOLICITAR PEDIDO
    @Override
    public boolean solicitar() {
        if(cBodega<cMinRequerida){
            return true;
        }else{
            return false;
        }
    }
    //TOTAL APAGAR
    @Override
    public double totalApagar(double unidades) {
        return (unidades*pCompra);
    }


    @Override
    public void mostrarLite1() {
        System.out.println(getCodigo()+ " - " + getDesc());
        
    }

    @Override
    public void mostrarLite2() {
        System.out.println(getCodigo()+ " - " + getDesc()+  " - " + getpCompra() + "- "+ getpVenta());
        
    }


    @Override
    public void mostrarTodo() {
        System.out.println(getCodigo()+ " - " + getDesc()+  " - " + getpCompra() + " - "+ getpVenta()+
        " - " + getcBodega() +  " - " + getcMinRequerida() +  " - " + getcMaxpermitida());
        
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlanca() {
        return planca;
    }

    public void setPlanca(boolean planca) {
        this.planca = planca;
    }
    

    

    
}
