package com.santi.estudiantes;

import java.util.Scanner;

public class MenuUtils {
    public static void mostrarMenuPrincipal() {
        System.out.println("\n--Menú--");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Ver estudiantes");
        System.out.println("3. Agregar cursos");
        System.out.println("4. Ver cursos");
        System.out.println("5. Agregar cursos a un estudiante");
        System.out.println("0. Salir");
    }

    public static int leerOpcionUsuario(Scanner scanner) {
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }
}
