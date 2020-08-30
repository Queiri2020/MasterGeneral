/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase04.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Keiry
 */
public class NewMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es su nombre? ");
        String nombre = sc.nextLine();

        System.out.println(nombre);

        System.out.println("Favor, ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("¿Cuál es su sexo? (F/M)");
        String sexo = sc.next();

        System.out.println("¿Cuál es su peso? ");
        double peso = sc.nextDouble();

        System.out.println("¿Cuál es su altura? ");
        double altura = sc.nextDouble();

        Persona user1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona user2 = new Persona(user1.getnombre(), user1.getedad(), user1.getsexo());
        
        Persona user3 = new Persona();
        user3.setnombre(nombre);
        user3.setedad(edad);
        user3.setsexo(sexo);
        user3.setpeso(peso);
        user3.setaltura(altura);
        
        System.out.println(user1.toAll()) ;
        System.out.println(user1.esMayordeEdad()) ;
        System.out.println(user2.toString()) ;
        System.out.println(user2.esMayordeEdad()) ;
        System.out.println(user3.toAll()) ;
        System.out.println(user3.esMayordeEdad()) ;

    }

}
