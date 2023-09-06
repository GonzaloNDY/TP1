/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class primeraClase {
    // Atributos:
    String unaCadena;
    int unEntero;

    // Métodos:
    public static void main(String[] args) {
        primeraClase unObjeto1 = new primeraClase();
        primeraClase unObjeto2 = new primeraClase();
        primeraClase unObjeto3 = new primeraClase();
        primeraClase unObjeto4 = new primeraClase();
        primeraClase unObjeto5 = new primeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 2;
        unObjeto2.unaCadena = "Pizarron";
        unObjeto2.unEntero = 1;
        unObjeto3.unaCadena = "Escritorio";
        unObjeto3.unEntero = 20;
        unObjeto4.unaCadena = "Computadora";
        unObjeto4.unEntero = 30;
        unObjeto5.unaCadena = "Silla";
        unObjeto5.unEntero = 40;
        
        ArrayList<primeraClase> listaDeObjetos = new ArrayList<>();
        listaDeObjetos.add(unObjeto1);
        listaDeObjetos.add(unObjeto2);
        listaDeObjetos.add(unObjeto3);
        listaDeObjetos.add(unObjeto4);
        listaDeObjetos.add(unObjeto5);
        
        for (primeraClase elemento : listaDeObjetos) {
            elemento.mostrar();
        }
    }

    public void mostrar() {
        System.out.println("Objeto: " + unaCadena);
        System.out.println("Unidades: " + unEntero);
        System.out.println("");
    }
}
