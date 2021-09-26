package Cps12;
/*Diseñar un programa que:

●	Consulte el número de productos de tipo de prendas de vestir a manejar.
●	Consulte el número de productos de tipo calzado a manejar.
●	Cree un vector de productos de prendas de vestir en el cual se guardarán las instancias de cada uno de ellos.
●	Cree un vector de productos de calzado en el cual se guardarán las instancias de cada uno de ellos.
●	Solicite los datos requeridos para cada tipo de producto a guardar.

Implemente en la clase principal un menú con las siguientes opciones:
●	Consultar producto: solicite el código de un producto a vender, el tipo (calzado o prenda) y muestre la información del mismo.
●	Verificar productos a pedir: recorrer los vectores de productos y arrojar una alerta en caso tal se deba solicitar el pedido al proveedor.
●	Calzado con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
●	Prenda con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
●	Modificar cantidad mínima requerida en bodega: leer código de producto, el tipo (calzado o prenda) y el nuevo valor para la cantidad de unidades mínimas requeridas, validar en el método set de la variable correspondiente que la nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima como 0.
●	Vender producto: solicite el código de un producto a vender, el tipo (calzado o prenda), y las unidades correspondientes, calcule el valor de la factura con descuento y sin descuento. Validar que existan las unidades necesarias para la venta y modificar las unidades existentes después de la venta utilizando el método set de la variable correspondiente.

Para tener en cuenta: el porcentaje de descuento es el mismo para todos los productos, y es del 1%.
*/
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Consulte el número de productos de tipo de prendas de vestir a manejar.
        System.out.println(" Digite la cantidad de productos de Prendas: ");
        int np = Integer.parseInt(sc.nextLine());

//●	Cree un vector de productos de prendas de vestir

        Prenda productosP[] = new Prenda[np];

// Solicite los datos requeridos para cada tipo de producto a guardar.

        for( int i = 0; i < np ; i++){
            System.out.println("Digite El codigo del Producto");
            int cod = Integer.parseInt(sc.nextLine());
            System.out.println("Digite El precio de Compra del Producto");
            int vCompra = Integer.parseInt(sc.nextLine());
            System.out.println("Digite El precio de venta del Producto");
            int vVenta = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad en Bodega del Producto");
            int cantB = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad minima requierda en Bodega");
            int cMin = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad maxima de inventario permitida");
            int cantM = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la descripción del producto");
            String desc = sc.nextLine();
            System.out.println("Digite la talla del producto");
            String Talla = sc.nextLine();
            System.out.println("Digite 1 si sepuede planchar el producto - 0 : En caso contrario");
            String pla = sc.nextLine();

            if (pla.equalsIgnoreCase("1")) {
                productosP[i]= new Prenda(cod, desc, vCompra, vVenta, cantB, cMin, cantM, Talla, true);
            }
            else {
                productosP[i]= new Prenda(cod, desc, vCompra, vVenta, cantB, cMin, cantM, Talla, false);
            }


        }


//●	Consulte el número de productos de tipo calzado a manejar.
        System.out.println(" Digite la cantidad de productos de Calzado: ");
        int nc = Integer.parseInt(sc.nextLine());
//●	Cree un vector de productos de calzado en el cual se

        Calzado productosC[] = new Calzado[nc];
//●	Solicite los datos requeridos para cada tipo de producto a guardar.
        for( int i = 0; i < nc ; i++){
            System.out.println("Digite El codigo del Producto");
            int cod = Integer.parseInt(sc.nextLine());
            System.out.println("Digite El precio de Compra del Producto");
            int vCompra = Integer.parseInt(sc.nextLine());
            System.out.println("Digite El precio de venta del Producto");
            int vVenta = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad en Bodega del Producto");
            int cantB = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad minima requierda en Bodega");
            int cMin = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la cantidad maxima de inventario permitida");
            int cantM = Integer.parseInt(sc.nextLine());
            System.out.println("Digite la descripción del producto");
            String desc = sc.nextLine();
            System.out.println("Digite la talla del producto");
            int Talla = Integer.parseInt(sc.nextLine());

            productosC[i]= new Calzado(cod, desc, vCompra, vVenta, cantB, cMin, cantM, Talla);
        }
        // MENU PRINCIPAL
        System.out.println();
        boolean salir = false;
        do{
            System.out.println(" Menu de Opciones");
            System.out.println(" 1. Consultar Productos");
            System.out.println(" 2. Verificar productos a pedir de Calzado y Prendas");
            System.out.println(" 3. Calzado con mayor cantidad de unidades");
            System.out.println(" 4. Prenda con mayor cantidad de unidades");
            System.out.println(" 5. Modificar cantidad mínima requerida en bodega");
            System.out.println(" 6. Vender producto");
            System.out.println(" 7. Salir");
            System.out.println(" Digite la opción deseada:  ");
            int op= sc.nextInt();
            sc.nextLine();
            System.out.println();
            int cp, cv;
            String tp;
            boolean sw;

            switch (op) {
                case 1:
                    System.out.println(" 1. Consultar Productos");
                    System.out.println(" Digite el codigo del Productos: ");
                    cp= Integer.parseInt(sc.nextLine());
                    System.out.println(" Digite el tipo de producto (P: Prenda - C: Calzado): ");
                    tp=sc.nextLine();
                    sw=true;
                    if (tp.equalsIgnoreCase("p")){
                        for( int i = 0; i < np ; i++){
                            if(productosP[i].getCodigo()==cp){
                                productosP[i].mostrarTodo();
                                sw=false;
                                break;
                            }
                        }
                        if(sw) {
                            System.out.println(" Codigo no encontrado ");
                        }
                    }
                    else {
                        for( int i = 0; i < nc ; i++){
                            if(productosC[i].getCodigo()==cp){
                                productosC[i].mostrarTodo();
                                sw=false;
                                break;
                            }
                        }
                        if(sw){
                            System.out.println(" Codigo no encontrado ");
                        }
                    }

                case 2:

                    break;

                default:
                    break;
            }

        }while(!salir);
        sc.close();

}

}
