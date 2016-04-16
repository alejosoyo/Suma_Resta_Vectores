package sumavec2;

import java.util.Scanner;

public class SumaVec2 {

    public static void main(String[] args) {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("DATOS");
            System.out.println("Ingresa 1 para sumar");
            System.out.println("Ingresa 2 para restar");
            System.out.println("Ingrese 3 para salir");
            n = teclado.nextInt();

            switch (n) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ingreso un valor incorrecto");
            }
        } while (n != 3);
    }

    public static void suma() {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        String cadena2;
        String auxcadena = "";
        String cadena3 = "";
        String cadena4 = "";
        String cadenasuma;
        int largoc = 0;
        int tamano1 = 0;
        int tamano2 = 0;
        int n = 0;
        long numero;
        int[] vector1;
        int[] vector2;
        String[] vecsuma;
        System.out.println("Ingrese el primer valor del vector");
        cadena1 = teclado.nextLine();
        System.out.println("Ingrese el valor del segundo vector");
        cadena2 = teclado.nextLine();
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");
        tamano1 = (cadena1.length()) / 4;
        tamano2 = (cadena2.length()) / 4;
        if (((cadena1.length()) % 4) != 0) {
            tamano1 = (1 - (tamano1 % 1)) + tamano1;
        }
        if (((cadena2.length()) % 4) != 0) {
            tamano2 = (1 - (tamano2 % 1)) + tamano2;
        }

        vector1 = new int[tamano1];
        vector2 = new int[tamano2];

        for (int i = 0; i < tamano1; i++) {
            largoc = cadena1.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadena1.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadena1.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            numero = Long.parseLong(auxcadena);
            vector1[(tamano1 - 1) - i] = (int) (long) numero;

        }

        for (int i = 0; i < tamano2; i++) {
            largoc = cadena2.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadena2.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadena2.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            numero = Long.parseLong(auxcadena);
            vector2[(tamano2 - 1) - i] = (int) (long) numero;

        }
        for (int i = 0; i < tamano1; i++) {
            cadena3 = cadena3 + vector1[i];
        }
        for (int i = 0; i < tamano2; i++) {
            cadena4 = cadena4 + vector2[i];
        }
        numero = (Long.parseLong(cadena3)) + (Long.parseLong(cadena4));
        cadenasuma = Long.toString(numero);
        n = (cadenasuma.length()) / 4;
        if (((cadenasuma.length()) % 4) != 0) {
            n = (1 - (n % 1)) + n;
        }
        vecsuma = new String[n];
        largoc = cadenasuma.length();
        for (int i = 0; i < n; i++) {
            largoc = cadenasuma.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadenasuma.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadenasuma.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            vecsuma[(n - 1) - i] = auxcadena;

        }
        System.out.println("VECTOR 'A'");
        for (int i = 0; i < tamano1; i++) {
            System.out.println("El vector A en la posición " + i + " es: " + vector1[i]);
        }
        System.out.println("VECTOR 'B'");
        for (int i = 0; i < tamano2; i++) {
            System.out.println("El vector B en la posición " + i + " es: " + vector2[i]);
        }
        System.out.println("SUMA VECTORES");
        for (int i = 0; i < n; i++) {
            System.out.println("La suma del vector en la posición " + i + " es: " + vecsuma[i]);
        }
    }

    public static void resta() {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        String cadena2;
        String auxcadena = "";
        String cadena3 = "";
        String cadena4 = "";
        String cadenasuma;
        int largoc = 0;
        int tamano1 = 0;
        int tamano2 = 0;
        int n = 0;
        long numero;
        int[] vector1;
        int[] vector2;
        String[] vecsuma;
        System.out.println("Ingrese el primer valor del vector");
        cadena1 = teclado.nextLine();
        System.out.println("Ingrese el valor del segundo vector");
        cadena2 = teclado.nextLine();
        cadena1 = cadena1.replace(" ", "");
        cadena2 = cadena2.replace(" ", "");
        tamano1 = (cadena1.length()) / 4;
        tamano2 = (cadena2.length()) / 4;
        if (((cadena1.length()) % 4) != 0) {
            tamano1 = (1 - (tamano1 % 1)) + tamano1;
        }
        if (((cadena2.length()) % 4) != 0) {
            tamano2 = (1 - (tamano2 % 1)) + tamano2;
        }

        vector1 = new int[tamano1];
        vector2 = new int[tamano2];

        for (int i = 0; i < tamano1; i++) {
            largoc = cadena1.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadena1.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadena1.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            numero = Long.parseLong(auxcadena);
            vector1[(tamano1 - 1) - i] = (int) (long) numero;

        }

        for (int i = 0; i < tamano2; i++) {
            largoc = cadena2.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadena2.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadena2.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            numero = Long.parseLong(auxcadena);
            vector2[(tamano2 - 1) - i] = (int) (long) numero;

        }
        for (int i = 0; i < tamano1; i++) {
            cadena3 = cadena3 + vector1[i];
        }
        for (int i = 0; i < tamano2; i++) {
            cadena4 = cadena4 + vector2[i];
        }
        numero = (Long.parseLong(cadena3)) - (Long.parseLong(cadena4));
        cadenasuma = Long.toString(numero);
        n = (cadenasuma.length()) / 4;
        if (((cadenasuma.length()) % 4) != 0) {
            n = (1 - (n % 1)) + n;
        }
        vecsuma = new String[n];
        largoc = cadenasuma.length();
        for (int i = 0; i < n; i++) {
            largoc = cadenasuma.length();
            if ((largoc - (4 + (i * 4))) < 0) {
                auxcadena = cadenasuma.substring(0, largoc - (i * 4));
            } else {
                auxcadena = cadenasuma.substring(largoc - (4 + (i * 4)), largoc - (i * 4));
            }
            vecsuma[(n - 1) - i] = auxcadena;

        }
        System.out.println("VECTOR 'A'");
        for (int i = 0; i < tamano1; i++) {
            System.out.println("El vector A en la posición " + i + " es: " + vector1[i]);
        }
        System.out.println("VECTOR 'B'");
        for (int i = 0; i < tamano2; i++) {
            System.out.println("El vector B en la posición " + i + " es: " + vector2[i]);
        }
        System.out.println("SUMA VECTORES");
        for (int i = 0; i < n; i++) {
            System.out.println("La resta del vector en la posición " + i + " es: " + vecsuma[i]);
        }
    }

}
