package application;

import domain.Inventario;
import domain.Producto;
import java.util.HashMap;

public class InventarioService {
    private Inventario inventario;

    public InventarioService() {
        inventario = new Inventario();
    }

    public void agregarProducto(String nombre, int cantidad) {
        inventario.agregarProducto(nombre, cantidad);
    }

    public Producto buscarProducto(String nombre) {
        return inventario.buscarProducto(nombre);
    }

    public void actualizarProducto(String nombre, int cantidad) {
        inventario.actualizarProducto(nombre, cantidad);
    }

    public void eliminarProducto(String nombre) {
        inventario.eliminarProducto(nombre);
    }

    public HashMap<String, Producto> listarProductos() {
        return inventario.listarProductos();
    }
}
