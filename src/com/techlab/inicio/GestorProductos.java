package com.techlab.inicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestorProductos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList<Producto> - Lista dinámica, crece sola con cada add()
        // <Producto> permite guardar cualquier subclase gracias al polimorfismo
        // métodos utilizados: add() - get() - size()

        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int contadorPedidos = 1;
        int opcion = 0;

        do {

            System.out.println("\n--- MENÚ ---\n");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar/Actualizar productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Crear Pedido");
            System.out.println("6. Listar Pedidos");
            System.out.println("7. Salir");

            try {

                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

            } catch (InputMismatchException e) {

                System.out.println("Error: debe ingresar un número válido.");
                sc.nextLine(); // limpiar buffer
                opcion = 0;
                continue;
            }

            switch (opcion) {

                // add
                case 1:

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();

                    Producto p = new ProductoFisico(nombre, precio, id, peso, stock);
                    productos.add(p);

                    System.out.println("Producto agregado");
                    break;

                // listar
                case 2:

                    if (productos.isEmpty()) {

                        System.out.println("No hay productos agregados");

                    } else {

                        for (Producto prod : productos) {
                            System.out.println(prod);
                        }
                    }

                    break;

                // update
                case 3:

                    System.out.println("ID a modificar: ");
                    int idMod = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (Producto prod : productos) {

                        if (prod.getId() == idMod) {

                            System.out.println("Ingresa nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();

                            System.out.println("Ingresa nuevo precio: ");
                            double nuevoPrecio = sc.nextDouble();

                            prod.setNombre(nuevoNombre);
                            prod.setPrecio(nuevoPrecio);

                            System.out.println("Producto actualizado");

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Producto NO encontrado");
                    }

                    break;

                // borrar - Delete
                case 4:

                    System.out.println("ID a eliminar: ");
                    int idDel = sc.nextInt();

                    boolean eliminado = productos.removeIf(prod -> prod.getId() == idDel);

                    if (eliminado) {

                        System.out.println("Producto eliminado");

                    } else {

                        System.out.println("No se encontró el producto");
                    }

                    break;

                // crear pedido
                case 5:

                    Pedido pedido = new Pedido(contadorPedidos++);

                    System.out.print("¿Cuántos productos querés agregar? ");
                    int cantidadProductos = sc.nextInt();

                    for (int i = 0; i < cantidadProductos; i++) {

                        System.out.print("ID del producto: ");
                        int idBuscado = sc.nextInt();

                        Producto encontradoProd = null;

                        // buscar producto
                        for (Producto prod : productos) {

                            if (prod.getId() == idBuscado) {

                                encontradoProd = prod;
                                break;
                            }
                        }

                        if (encontradoProd == null) {

                            System.out.println("Producto no encontrado");
                            i--; // repetir intento
                            continue;
                        }

                        System.out.print("Cantidad: ");
                        int cantidad = sc.nextInt();

                        // validar stock SOLO si es físico
                        if (encontradoProd instanceof ProductoFisico) {

                            ProductoFisico pf = (ProductoFisico) encontradoProd;

                            if (pf.getStock() < cantidad) {

                                System.out.println("Stock insuficiente. Cantidad disponible: " + pf.getStock());
                                i--;
                                continue;
                            }

                            pf.setStock(pf.getStock() - cantidad); // descontar stock
                        }

                        pedido.agregarProducto(encontradoProd, cantidad);
                    }

                    pedidos.add(pedido);

                    System.out.println("Pedido creado");

                    break;

                // listar pedidos
                case 6:

                    if (pedidos.isEmpty()) {

                        System.out.println("No hay pedidos");

                    } else {

                        for (Pedido ped : pedidos) {

                            ped.mostrar();
                            System.out.println("-----------------");
                        }
                    }

                    break;

                case 7:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);

        sc.close();
    }
}