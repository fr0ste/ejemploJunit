package pruebajunit;

public interface ICarrito {

    void agregar(Producto p);

    int cantidad();

    int total();

    void vaciar();
}
