package c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        int age = 19;

        if (age >= 18){
            System.out.println("El usuario es mayor de edad, así que puede votar.");
        }else {
            System.out.println("El usuario es menor de edad, así que no puede votar.");
        }

        // 2. Declara dos números y muestra cuál es mayor, o sin son iguales.
        var num1 = 12;
        var num2 = 12;

        if (num1 > num2){
            System.out.println("El primer número es mayor que el segundo.");
        }else if ( num1 == num2 ){
            System.out.println("Los dos números son iguales.");
        }else {
            System.out.println("El segundo número es mayor que el primero.");
        }

        // 3. Dado un número verifica si es positivo, negativo o cero.
        var x = 6;

        if (x > 0){
            System.out.println("El número es positivo.");
        } else if (x < 0) {
            System.out.println("El número es negativo.");
        }else {
            System.out.println("El número es cero.");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        if (x % 2 == 0){
            System.out.println("El número es par.");
        }else if (x % 2 != 0){
            System.out.println("El número es impar.");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        int num = 42;

        if (num >= 1 && num <= 100){
            System.out.println("El número está en el rango de 1 a 100.");
        }else {
            System.out.println("El número está fuera del rango esperado.");
        }

        // 6. Declara una variable con el día de la semana (1 - 7) y muestra su nombre con un switch.

        var day = 5;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Domingo");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota de 0 a 100.

        int nota = 98;

        if (nota >= 98){
            System.out.println("Sobresaliente");
        } else if (nota >= 51 && nota <= 97) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int userAge = 16;
        boolean vaAcompaniado = true;

        if (userAge >= 18){
            System.out.println("El usuario es mayor de edad y puede entrar al cine solo.");
        }else if (userAge >= 15 && userAge <= 17 || vaAcompaniado){
            System.out.println("Para poder entrar al cine debes tener al menos 15 años o venir acompañado de un adulto.");
        }else {
            System.out.println("El usuario no puede entrar a ver esta película.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante (char).

        char letter = 'S';
        char lowerLetter = Character.toLowerCase(letter);

        if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' || lowerLetter == 'u'){
            System.out.println("La letra es una vocal.");
        }else {
            System.out.println("La letra es una consonante.");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int a = 42;
        int b = 21;
        int c = 7;

        if (a > b && a > c){
            System.out.println("El primer número es mayor.");
        } else if (b > a && b > c){
            System.out.println("El segundo número es mayor.");
        }else {
            System.out.println("El tercer número es mayor.");
        }
    }
}
