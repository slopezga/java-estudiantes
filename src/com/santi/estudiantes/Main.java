package com.santi.estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa gestión de estudiantes");

        while (true) {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Agregar cursos");
            System.out.println("4. Ver cursos");
            System.out.println("5. Agregar cursos a un estudiante");
            System.out.println("0. Salir");
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
                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Código: ");
                String codigo = scanner.nextLine();
                System.out.println("Créditos");
                int creditos = scanner.nextInt();
                cursos.add(new Curso(nombre, codigo, creditos));
                System.out.println("Curso agregado con éxito.\n");
            } else if (opcion == 4) {
                if (cursos.isEmpty()) {
                    System.out.println("No hay cursos registrados.\n");
                } else {
                    for (int i = 0; i< cursos.size(); i++) {
                        System.out.println(i + ". ");
                        cursos.get(i).mostrarInfo();
                    }
                }
            }
            else if (opcion == 5) {
                if (estudiantes.isEmpty() || cursos.isEmpty()) {
                    System.out.println("Se debe contar con estudiantes y cursos registrados.");
                } else {
                    for (int i = 0; i< estudiantes.size(); i++) {
                        System.out.println(i + ". ");
                        estudiantes.get(i).mostrarInfo();
                    }
                    System.out.print("Seleccione el número del estudiante al cual desea agregar cursos: ");
                    int idEstudiante = scanner.nextInt();
                    for (int i = 0; i< cursos.size(); i++) {
                        System.out.println(i + ". ");
                        cursos.get(i).mostrarInfo();
                    }
                    System.out.print("Seleccione el número del curso a agregar: ");
                    int idCurso = scanner.nextInt();
                    Estudiante estudianteSeleccionado = estudiantes.get(idEstudiante);
                    if (estudianteSeleccionado != null) {
                        estudianteSeleccionado.agregarCurso(cursos.get(idCurso));
                    }
                }

            }
            else if (opcion == 0) {
                System.out.println("Cerrando programa...");
                break;
            } else {
                System.out.println("Opción inválida.\n");
            }
        }
        scanner.close();
    }
}