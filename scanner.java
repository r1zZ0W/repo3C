import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class scanner {

    public static void main(String[] args) {

        // 1. Creamos un objeto Scanner. 'System.in' indica que leerá del teclado.
        // Usamos try-with-resources para manejar automáticamente el cierre del Scanner
        try (Scanner lectorEntrada = new Scanner(System.in)) {

            // --- Pedir y guardar el nombre ---

            // 2. Mostramos un mensaje para pedir el nombre al usuario.
            System.out.print("Por favor, introduce tu nombre completo: ");

            // 3. Leemos la línea completa que el usuario escriba hasta que pulse Enter.
            //    Guardamos el texto leído en una variable de tipo String llamada 'nombre'.
            String nombre = lectorEntrada.nextLine();

            // --- Pedir y guardar el año de nacimiento ---

            // 4. Mostramos un mensaje para pedir el año de nacimiento.
            System.out.print("Ahora, introduce tu año de nacimiento (ej: 1990): ");

            // 5. Leemos el número entero que el usuario escriba.
            //    Guardamos el número leído en una variable de tipo int llamada 'añoNacimiento'.
            int añoNacimiento = lectorEntrada.nextInt();

            /*
               NOTA IMPORTANTE:
               Después de leer un número con nextInt(), nextDouble(), etc.,
               el carácter de "nueva línea" (\n) que se crea al pulsar Enter
               se queda en el buffer de entrada.
               Si después intentas leer una línea completa con nextLine(),
               esta leerá inmediatamente ese \n que quedó pendiente,
               sin esperar a que el usuario escriba otra cosa.
               Para evitar esto, es buena práctica "consumir" ese \n restante
               después de leer un número si planeas leer una línea de texto después.
            */
            lectorEntrada.nextLine(); // Consumimos el resto de la línea (el \n)

            // --- Usar las variables guardadas ---

            System.out.println("\n--- Información Guardada ---"); // Imprimimos una línea en blanco y un encabezado
            System.out.println("Tu nombre es: " + nombre); // Mostramos el nombre guardado
            System.out.println("Tu año de nacimiento es: " + añoNacimiento); // Mostramos el año guardado

            // Opcional: Calcular la edad aproximada (año actual - año de nacimiento)
            // Necesitaríamos obtener el año actual. Una forma simple para este ejemplo:
            int añoActual = 2025; // Podrías usar una clase como java.time.Year.now().getValue() para ser más preciso

            int edadAproximada = añoActual - añoNacimiento;
            System.out.println("Tienes aproximadamente: " + edadAproximada + " años.");

        }

    }
}