package ejercicio2;

/**
 * 2)	Desarrollar una función que dado un número n muestre todos los números pares que hay entre 0 y n separados por coma.
 */
public class NumerosPares {

    public static String numerosParesEnRangoN(int numero) {
        String pares = "";
        String separator =  ", ";
        for(int i = 0; i <= numero; i++) {
            if(i == numero || i+1 == numero){
                separator = "";
            }
            if(i % 2 == 0) {
                pares += i + separator;
            }
        }
        return pares;
    }

    public static void run(){
        int n1 = 7;
        System.out.println("Números pares entre 0 y " + n1 + ": " + numerosParesEnRangoN(n1));
        // Números pares entre 0 y 7: 0, 2, 4, 6

        int n2 = 3;
        System.out.println("Números pares entre 0 y " + n2 + ": " + numerosParesEnRangoN(n2));
        // Números pares entre 0 y 3: 0, 2

        int n3 = 10;
        System.out.println("Números pares entre 0 y " + n3 + ": " + numerosParesEnRangoN(n3));
        // Números pares entre 0 y 3: 0, 2, 4, 6, 8, 10

    }

}
