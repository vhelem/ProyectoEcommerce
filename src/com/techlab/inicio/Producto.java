package com.techlab.inicio;
//clase abstracta - base de la jerarquía de productos
// no se puede instanciar directamente

public abstract class Producto {
    private String nombre;
    private double precio;
    private int id;

    // constructor
    public Producto(String nombre, double precio, int id){
        this.nombre = nombre.trim().toUpperCase();
        this.precio = precio;
        this.id = id;
    }

    // getters - setters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getId() {return id; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return id + " - " + nombre + " - $" + precio;
    }


}
