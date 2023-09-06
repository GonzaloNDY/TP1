
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) {
        
        int variableEntera = 10;
        float variableFlotante = 5.5f;
        double variableDoble = 10.5;
        String variableCadena = "mundo";
        
        System.out.println(variableEntera);
        System.out.println(variableFlotante);
        System.out.println(variableDoble);
        System.out.println(variableCadena);
        
        ArrayList<Float> listaDeFloats = new ArrayList<>();
        listaDeFloats.add(123.4f);
        listaDeFloats.add(234.5f);
        listaDeFloats.add(345.6f);
        listaDeFloats.add(456.7f);
        
        float suma = 0, promedio;
        
        for(float elemento : listaDeFloats) {
            System.out.println(elemento);
        }
        
        for(float elemento : listaDeFloats) {
            suma += elemento;
        }
        
        promedio = suma /listaDeFloats.size();
        System.out.println(promedio);
        
    }
}
