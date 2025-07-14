package com.santi.estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa gestión de estudiantes");

        while (true) {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Edad: ");
                int edad = scanner.nextInt();
                System.out.println("Promedio");
                double promedio = scanner.nextDouble();
                estudiantes.add(new Estudiante(nombre, edad, promedio));
                System.out.println("Estudiante agregado con éxito.\n");
            }  else if (opcion == 2) {
                if (estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.\n");
                } else {
                    for (Estudiante est : estudiantes) {
                        est.mostrarInfo();
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Cerrando programa...");
                break;
            } else {
                System.out.println("Opción inválida.\n");
            }
        }
        scanner.close();
    }
}