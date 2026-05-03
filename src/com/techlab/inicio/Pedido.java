package com.techlab.inicio;
import java.util.HashMap;
import java.util.Map;

public class Pedido {

    private int id;
    private Map<Producto, Integer> items = new HashMap<>();

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // agrega producto + cantidad
    public void agregarProducto(Producto p, int cantidad) {
        items.put(p, items.getOrDefault(p, 0) + cantidad);
    }

    // muestra el pedido
    public void mostrar() {
        System.out.println("Pedido #" + id);
        for (Producto p : items.keySet()) {
            int cant = items.get(p);
            System.out.println(p + " x" + cant);
        }
    }
}
