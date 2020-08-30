/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase04.laboratorio1;

/**
 *
 * @author Keiry
 */
public class Persona {
    
/// Abstracción de atributos para la clase "Persona"
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    /// Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /// Métodos Get and Set
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public double getpeso() {
        return peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    // Método esMayordeEdad con la condicional IF
    public String esMayordeEdad() {
        int Edad;
        Edad = this.edad;
        if (Edad >= 18) {
            return "Eres mayor de edad";

        } else {
            return "Eres menor de edad";

        }

    }

    // Método toString
    /**
     *
     * @return
     */
    public String toAll() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
