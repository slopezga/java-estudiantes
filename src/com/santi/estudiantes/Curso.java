package com.santi.estudiantes;

public class Curso {
    private String nombre;
    private String codigo;
    private int creditos;

    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public int getCreditos() { return creditos; }

    public void mostrarInfo() {
        System.out.println("--------------");
        System.out.println("Nombre curso: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Créditos: " + creditos);
        System.out.println("--------------");
    }
}
