package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num1, num2;
        int opt;

            System.out.println("Digita un numero entre 1-5: ");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            System.out.print("Elige una opcion: ");
            opt = sn.nextInt();
            System.out.print("Ingresa numero: ");
            num1 = sn.nextInt();
            System.out.print("Ingresa numero: ");
            num2 = sn.nextInt();

            switch (opt) {
                case 1:
                    System.out.println(Operator.add(num1, num2));
                    break;
                case 2:
                    System.out.println(Operator.substract(num1, num2));
                    break;
                case 3:
                    System.out.println(Operator.mult(num1, num2));
                    break;
                case 4:
                    System.out.println(Operator.div(num1, num2));
                    break;
                default:
                    System.out.println("Ingresa un numero entre 1-5");
                    break;
            }
    }
}
//    public static void suma(double a, double b) {
//        System.out.println(a + " + " + b + " = " + (a + b));
//    }
//    public static void resta(double a, double b) {
//        System.out.println(a + " - " + b + " = " + (a - b));
//    }
//    public static void multiplicacion(double a, double b) {
//        System.out.println(a + " * " + b + " = " + (a * b));
//    }
//    public static void division(double a, double b) {
//        if (b == 0) {
//            System.out.println("El divisor no puede ser igual a 0");
//        } else {
//            System.out.println(a + " / " + b + " = " + (a / b));
//        }
//    }
