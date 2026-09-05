package c03_strings;

public class Strings {
    public static void main(String[] args) {

         // Cadenas de texto
        String name = "Atxuris";
        var surname = new String("Lobo");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 4));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene (Contains)
        System.out.println("Hola, Java".contains("Atxuris"));
        System.out.println("Hola, Java".contains("ava"));
        System.out.println("Hola, Java".contains("AVA"));
        System.out.println("Hola, Java".toUpperCase().contains("JAVA"));

        // Comparación
        System.out.println(name.equals("Atxuris"));
        System.out.println(name.equals("atxuris"));
        System.out.println(name.equalsIgnoreCase("Atxuris"));

        // == vs .equals
        var a = "Atxuris";
        var b = "Atxuris";
        var c = new  String("Atxuris");


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim
        System.out.println(" Hola, me llamo Atxuris ".trim());

        // Replace
        System.out.println("Hola, me llamo Atxuris".replace("Atxuris", "Lobo"));

        // Format
        var age = 44;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}
