package c03_strings;

public class StringsExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.

        String saludo = "Hola, Atxuris.";
        String mensaje = "\n¡Bienvenida al mundo de la programación con Java!";
        System.out.println(saludo + mensaje);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(saludo.length());

        // 3. Muestra el primer y último caracter de un string.
        System.out.println(saludo.charAt(0));
        System.out.println(saludo.charAt(saludo.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(saludo.contains("Hola"));

        // 6. Formatea un string con un entero.
        String name = "Atxuris";
        int time = 9;
        System.out.println(String.format("Hola, %s. Son las %d de la mañana.", name, time));

        // 7. Elimina los espacios en blanco al principio y al final de un string.
        String inicio = " Hola, Mundo! ";
        System.out.println(inicio.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(mensaje.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        var a = "Hola";
        var b = "nombre";
        var c = "Hola";
        System.out.println(a == b);
        System.out.println(a.equals(c));


        // 10. Comprueba si dos strings tienen la misma longitud.
        var longitudSaludo = Integer.toString(saludo.length());
        var longitudMensaje = Integer.toString(mensaje.length());
        var longitudInicio = Integer.toString(inicio.length());
        System.out.println(saludo.length());
        System.out.println(mensaje.length());
        System.out.println(inicio.length());
        System.out.println(longitudSaludo.equals(longitudMensaje));
        System.out.println(longitudSaludo.equals(longitudInicio));

    }
}
