/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero_Letra;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Numero_Letra {
    
    public static void main(String[] arg){
        System.out.println(conversion());
    }


    public static String conversion() {
        int n = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número a convertir");
        n = entrada.nextInt();
        switch(n){
            case 1:
                return "Uno";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "Seis";
            case 7:
                return "Siete";
            case 8:
                return "ocho";
            case 9:
                return "Nueve";
            case 10:
                return "Diez";
            case 11:
                return "Once";
            default:
                return "No se encontro nada";
        }
    }
}
