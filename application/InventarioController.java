package application;

import domain.Producto;
import java.util.HashMap;

public class InventarioController {
    private InventarioService inventarioService;

    public InventarioController() {
        inventarioService = new InventarioService();
    }

    public void agregarProducto(String nombre, int cantidad) {
        inventarioService.agregarProducto(nombre, cantidad);
    }

    public Producto buscarProducto(String nombre) {
        return inventarioService.buscarProducto(nombre);
    }

    public void actualizarProducto(String nombre, int cantidad) {
        inventarioService.actualizarProducto(nombre, cantidad);
    }

    public void eliminarProducto(String nombre) {
        inventarioService.eliminarProducto(nombre);
    }

    public HashMap<String, Producto> listarProductos() {
        return inventarioService.listarProductos();
    }
}
