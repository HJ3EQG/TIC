package Cps12;
/*●
●	Calzado (como lo son tenis, calzado formal, sandalias, etc)
    el cual debe tener el siguiente parámetro adicional:
○	Talla: 35, 36, 37, etc

*/
public class Calzado extends Producto implements Vista{
    private int talla;

    // constructor
    public Calzado(int codigo, String desc, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxpermitida, int talla) {
        super(codigo, desc, pCompra, pVenta, cBodega, cMinRequerida, cMaxpermitida);
        this.talla = talla;
    }

    // SOLICITAR PEDIDO
    @Override
    public boolean solicitar() {
        // if(cBodega<cMinRequerida){
        //     return true;
        // }else{
        //     return false;
        // }
        return cBodega < cMinRequerida ? true : false;
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

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

      



     
      

   
    
}
