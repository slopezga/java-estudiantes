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
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio);
        if (cursos.isEmpty()) {
            System.out.print("El estudiante no cuenta con cursos registrados.\n");
        } else {
            System.out.println("Cursos inscritos:");
            for (int i = 0; i < cursos.size(); i++) {
                System.out.print(i + ". ");
                cursos.get(i).mostrarInfo();
            }
        }
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

}