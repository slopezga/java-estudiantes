package com.santi.estudiantes;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private ArrayList<Curso> cursos;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.cursos = new ArrayList<Curso>();
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPromedio() { return promedio; }
    public ArrayList<Curso> getCursos() { return cursos; }
    
    public void mostrarInfo() {
        System.out.println("--------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        if (cursos.isEmpty()) {
            System.out.println("El estudiante no cuenta con cursos registrados.\n");
        } else {
            for (Curso cur : cursos) {
                cur.mostrarInfo();
            }
        }
        System.out.println("--------------");
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

}