package c01_beginner;

public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables

        String name = "Atxuris";
        System.out.println(name);

        name = "Lobo";
        System.out.println(name);

        int age = 44;
        System.out.println(age);

        var email = "atxuris@gmail.com";
        System.out.println(email);

        var year = 2026;
        System.out.println(year);


        // name = 37; Error (No se puede cambiar el tipo de dato)

        // Constantes

        final String EMAIL = "atxuris@gmail.com";
        // EMAIL = "lobo@gmail.com"; No se puede cambiar, es constante.
        System.out.println(EMAIL);







    }
}
