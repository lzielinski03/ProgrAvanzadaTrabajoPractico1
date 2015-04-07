package ejercicio3;

/**
 * 3)	Desarrollar una función que indique si un número es primo.
 */
public class NumerosPrimos {

    public static boolean esPrimo(int numero) {

        if(numero == 1) { return false; }
        if(numero == 2) { return true; }

        if(numero % 2 == 0){
            return false;
        }
        if(numero % ((int) Math.sqrt(numero)) == 0 || numero % ((int) Math.sqrt(numero)+1) == 0) {
            if(!(((int) Math.sqrt(numero)) == 1)){
                return false;
            }
        }
        return true;
    }

    public static void run() {

        System.out.println("El número " + 0 + " es primo? " + esPrimo(0));
        // El número 0 es primo? false

        System.out.println("El número " + 1 + " es primo? " + esPrimo(1));
        // El número 1 es primo? false

        System.out.println("El número " + 2 + " es primo? " + esPrimo(2));
        // El número 2 es primo? true

        System.out.println("El número " + 3 + " es primo? " + esPrimo(3));
        // El número 3 es primo? true

        System.out.println("El número " + 4 + " es primo? " + esPrimo(4));
        // El número 4 es primo? false

        System.out.println("El número " + 5 + " es primo? " + esPrimo(5));
        // El número 5 es primo? true

        System.out.println("El número " + 17 + " es primo? " + esPrimo(17));
        // El número 17 es primo? True

        System.out.println("El número " + 18 + " es primo? " + esPrimo(18));
        // El número 18 es primo? false
    }
}