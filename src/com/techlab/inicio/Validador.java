package com.techlab.inicio;

public class Validador {

    // valida que el nombre no esté vacío
    public static String validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        return nombre.trim();
    }

    // valida que el precio sea positivo
    public static double validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
        return precio;
    }

    // valida que el stock no sea negativo
    public static int validarStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        return stock;
    }

    // valida cantidad de pedido
    public static int validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        return cantidad;
    }
}
