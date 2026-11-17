package proyecto1;

import java.util.Scanner;

public class ValidarUsuarioClave {

    // Constantes que almacenan las credenciales válidas.
    private static final String CLAVE_CORRECTA = "bmws1000rr";
    private static final String USUARIO_CORRECTO = "mangelg2019";

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer.
        Scanner sc = new Scanner(System.in);

        // Límite máximo de intentos y bandera de acceso.
        int intentos = 3;
        boolean bandera = false;

        System.out.println("Bienvenido al sistema de validación de usuario y contraseña");
        System.out.println("-");

        /*
            Ciclo que solicita usuario y clave hasta cumplir el límite de intentos
            o hasta que las credenciales ingresadas sean correctas.
         */
        for (int i = 0; i < intentos; i++) {

            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("-");

            System.out.println("Ingrese su clave: ");
            String clave = sc.nextLine();
            System.out.println("-");

            // Valida el intento actual y muestra el mensaje correspondiente de cada método.
            //se le asigna el resultado del método uno a bandera y se llama a el segundo método.
            bandera = validarUsuarioClave(usuario, clave);
            int ingresosRestantes = intentos - (i +1);
            ingresoValido(bandera, ingresosRestantes);

            // Si el acceso fue exitoso, se interrumpe el ciclo de intentos.
            if (bandera) {
                break;
            }
        }

        // Si se agotaron todos los intentos sin éxito, se informa al usuario.
        if (!bandera) {
            System.out.println("Intentos insuficientes...");
        }

        // Se cierra el Scanner al finalizar el programa.
        sc.close();
    }

    /**
     * <p>Compara el usuario y la contraseña ingresados contra las constantes
     * definidas en la clase.</p>
     *
     * @param usuario Nombre de usuario digitado por el usuario.
     * @param clave Contraseña digitada por el usuario.
     * @return {@code true} si ambas credenciales coinciden; {@code false} en caso contrario.
     */
    public static boolean validarUsuarioClave(String usuario, String clave) {
        boolean bandera = true;
        if (usuario.equals(USUARIO_CORRECTO) && clave.equals(CLAVE_CORRECTA)) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    /**
     * <p>Imprime el resultado de cada intento.</p>
     *
     * @param bandera Resultado booleano de la validación de credenciales.
     */
    public static void ingresoValido(boolean bandera, int intentosRestantes) {
        if (bandera) {
            System.out.println("Has ingresado con éxito");
        } else {
            System.out.println("Usuario o Clave incorrecta. Te quedan " +  intentosRestantes + " intentos.");
        }
    }
}