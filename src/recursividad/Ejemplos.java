/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Ejemplos {
    
    public static void Recursivo(ArrayList ar, int nPos){
        if(nPos < ar.size()){
          System.out.print(ar.get(nPos)+",");
          Recursivo(ar, nPos+1);
        }
    }
    
    public static void Recursivo2(ArrayList ar, int nPos){
        if(nPos < ar.size()){
          Recursivo2(ar, nPos+1);
          System.out.print(ar.get(nPos)+",");
        }
    }
    
    public static void piram(int i, int j){
        if(i>0){
            System.out.print("*");
            piram(--i,j);
        }else if(j>0){
            i=j;
            System.out.println("");
            piram(--i,--j);
        }
        
    }
    
    public static void main(String[] args){
        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        
        //Recorrido Iterativo
        System.out.println("Recorrido Iterativo: ");
        for(int i = 0; i < ar.size();i++){
            System.out.print(""+ar.get(i)+",");
        }
        System.out.println();
        
        //Recorrido Recursvo
        System.out.println("Recorrido Recursivo");
        Recursivo(ar, 0);
        System.out.println();
        
        //Recorrido Recursvo2
        System.out.println("Recorrido Recursivo");
        Recursivo2(ar, 0);
        System.out.println();
        
        //Piramide Iterativo
        System.out.println("Piramide Iterativo\n");
        for(int i = 5; i>0;i--){
            for(int j = i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //Piramide recursivo
        System.out.println("Piramide recursivo");
        piram(5,5);
        System.out.println();
    }
}
