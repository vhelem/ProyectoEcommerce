package com.techlab.inicio;

public class ProductoDigital extends Producto {

    private double tamañoMB;
    private String formato;

    // constructor
    public ProductoDigital(String nombre, double precio, int id, double tamañoMB, String formato) {
        super(nombre, precio, id);
        this.tamañoMB = tamañoMB;
        this.formato = formato;
    }

    // getters
    public double getTamañoMB() {
        return tamañoMB;
    }

    public String getFormato() {
        return formato;
    }

    // setters
    public void setTamañoMB(double tamañoMB) {
        this.tamañoMB = tamañoMB;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " - Tamaño: " + tamañoMB + "MB - Formato: " + formato;
    }
}