/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_mecanico;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class Taller_Mecanico  {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        // Inicio
        System.out.println("Bienvenido al sistema del Taller Mecánico\n");

        System.out.print("Ingresa la marca del vehículo: ");
        String marca = captu.nextLine();

        System.out.print("Ingresa el modelo del vehículo: ");
        String modelo = captu.nextLine();

        System.out.print("Ingresa el año del vehículo: ");
        String anio = captu.nextLine();

        // Selección de tipo de vehículo
        System.out.println("\nSelecciona el tipo de vehículo:");
        System.out.println("1. Automóvil chico");
        System.out.println("2. Automóvil mediano");
        System.out.println("3. Automóvil grande");
        System.out.println("4. Camión");
        System.out.println("5. Motocicleta");
        int tipo = captu.nextInt();

        double precioAfinacion = 0;
        double precioAceite = 0;
        double precioDesponchado = 0;
        double precioLlantas = 0;

        // Asignación de precios según tipo
        switch (tipo) {
            case 1:
                precioAfinacion = 1200;
                precioAceite = 450;
                precioDesponchado = 100;
                precioLlantas = 2000;
                break;
            case 2:
                precioAfinacion = 1400;
                precioAceite = 500;
                precioDesponchado = 120;
                precioLlantas = 2200;
                break;
            case 3:
                precioAfinacion = 1600;
                precioAceite = 550;
                precioDesponchado = 150;
                precioLlantas = 2500;
                break;
            case 4:
                precioAfinacion = 2000;
                precioAceite = 800;
                precioDesponchado = 200;
                precioLlantas = 3500;
                break;
            case 5:
                precioAfinacion = 800;
                precioAceite = 300;
                precioDesponchado = 80;
                precioLlantas = 1000;
                break;
            default:
                System.out.println("Opción no válida. Se aplicarán precios de automóvil mediano.");
                precioAfinacion = 1400;
                precioAceite = 500;
                precioDesponchado = 120;
                precioLlantas = 2200;
        }

        // Menú de servicios
        double total = 0;
        boolean afinacion = false;
        boolean aceite = false;
        boolean desponchado = false;
        boolean llantas = false;

        System.out.println("\nSelecciona los servicios realizados:");
        System.out.println("1. Afinación mayor ($" + precioAfinacion + ")");
        System.out.println("2. Cambio de aceite ($" + precioAceite + ")");
        System.out.println("3. Desponchado ($" + precioDesponchado + ")");
        System.out.println("4. Cambio de llantas ($" + precioLlantas + ")");
        System.out.println("5. Finalizar selección");

        int opcion;
        do {
            System.out.print("Opción: ");
            opcion = captu.nextInt();

            switch (opcion) {
                case 1:
                    if (!afinacion) {
                        total += precioAfinacion;
                        afinacion = true;
                    }
                    break;
                case 2:
                    if (!aceite) {
                        total += precioAceite;
                        aceite = true;
                    }
                    break;
                case 3:
                    if (!desponchado) {
                        total += precioDesponchado;
                        desponchado = true;
                    }
                    break;
                case 4:
                    if (!llantas) {
                        total += precioLlantas;
                        llantas = true;
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        // Ticket de compra
        System.out.println("\n--- TICKET DE COMPRA ---");
        System.out.println("Vehículo: " + marca + " " + modelo + " " + anio);
        System.out.println("Servicios realizados:");

        if (afinacion) System.out.println("- Afinación mayor: $" + precioAfinacion);
        if (aceite) System.out.println("- Cambio de aceite: $" + precioAceite);
        if (desponchado) System.out.println("- Desponchado: $" + precioDesponchado);
        if (llantas) System.out.println("- Cambio de llantas: $" + precioLlantas);

        System.out.println("Total a pagar: $" + total);
    }
}

    

