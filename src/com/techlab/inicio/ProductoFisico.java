package com.techlab.inicio;

public class ProductoFisico extends Producto {

    private double peso;
    private int stock;

    // constructor
    public ProductoFisico(String nombre, double precio, int id, double peso, int stock) {
        super(nombre, precio, id); // llama al constructor de Producto
        this.peso = peso;
        this.stock = stock;
    }

    // getters - setters
    public double getPeso() {
        return peso;
    }

    public int getStock() {
        return stock;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " - Stock: " + stock + " - Peso: " + peso + "kg";
    }
}

