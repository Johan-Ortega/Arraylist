
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Caja {
    private String Crear;
    private CatalogoProducto catProd;
    private ArrayList<Venta> aVenta = new ArrayList<Venta>();
    private int x=0;
    
    
    public Caja(String Crear)
    {
        setCrear(Crear);
        catProd=new CatalogoProducto();
    }
    
   
    
    public void setCrear(String Crear)
    {
        this.Crear=Crear;
    }
    
    public String getCrear()
    {
        return Crear;
    }
      
    public void AProductoC()
    {   
        Producto producto=new Producto();
        System.out.println("Intoduce el codigo del Producto: ");
        producto.setId(Leer.datoString());
        System.out.println("Introduce el nombre del Producto");
        producto.setNombre(Leer.datoString());
        System.out.println("Descripción del Producto: ");
        producto.setDescripcion(Leer.datoString());
        System.out.println("Precio del Producto: ");
        producto.setPrecio(Leer.datoDouble());
        System.out.println("Existencia del Producto: ");
        producto.setExistencia(Leer.datoInt());
        catProd.AProducto(producto);
    }
    
    public void MostCatalogoProd()
    {
        System.out.println("Catalogo de productos: ");
        catProd.mosProductos();
    }
    
    private Producto BuscarProductoCtg()
    {         
        return catProd.Buscar(Leer.datoString());
    }
    
    public void AgVenta()
    {   String opcion;
        Producto prod;
        int x;
        Venta venta=new Venta();
        System.out.println("Id Venta: ");
        venta.setid(Leer.datoString());
        System.out.println("Fecha de la Venta: ");
        venta.setfecha(Leer.datoString());
        System.out.println("Intoduce los codigos de los productos de la venta: ");
        do
        {
            System.out.println("Introduce codigo: ");
            prod=BuscarProductoCtg();
            if(prod.getId()!=null)
            {
              System.out.println(" Selecciona la cantidad del producto: ");
              x=Leer.datoInt();
              if(x <= prod.getExistencia()){
                    venta.AgProducto(prod, x);
                    venta.Sumatotal(prod.getPrecio(), x);
                    System.out.println(" El producto se agrego a la venta."); 
              } else 
                  System.out.println("¡¡¡¡¡¡No hay suficientes productos!!!!!!");
                           
            } else
                System.out.println("¡¡¡¡¡¡  No existe el producto en el catalogo !!!!!! ");
            System.out.println("¿Desea añadir un nuevo producto a la venta[Ss/Nn]? ");
            opcion = Leer.datoString();     
        } while (opcion.toUpperCase().equals("S"));
        
        aVenta.add(venta);
        System.out.println("------------Venta exitosa------------");
    }
       
    public ArrayList<Venta> getVenta(){
        return aVenta;
    }
    
   public void MosVentas(){
       
       Iterator<Venta> NoVentas = aVenta.iterator();
       
       System.out.println("...VENTAS...");
       
       while (NoVentas.hasNext()) {
           NoVentas.next().InfoVenta();
       }
   }
}
