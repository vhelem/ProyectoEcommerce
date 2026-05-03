package com.techlab.inicio;

import java.util.Scanner;

public class ScTest {
    public static void main(String[] args) {
        // crear obj scanner y solicitar nombre
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica tu nombre :");
        String nombreCliente = sc.nextLine();
        // mostrar bienvenida
        System.out.println("Bienvenidx a la tienda, " + nombreCliente + "!");

    }

}
