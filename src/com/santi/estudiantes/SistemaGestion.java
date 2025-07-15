package com.santi.estudiantes;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaGestion {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Curso> cursos = new ArrayList<>();

    public SistemaGestion() {
        estudiantes.add(new Estudiante("Santiago", 23, 3.5));
        estudiantes.add(new Estudiante("Valentina", 21, 4.5));
        estudiantes.add(new Estudiante("Julián", 18, 2.5));

        cursos.add(new Curso("Matemáticas", "25F", 4));
        cursos.add(new Curso("Física", "24F", 4));
        cursos.add(new Curso("Biología", "23F", 3));
    }

    public void agregarEstudiante(Scanner scanner) {
        System.out.println("--Agregar estudiante--");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        estudiantes.add(new Estudiante(nombre, edad, promedio));
        System.out.println("Estudiante agregado con éxito.\n");
    }

    public void verEstudiantes() {
        System.out.println("--Ver estudiantes--");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.\n");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println("------------");
                System.out.print(i + ". ");
                estudiantes.get(i).mostrarInfo();
                System.out.println("------------");
            }
        }
    }

    public void agregarCursos(Scanner scanner) {
        System.out.println("--Agregar cursos--");
        System.out.print("Nombre curso: ");
        String nombre = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Créditos: ");
        int creditos = scanner.nextInt();
        cursos.add(new Curso(nombre, codigo, creditos));
        System.out.println("Curso agregado con éxito.\n");
    }

    public void verCursos() {
        System.out.println("--Ver cursos--");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.\n");
        } else {
            for (int i = 0; i < cursos.size(); i++) {
                System.out.print(i + ". ");
                cursos.get(i).mostrarInfo();
            }
        }
    }

    public void agregarCursosEstudiante(Scanner scanner) {
        System.out.println("--Agregar cursos a un estudiante--");
        if (estudiantes.isEmpty() || cursos.isEmpty()) {
            System.out.println("Se debe contar con estudiantes y cursos registrados.");
        } else {
            System.out.println("Listado de estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.print(i + ". ");
                estudiantes.get(i).mostrarInfo();
                System.out.println("\n");
            }
            System.out.print("Seleccione el número del estudiante al cual desea agregar cursos: ");
            int idEstudiante = scanner.nextInt();
            System.out.println("\n");
            for (int i = 0; i < cursos.size(); i++) {
                System.out.print(i + ". ");
                cursos.get(i).mostrarInfo();
            }
            System.out.print("Seleccione el número del curso a agregar: ");
            int idCurso = scanner.nextInt();
            Estudiante estudianteSeleccionado = estudiantes.get(idEstudiante);
            if (estudianteSeleccionado != null) {
                estudianteSeleccionado.agregarCurso(cursos.get(idCurso));
                System.out.println("Curso agregado con éxito\n");
            }
        }
    }
}
