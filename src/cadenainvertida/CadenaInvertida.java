/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenainvertida;

import java.util.Scanner;

/**
 * 
 * @author Bryan Ivan Lucero Once
 */
public class CadenaInvertida {

    /**
     * @param args este codigo analizara una cadena normal y devolvera la misma cadena pero invertida
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = 0;
        int caso1;
        String resultado = "";
        String cadena = "";
        
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            cadena = sc.nextLine();
            System.out.println("este es el 1 commit");
            resultado = invertirCadena(cadena);
            System.out.println(resultado);
        }
    }
/**
 * 
 * @param original es la cadena normal a la que queremos invertir
 * @return devuelve una cadena invertida
 */
    public static String invertirCadena(String original) {
        String cadenaAInvertir = "";
        char letra2;
        char letra;

        for (int i = original.length() - 1; i >= 0; i--) {
            letra = original.charAt(i);
            cadenaAInvertir += letra;
        }

        return cadenaAInvertir;
    }
}