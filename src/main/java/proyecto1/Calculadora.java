package proyecto1;

import java.util.Scanner;

public class Calculadora {

    //Se crea el objeto del scanner para poder leer lo que digite el usuario.
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        /*
            Se define la variable operación como texto y se da un mensaje de bienvenida.
         */
        String operacion;
        System.out.println("Bienvenido a la calculadora!, Que operación deseas hacer?");
        System.out.println("-");

        do {

            /*
                Se le pide al usuario que seleccione la operación que desea hacer.
                Al leer su respuesta, si es "salir", saldrá del sistema.
                El .equalsIgnoreCase es para que no importe si viene en mayuscula,
                minuscula, una si y una no, etc...
             */

            System.out.println("sumar, restar, multiplicar, dividir, modular, salir.");
            operacion = teclado.nextLine();
            System.out.println("-");

            if (operacion.equalsIgnoreCase("salir")) {
                System.out.println("Salida exitosa");
                break;
            }

            /*
                Se le pide al usuario que digite el primer número (a) y el segúndo (b)
                para hacer la respectiva operación seleccionada anteriormente.
                Se leen con el .nextInt y se imprime un guión para separar los renglones mejor.
             */

            System.out.println("Ingresa el primer valor: ");
            int a = teclado.nextInt();
            System.out.println("-");

            System.out.println("Ingresa el segundo valor: ");
            int b = teclado.nextInt();
            System.out.println("-");

            teclado.nextLine();


            /*
                Lo que hice en este switch fue que según la respuesta que el usuario digitó
                va a tomar uno de los 6 caminos disponibles según los métodos, para hacer
                cada operación. Va a imprimir el mensaje con el contexto y llama al método
                correspondiente.
             */
            switch (operacion) {
                case "sumar":
                    System.out.println("El resultado de la suma es : " +  sumar(a, b));
                    break;
                case "restar":
                    System.out.println("El resultado de la resta es : " +  restar(a, b));
                    break;
                case  "multiplicar":
                    System.out.println("El resultado de la multiplicación es : " +  multiplicar(a, b));
                    break;
                case "dividir":
                    if (b != 0)
                        System.out.println("El resultado de la división es : " +  dividir(a, b));
                    else
                        System.out.println("Error, no se puede dividir por 0");
                    break;
                case "modular":
                    if (b != 0)
                        System.out.println("El resultado del módulo es : " + modular(a, b));
                    else
                        System.out.println("Error, no se puede modular por 0");
                    break;
                default:
                    System.out.println("Debe escoger una opción válida.");
            }
        }while (!operacion.equalsIgnoreCase("salir"));

        teclado.close();
    }


    /**
     * <p>Este método se hizo para permitir la suma de dos números ingresados por el usuario</p>
     * @param a
     * @param b
     * @return La suma de a+b
     */
    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }
    /**
     *<p>Este método se hizo para permitir la resta de dos números ingresados por el usuario</p>
     * @param a
     * @param b
     * @return La resta de a-b
     */
    public static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }
    /**
     *<p>Este método se hizo para permitir la multiplicación de dos números ingresados por el usuario</p>
     * @param a
     * @param b
     * @return La multiplicación de a*b
     */
    public static int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }
    /**
     *<p>Este método se hizo para permitir la división de dos números
     *  decimales ingresados por el usuario</p>
     * @param a
     * @param b
     * @return La división de a/b
     */
    public static double dividir(double a, double b) {
        double dividir = a/b;
        return dividir;
    }
    /**
     *<p>Este método se hizo para permitir modular dos números ingresados por el usuario</p>
     * @param a
     * @param b
     * @return La modularización de a%b
     */
    public static int modular(int a, int b) {
        int modulo = a%b;
        return modulo;
    }


}
