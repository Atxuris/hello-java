public class BeginnerExercises {
    public static void main(String[] args) {

        //1. Declara una variable de tipo String y asignale tu nombre.

        String name = "Atxuris";
        System.out.println(name);

        //2. Crea una variable de tipo int y asignale tu edad.

        int age = 44;
        System.out.println(age);

        //3. Crea una variable double con tu altura en metros.

        double height = 1.55;
        System.out.println("Mi estatura es: " + height + " metros.");

        //4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean teGustaProgramar = true;
        if (teGustaProgramar = true){
            System.out.println("A " + name + " le gusta programar.");
        }else {
            System.out.println("A " + name + " no le gusta programar." );
        }

        //5. Declara una constante con tu email.

        final String EMAIL = "atxuris@gmail.com";
        System.out.println(EMAIL);

        //6. Crea una variable de tipo char y asignale tu inicial.

        char myInitial = 'A';
        System.out.println("La inicial de mi nombre es: " + myInitial);

        //7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String myTown = "Buenos Aires";
        System.out.println("Mi ciudad es " + myTown);
        myTown = "Luján";
        System.out.println("Mi ciudad es " + myTown);


        //8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 10;
        int b = 15;
        int resultado = a + b;

        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);

        //9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(name.getClass().getSimpleName());

        //10. Intenta declarar una variable sin inicializarla y luego asignale un valor antes de imprimirla.

        String myVariable = "variable";
        System.out.println(myVariable);



    }
}
