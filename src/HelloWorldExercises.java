public class HelloWorldExercises {
    public static void main(String[] args) {

        //1. Imprime un mensaje que diga tu nombre en lugar de "Hola, Mundo!".

        System.out.println("Atxuris");

        //2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("Hola,\nMundo!");

        //3. Añade un comentario sobre lo que hace cada línea del programa.

        // Cada línea del programa representa un ejercicio para practicar los fundamentos de Java.

        //4. Crea un comentario en varias líneas.

        /*
        Este es un comentario de
        varias líneas que escribí
        como parte del ejercicio 4
         */

        //5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("44, azul, Buenos Aires");

        //6. Explora los diferentes System.XXX.println(); más allá de "out".

        /*
        Elemento            |   Tipo / Retorno     |    Explicación sencilla         |   ¿Cuándo o para qué usarlo?
        err                        Propiedad           Flujo para imprimir errores.      Mostrar mensajes de fallas
                            |      (PrintStream)        Sale de color rojo                o excepciones (catch).
                                                       en la consola.

        in                  |      Propiedad           Flujo que recibe datos            Leer lo que el usuario escribe
                                 (InputStream)        del teclado.                       en la consola (usando Scanner).

        currentTimeMillis() |      Método (long)       Da la hora actual                 Medir cuánto tiempo tarda en
                                                      en milisegundos (desde 1970).      ejecutarse un código.

       nanoTime()           |    Método (long)         Da el tiempo actual en           Mediciones de rendimiento de
                                                      nanosegundos (más preciso).       altísima precisión.
         */

        //Estos son algunos, hay muchos más, pero solo dejé algunos de los que pude investigar.

        //7. Utiliza varios println para imprimir una frase.

        System.out.println("\nEste ejercicio pide que se escriba una frase \n");
        System.out.println("en varios println.\n");
        System.out.println("Hay que hacer algo para que quede en varias líneas, \n");
        System.out.println("porque si no queda todo junto.\n");

        //8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println("   XXXXX   ");
        System.out.println(" X  O O  X ");
        System.out.println("X    V    X");
        System.out.println(" X  \\_/  X ");
        System.out.println("   XXXXX   \n");

        System.out.println("   /\\_/\\  ");
        System.out.println("  ( o.o ) ");
        System.out.println("   > ^ <  ");
        System.out.println("  /  |  \\ ");
        System.out.println(" (____)___)");

        //9. Intenta ejecutar el programa sin el método main y observa el error.

        //No se puede imprimir nada si se quita el main, simplemente no permite correr el programa.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compilalo.

        /*Pasaron cosas interesantes acá. En primer lugar, al comenzar a realizar el ejercicio, me pasó esto:

        1. Logré cambiar el nombre 2 veces y pude correr el programa sin inconvenientes.
        Luego me puse a investigar en internet, porque me pareció que capaz debía darme algún error
        al cambiar el nombre, y me pareció sospechoso.
        Desubrí que si, debería dar un error, porque  en Java, si una clase es pública (dice public class MiClase),
        el archivo obligatoriamente debe llamarse igual (MiClase.java).
        Al leer esto, me di cuenta que al cambiar el nombre del archivo, se cambió automáticamente el nombre de la
        clase sin que me diera cuenta. Entonces hice la prueba, cambiando el nombre de la clase para que fuese
        diferente al archivo, y ahí saltó el error:
        java: class HelloWorldExercises is public, should be declared in a file named HelloWorldExercises.java
         */

    }
}
