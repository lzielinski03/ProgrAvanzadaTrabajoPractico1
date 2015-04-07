package ejercicio4;

import ejercicio3.NumerosPrimos;
import presentacion.IOManager;

/**
 * 4)	Desarrollar un programa que permita ingresar por teclado un número e indique si es primo o no. Reutilizar la función del ejercicio anterior.
 */
public class NumeroPrimo {

    public void run() {
        IOManager io = new IOManager();
        io.print("Ingrese un entero: ");
        int n = io.getInt();
        System.out.println("El número " + n + " es primo? " + NumerosPrimos.esPrimo(n));
    }
}
