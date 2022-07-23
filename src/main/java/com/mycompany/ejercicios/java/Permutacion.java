package com.mycompany.ejercicios.java;

public class Permutacion {
    
    public void getListaPermutada(int[] listInicial, int numPerm, int tamPerm) {

        int[] listaPermutada = new int[listInicial.length];

        for (int i = 0; i < listInicial.length; i++) {

            int posAnterior = i - 1;
            int posPosterior = i + 1;

            if (i == 0) {
                if (listInicial[posPosterior] == 0) {
                    listaPermutada[i] = 0;
                } else {
                    listaPermutada[i] = 1;
                }
                continue;
            }

            if (i == (listInicial.length - 1)) {
                if (listInicial[posAnterior] == 0) {
                    listaPermutada[i] = 0;
                } else {
                    listaPermutada[i] = 1;
                }
                continue;
            }

            if (listInicial[posAnterior] == listInicial[posPosterior]) {
                listaPermutada[i] = 0;
            } else {
                listaPermutada[i] = 1;
            }

        }
        
        mostrarVector("Lista permutada [" + numPerm + "]", listaPermutada);

        if (tamPerm > numPerm) {
            getListaPermutada(listaPermutada, numPerm + 1, tamPerm);
        }

    }
    
    public void mostrarVector(String mensaje, int[] listaInicial) {
        StringBuilder builder = new StringBuilder();
        
        builder.append(mensaje);
        
        for (int i = 0; i < listaInicial.length; i++) {
            if (i == 0) {
                builder.append("[ ").append(listaInicial[i]);
            } else if (i == listaInicial.length - 1) {
                builder.append(", ").append(listaInicial[i]).append(" ]");
            } else {
                builder.append(", ").append(listaInicial[i]);
            }
        }
        
        System.out.println(builder.toString());
    }

}
