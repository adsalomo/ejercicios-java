package com.mycompany.ejercicios.java;

import java.util.Scanner;

public class EjerciciosJava {

    public static void main(String[] args) {
        Permutacion perm = new Permutacion();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite el tamaño del vector:");
        
        int tamano = s.nextInt();
        
        int[] listaInicial = new int[tamano];
        
        for (int i = 0; i < listaInicial.length; i++) {
            System.out.println("Digite el tamaño del vector en la posición: " + i);
            int num = s.nextInt();
            listaInicial[i] = num;
        }
        
        perm.mostrarVector("Lista inicial: ", listaInicial);
        
        System.out.println("Digite número de permutaciones:");
        int numPerm = s.nextInt();
        
        perm.getListaPermutada(listaInicial, 1, numPerm);
  
    }
}
