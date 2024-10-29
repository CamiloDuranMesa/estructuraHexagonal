package domain;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, int cantidad) {
        productos.put(nombre, new Producto(nombre, cantidad));
    }

    public Producto buscarProducto(String nombre) {
        return productos.get(nombre);
    }

    public void actualizarProducto(String nombre, int cantidad) {
        Producto producto = productos.get(nombre);
        if (producto != null) {
            producto.setCantidad(cantidad);
        }
    }

    public void eliminarProducto(String nombre) {
        productos.remove(nombre);
    }

    public HashMap<String, Producto> listarProductos() {
        return productos;
    }
}
