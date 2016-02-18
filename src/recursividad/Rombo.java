/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Rombo {

    public static void logica(int tamanio) {

        char espacio = ' ';
        char asterisco = '*';
        
        for (int i = 1; i <= tamanio; i++) {
            for (int espacios = tamanio - i; espacios > 0; espacios--) {
                System.out.print(espacio);
            }
            for (int lineas = 1; lineas < 2 * i; lineas++) {
                System.out.print(asterisco);
            }
            System.out.println("");
        }
        
        for (int i = tamanio-1; i >= 1; i--) {
            for (int espacios = tamanio - i; espacios > 0; espacios--) {
                System.out.print(espacio);
            }
            for (int lineas = 1; lineas < 2 * i; lineas++) {
                System.out.print(asterisco);
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        
        int valor;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del rombo: ");
        valor = dato.nextInt();
        logica(valor);
        
    }
}
