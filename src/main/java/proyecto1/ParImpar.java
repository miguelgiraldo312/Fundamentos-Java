package proyecto1;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer los datos.
        Scanner sc = new Scanner(System.in);

        // Bandera que controla si el ciclo continúa ejecutándose.
        boolean bandera = true;

        System.out.println("Bienvenido al sistema: Par/Impar ");
        System.out.println("-");

        /*
            Ciclo que permite consultar varios números hasta que el usuario
            no desee continuar.
         */
        while (bandera) {

            System.out.println("Ingresa el número a consultar: ");
            int numero = sc.nextInt();

            // Limpia el salto de línea pendiente.
            sc.nextLine();

            // Llama al método encargado de evaluar si es par/impar - positivo/negativo.
            numeroAConsultar(numero);

            /*
                Se pregunta si desea repetir el proceso. Se usa equalsIgnoreCase
                para aceptar "si", "SI", "Si", etc.
             */
            System.out.println("Deseas probar otro número?: si/no ");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("si")) {
                bandera = true;
            } else {
                bandera = false;
            }
        }

        // Se cierra el recurso Scanner al finalizar el ciclo.
        sc.close();
    }

    /**
     * <p>Evalúa si un número entero es positivo, negativo o neutro, y determina
     * si es par o impar, imprimiendo el resultado.</p>
     *
     * @param numero Número entero ingresado por el usuario para analizar.
     */
    public static void numeroAConsultar(int numero) {
        String positivoNegativo = "";

        // Determina el signo del número.
        if (numero > 0) {
            positivoNegativo = "Positivo";
        } else if (numero < 0) {
            positivoNegativo = "Negativo";
        } else {
            positivoNegativo = "Neutro";
        }

        // Determina si el número es par o impar usando el operador módulo (%).
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par y es un número " + positivoNegativo);
        } else {
            System.out.println("El número " + numero + " es impar y es un número " + positivoNegativo);
        }
    }
}