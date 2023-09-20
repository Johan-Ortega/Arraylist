
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;


class Venta {
    private String id;
    private String fecha;
    private ArrayList<Producto> productos;
    private ArrayList<Integer> elementos;
    private double suma = 0;
    
    public Venta()
    {
        productos = new ArrayList<Producto>();
        elementos = new ArrayList<Integer>();
    }
    
    public void setid(String id)
    {
        this.id=id;
    }
    
    public String getid()
    {
        return id;
    }
    
    public void setfecha(String fecha)
    {
        this.fecha=fecha;
    }
    
    public String getfecha()
    {
        return fecha;  
    }    

    public ArrayList<Integer> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Integer> elementos) {
        this.elementos = elementos;
    }
    
    public ArrayList<Producto> getproducto()
    {
        return productos;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
    
    public void AgProducto(Producto producto, int x){
        productos.add(producto);
        elementos.add(x);
        producto.ActExistencia(x);
    }
    public void InfoVenta(){
        Iterator<Producto> noproductos = productos.iterator();
        System.out.print("\nInformacion de la venta");
        System.out.println("\nNumero de venta: "+id+" Fecha: "+fecha);
        System.out.println(noproductos.next()+"     Productos vendidos: "+productos.size());
        System.out.println("Total de venta: "+getSuma());
    }
    
    public void Sumatotal(double y, int x){
        setSuma(getSuma()+x*y);
    }
}