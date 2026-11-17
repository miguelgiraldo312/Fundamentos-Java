package proyecto1;

import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer los datos ingresados.
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al programa para registrar tus notas");
        System.out.println("-");

        System.out.println("Ingrese el número de notas que deseas registrar: ");
        int numeroNotas = sc.nextInt();

        // Limpia el salto de línea pendiente.
        sc.nextLine();

        // contador para sumar las notas válidas ingresadas.
        double total = 0;

        /*
            Valida que la cantidad de notas sea mayor a 0 antes de solicitar
            los valores y calcular el promedio.
         */
        if (numeroNotas == 0 || numeroNotas < 0) {
            System.out.println("El número de notas debe ser un valor mayor a 0.");
        } else {
            /*
                Ciclo que solicita cada nota del 1 hasta numeroNotas. Si una nota
                no está entre 0 y 5, se muestra un aviso y se retrocede el índice
                (i--) para volver a pedir esa misma nota.
             */
            for (int i = 1; i <= numeroNotas; i++) {

                System.out.println("Ingrese el valor de la nota " + i + " Separado por coma(,): ");
                double nota = sc.nextDouble();

                if (nota >= 0 && nota <= 5) {
                    total += nota;
                } else {
                    System.out.println("El valor de la nota debe ser mayor a 0 y menor a 5");
                    System.out.println("-");
                    i--;
                }
            }

            // Llama al método promedio y muestra el resultado final.
            System.out.println("El promedio de tus notas es : " + promedio(total, numeroNotas));
        }

        //Cierra el recurso Scanner.
        sc.close();
    }

    /**
     * <p>Calcula el promedio a partir de la suma total de las notas
     * y la cantidad de notas registradas.</p>
     *
     * @param total Suma acumulada de todas las notas válidas.
     * @param numeroNotas Cantidad total de notas que registró el usuario.
     * @return El promedio obtenido en decimal.
     */
    public static double promedio(double total, int numeroNotas) {
        return total / numeroNotas;
    }
}