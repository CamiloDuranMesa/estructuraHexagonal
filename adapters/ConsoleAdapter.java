package adapters;

import application.InventarioController;
import domain.Producto;

import java.util.HashMap;
import java.util.Scanner;

public class ConsoleAdapter {
    private InventarioController controller;

    public ConsoleAdapter() {
        controller = new InventarioController();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int seleccion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Actualizar cantidad de producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            seleccion = scanner.nextInt();
            scanner.nextLine();

            switch (seleccion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidadProducto = scanner.nextInt();
                    controller.agregarProducto(nombreProducto, cantidadProducto);
                    System.out.println("El producto ha sido agregado");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto que desea buscar: ");
                    nombreProducto = scanner.nextLine();
                    Producto productoBuscado = controller.buscarProducto(nombreProducto);
                    if (productoBuscado != null) {
                        System.out.println("El producto llamado: " + nombreProducto + " con una cantidad de " + productoBuscado.getCantidad() + " unidades en stock");
                    } else {
                        System.out.println("El producto no ha sido encontrado");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto que desea actualizar: ");
                    nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese la nueva cantidad de stock: ");
                    cantidadProducto = scanner.nextInt();
                    controller.actualizarProducto(nombreProducto, cantidadProducto);
                    System.out.println("El producto " + nombreProducto + " ahora tiene una cantidad de " + cantidadProducto + " en el stock");
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto que desea eliminar: ");
                    nombreProducto = scanner.nextLine();
                    controller.eliminarProducto(nombreProducto);
                    System.out.println("El producto " + nombreProducto + " ha sido eliminado");
                    break;

                case 5:
                    System.out.println("Inventario de productos:");
                    HashMap<String, Producto> productos = controller.listarProductos();
                    for (String clave : productos.keySet()) {
                        System.out.println("Producto: " + clave + " - Cantidad en stock: " + productos.get(clave).getCantidad());
                    }
                    break;

                case 6:
                    System.out.println("Espero que haya disfrutado en la tienda");
                    break;

                default:
                    System.out.println("La opción que seleccionó no está disponible");
                    break;
            }

        } while (seleccion != 6);
        scanner.close();
    }
}
