package ports;

import domain.Producto;

public interface InventarioPort {
    void agregarProducto(String nombre, int cantidad);
    Producto buscarProducto(String nombre);
    void actualizarProducto(String nombre, int cantidad);
    void eliminarProducto(String nombre);
}
