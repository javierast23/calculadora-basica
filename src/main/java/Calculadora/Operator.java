package Calculadora;

public class Operator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int substract(int num1, int num2) {
        return num1 - num2;
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    public static String div(int num1, int num2) {
        if( num2 == 0) {
            return "Operacion invalida";
        }
        return String.valueOf((float) num1 / (float) num2);
    }
}
// Static --> No necesita instanciar la clase Operator para poder usarla.
// los metodos estaticos se resuelven en tiempo de compilacion. No se puede sobrescribir el metodo estatico.
// los metodos no estaticos se resuelven en tiempo de ejecucion.