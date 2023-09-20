
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class CatalogoProducto {
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public void AProducto (Producto pro){
        productos.add(pro);
    }
    
    public Producto Buscar (String id){
        Producto p = new Producto();
        Producto pro;
        Iterator<Producto> noproductos = productos.iterator();
        while (noproductos.hasNext()) {
            pro = noproductos.next();
            if(id.compareTo(pro.getId())==0){
                p = pro;
                break;
            }
        }
        return p;
    }
    public ArrayList<Producto> Traerproductos(){
            return productos;
        }
        public void mosProductos(){
        Iterator<Producto> noproductos = productos.iterator();
            while (noproductos.hasNext()) {
                 System.out.println(noproductos.next());
                
            }
        }
        }
    
    
