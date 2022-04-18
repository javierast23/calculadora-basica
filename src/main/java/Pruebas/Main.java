package Pruebas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,numInvertido;
        String cadena, cadenaInvertida = "";

        System.out.print("Ingresa un numero: ");
        num = sc.nextInt();
        cadena = String.valueOf(num);

        for (int i = 0; i < cadena.length(); i++) {
            //System.out.println(cadena.charAt(i));
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }
        numInvertido = Integer.parseInt(cadenaInvertida);
        if (num ==numInvertido) {
            System.out.println("El numero " + num + " es palindromo.");
        } else {
            System.out.println("El numero " + num + " no es palindromo.");
        }
    }
}
