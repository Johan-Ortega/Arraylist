
package arraylist;


class Producto {
    private String id;
    private String nombre;
    private double precio;
    private String descripcion;
    private int existencia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public void ActExistencia (int x){
        setExistencia(getExistencia()-x);
    }
    
    @Override
    public String toString(){
        return "ID: "+id+"  Producto: "+nombre+"    Precio: "+precio+"  Existencia: "+existencia;
    }
}
