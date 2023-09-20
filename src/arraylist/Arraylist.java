
package arraylist;

public class Arraylist {

    public static void main(String[] args) {
        Caja caja = new Caja("Distribuidora equis");
        String opcion;
        System.out.println("------------Agregar productos al catalogo------------");
        do
        {
            caja.AProductoC();
            System.out.println("¿Desea agregar un producto mas al catalogo [Ss/Nn]?");
            opcion = Leer.datoString();
        }
        while (opcion.toUpperCase().equals("S"));
        System.out.println("------------Hacer ventas------------");
        do
        {
            caja.MostCatalogoProd();
            caja.AgVenta();
            System.out.println("¿Desea agregar una venta mas [Ss/Nn]:?");
            opcion = Leer.datoString();
        }
        while (opcion.toUpperCase().equals("S"));
        
        caja.MosVentas();
    }
    }
