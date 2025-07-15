package com.santi.estudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestion sistema = new SistemaGestion();
        
        System.out.println("Programa gestión de estudiantes");

        boolean activo = true;
        while (activo) {
            MenuUtils.mostrarMenuPrincipal();
            int opcion = MenuUtils.leerOpcionUsuario(scanner);
            scanner.nextLine();
            System.out.println("\n");


            switch (opcion) {
                case 1 -> sistema.agregarEstudiante(scanner);
                case 2 -> sistema.verEstudiantes();
                case 3 -> sistema.agregarCursos(scanner);
                case 4 -> sistema.verCursos();
                case 5 -> sistema.agregarCursosEstudiante(scanner);
                case 0 -> activo = false;
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}