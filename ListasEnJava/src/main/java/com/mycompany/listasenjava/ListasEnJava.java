package com.mycompany.listasenjava;

import java.util.ArrayList;

public class ListasEnJava {

    public static void main(String[] args) {
        String[] names = new String[5]; // Array
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Hola");
        list.add("mundo");
        list.add("cruel");
        
        list.set(1, "gente");
        list.remove(2);
        
        System.out.println("Indice 0: " + list.get(0));
        
        System.out.println("Tamaño de la lista: "+list.size());
        System.out.println("¿Está vacia? " + list.isEmpty());
        
        // Hay dos adds, eso se llama sobrecarga
        System.out.println("Tamaño de la lista: "+list);
        
        // For each
        for (String i : list) {
            System.out.print(i+" ");
        }
        System.out.println("");
        // For tradicional
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("Saluda?"+list.contains("Hola"));
    }
}
