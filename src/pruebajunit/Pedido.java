package pruebajunit;
import java.util.List;
import java.util.ArrayList;

public class Pedido implements ICarrito{
    
    private final List<Producto> productos = new ArrayList<>();

    @Override
    public void agregar(Producto p) {
       this.productos.add(p);
    }

    @Override
    public int total() {
        int precio=0;
        
        for (Producto producto : productos) {
            precio= producto.getPrecio();
        }
        return precio;
    }
    
    @Override
    public int cantidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}