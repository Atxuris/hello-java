package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int a = 8;
        int b = 5;
        int suma = a + b;
        System.out.println(suma);
        int resta = a - b;
        System.out.println(resta);
        int multiplicacion = a * b;
        System.out.println(multiplicacion);
        int division = a / b;
        System.out.println(division);
        int modulo = a % b;
        System.out.println(modulo);


        // 2. Crea una variable para cada tipo de operación de asignación.

        a = b;
        System.out.println(a);

        a = b + 5;
        System.out.println(a);

        a += 1;
        System.out.println(a);
        a -= 3;
        System.out.println(a);
        a *= 4;
        System.out.println(a);
        a /= 1;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a == 0);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a > 0);

        // 5. Utiliza el operador lógico and.

        System.out.println(a == 0 && a != b);

        // 6. Utiliza el operador lógico or.

        System.out.println(a >= b || a > b);

        // 7. Combina ambos operadores lógicos.

        System.out.println((a == 0 && a != b) && (a >= b || a > b));
        System.out.println((a == 0 && a != b) || (a >= b || a > b));

        // 8. Añade alguna negación.

        System.out.println(a != 17);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(+b);
        System.out.println(-a);
        System.out.println(++a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        boolean esMayorQue = (a < b) && ((b - a) <= b);

        System.out.println("El resultado de la operación es: " + esMayorQue);




    }
}
